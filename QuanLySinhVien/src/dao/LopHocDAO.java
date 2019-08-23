/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.LopHoc;
import pojo.ThoiKhoaBieu;
import ulti.HibernateUtil;


/**
 *
 * @author yumil
 */
public class LopHocDAO {
   
      public static List<LopHoc> getListLopHoc() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<LopHoc> listLopHoc = null;
        try {
            String hql = "select lh from LopHoc lh";
            Query query = session.createQuery(hql);
            listLopHoc = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listLopHoc;
    }
    
    public static ArrayList<ThoiKhoaBieu> getListThoiKhoaBieu(String tenLop) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ArrayList<ThoiKhoaBieu> listThoiKhoaBieu = null;
        try {
            String hql = "select tkb"; 
            hql += " from ThoiKhoaBieu tkb";
            hql += " where tkb.tenLop=:tenLop";
            Query query = session.createQuery(hql);
            query.setParameter("tenLop", tenLop);
            listThoiKhoaBieu = (ArrayList<ThoiKhoaBieu>) query.list();
            System.out.print("get list tkb ok");
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return listThoiKhoaBieu;
    }

    public static LopHoc getLopHoc(String tenLop) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LopHoc lh = null;
        try {
            lh = (LopHoc) session.get(LopHoc.class, tenLop);
           
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lh;
    }

    public static boolean themLopHoc(LopHoc lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(LopHocDAO.getLopHoc(lh.getTenLop()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lh);
            transaction.commit();
            System.out.print("ok\n");
        } catch(HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public static boolean updateLopHoc(LopHoc lh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(LopHocDAO.getLopHoc(lh.getTenLop()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(lh);
            transaction.commit();
            System.out.print(" update LH ok\n");
        } catch(HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
