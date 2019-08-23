/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import dao.SinhVienDAO;
import java.util.List;
import pojo.SinhVien;

/**
 *
 * @author yumil
 */
public class QuanLySinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // new Login().setVisible(true);
        List<SinhVien> ds=SinhVienDAO.layDanhSachSinhVien();   
        for (SinhVien sv : ds) {
            System.out.println("MSSV: "+sv.getMSSV());
            System.out.println("Họ và tên: "+sv.getHoTen());    
            System.out.println("CMND: " + sv.getCMND());
            System.out.println("Giới  : "+ sv.getGioiTinh());
        }   
    }
}
