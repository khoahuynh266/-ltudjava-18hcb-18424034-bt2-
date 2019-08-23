/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yumil
 */

public class LopHoc  implements java.io.Serializable {
    private String tenLop;
    private Set<SinhVien> listSinhVien = new HashSet<SinhVien>(0);
    private ArrayList<ThoiKhoaBieu> listThoiKhoaBieu = new ArrayList<ThoiKhoaBieu>();
    public LopHoc() {
    }

    public LopHoc(String tenLop) {
       this.tenLop = tenLop;
    }
   
    public String getTenLop() {
        return this.tenLop;
    }
    
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Set<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void setListSinhVien(Set<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    public ArrayList<ThoiKhoaBieu> getListThoiKhoaBieu() {
        return listThoiKhoaBieu;
    }

    public void setListThoiKhoaBieu(ArrayList<ThoiKhoaBieu> listThoiKhoaBieu) {
        this.listThoiKhoaBieu = listThoiKhoaBieu;
    }

    
    
}