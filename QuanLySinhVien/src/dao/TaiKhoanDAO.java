/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.TaiKhoan;
import ulti.HibernateUtil;

/**
 *
 * @author yumil
 */
public class TaiKhoanDAO {
    
    public static TaiKhoan getTaiKhoan(String tenTaiKhoan) {
        TaiKhoan tk = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tk = (TaiKhoan) session.get(TaiKhoan.class, tenTaiKhoan);
        } catch (HibernateException ex) {
            //Log the exception             
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tk;
    }
    
    public static boolean updateTaiKhoan(TaiKhoan a) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(TaiKhoanDAO.getTaiKhoan(a.getTenTaiKhoan()) == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(a);
            transaction.commit();
        } catch(HibernateException ex) {
            //Log the exception  
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}

