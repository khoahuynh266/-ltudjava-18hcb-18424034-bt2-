/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Lop_MonHoc;
import pojo.SinhVien;
import ulti.HibernateUtil;

/**
 *
 * @author yumil
 */
public class Lop_MonHocDAO {
     public static List<SinhVien> getListSinhVien(String tenLopMH) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<SinhVien> listSinhVien = null;
        
        try {
            String hql = "select sv";
            hql += " from Lop_MonHoc lop_MonHoc, SinhVien sv";
            hql += " where lop_MonHoc.tenLopMH=:tenLopMH and lop_MonHoc.maSinhVien=sv.MSSV";
            Query query = session.createQuery(hql);
            query.setParameter("tenLopMH", tenLopMH);
            listSinhVien =  query.list();
            System.out.printf("get list ok");
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return listSinhVien;
    }
    public static List<Lop_MonHoc> getListLopMH() {
        Session session = HibernateUtil.getSessionFactory().openSession();
   List<Lop_MonHoc> listSinhVien = null;
        try {
            String hql = "SELECT distinct tenLopMH";
            hql += " from Lop_MonHoc";
            Query query = session.createQuery(hql);
            listSinhVien =  query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return listSinhVien;
    }
    public static Lop_MonHoc getLop_MonHoc(String tenLopMH, String maSinhVien) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Lop_MonHoc> result = null;

        try {
            String hql = "select d";
            hql += " from Lop_MonHoc d";
            hql += " where d.tenLopMH=:tenLopMH and d.maSinhVien=:maSinhVien";
            Query query = session.createQuery(hql);
            query.setParameter("tenLopMH", tenLopMH);
            query.setParameter("maSinhVien", maSinhVien);
            result = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        if(result.size() > 0) {
            return result.get(0);
        }
        
        return null;
    }
     public static Lop_MonHoc getSinhVien(Lop_MonHoc lmh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Lop_MonHoc lop_MonHoc = null;
        try {
            lop_MonHoc = (Lop_MonHoc) session.get(Lop_MonHoc.class, lmh);
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return lop_MonHoc;
    }
    
      public static Lop_MonHoc getLop_MonHoc(String tenLop) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Lop_MonHoc lh = null;
        try {
            lh = (Lop_MonHoc) session.get(Lop_MonHoc.class, tenLop);
           
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lh;
    }
    public static boolean addSinhVien(Lop_MonHoc lop_MonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        if(Lop_MonHocDAO.getSinhVien(lop_MonHoc) != null) {
//            return false;
//        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lop_MonHoc);
            transaction.commit();
            System.err.printf("add sv ok");
        } catch (HibernateException ex) {
           System.err.println(ex);
        } finally {
            session.close();
        }
        
        return true;
    }
   
    public static boolean deleteSinhVien(Lop_MonHoc lop_MonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.delete(lop_MonHoc);
            transaction.commit();
            System.out.printf("xoa sv ok");
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
