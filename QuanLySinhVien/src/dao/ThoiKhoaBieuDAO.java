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
import pojo.ThoiKhoaBieu;
import ulti.HibernateUtil;

/**
 *
 * @author yumil
 */
public class ThoiKhoaBieuDAO {
     public static boolean createThoiKhoaBieu(ThoiKhoaBieu tkb) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(tkb);
            transaction.commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }

    public static ThoiKhoaBieu getThoiKhoaBieu(String tenLop, String maMonHoc) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ThoiKhoaBieu> listCourse = null;
        
        try {
            String hql = "select tkb";
            hql += " from ThoiKhoaBieu tkb";
            hql += " where tkb.tenLop=:tenLop and tkb.maMonHoc=:maMonHoc";
            Query query = session.createQuery(hql);
            query.setParameter("tenLop", tenLop);
            query.setParameter("maMonHoc", maMonHoc);
            listCourse = query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        if(listCourse.size() > 0) {
            return listCourse.get(0);
        }
        
        return null;
    }
    
    public static List<ThoiKhoaBieu> getListThoiKhoaBieu(String tenLop) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ThoiKhoaBieu> result = null;
        
        try {
            String hql = "select tkb from ThoiKhoaBieu tkb";
            hql += " where tkb.tenLop=:tenLop";
            Query query = session.createQuery(hql);
            query.setParameter("tenLop", tenLop);
            result = query.list();
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        
        return result;
    }
}
