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
import pojo.Diem;
import pojo.SinhVien;
import ulti.HibernateUtil;

/**
 *
 * @author yumil
 */
public class DiemDAO {
     public static Diem getDiem(String tenLopMonHoc, String MSSV) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Diem> result = null;

        try {
            String hql = "select d";
            hql += " from Diem d";
            hql += " where d.tenLopMonHoc=:tenLopMonHoc and d.MSSV=:MSSV";
            Query query = session.createQuery(hql);
            query.setParameter("tenLopMonHoc", tenLopMonHoc);
            query.setParameter("MSSV", MSSV);
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

     public static List<Diem> getListDiem(String tenLopMonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Diem> listDiem = null;
        
        try {
            String hql = "select d";
            hql += " from Diem d";
            hql += " where d.tenLopMonHoc=:tenLopMonHoc";
            Query query = session.createQuery(hql);
            query.setParameter("tenLopMonHoc", tenLopMonHoc);
            listDiem =  query.list();
            System.out.printf("get list ok");
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return listDiem;
    }
    

    public static boolean createDiem(Diem d) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(d);
            transaction.commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }

    public static boolean updateDiem(Diem d) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.print(d.getMSSV()+ "" + d.getTenLopMonHoc());
                Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(d);
            System.out.printf("update diem");
            transaction.commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }
}
 