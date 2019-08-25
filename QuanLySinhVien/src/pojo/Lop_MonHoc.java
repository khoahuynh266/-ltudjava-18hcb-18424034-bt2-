/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yumil
 */
public class Lop_MonHoc implements java.io.Serializable {
    private int id;
    private String tenLopMH;
    private String maSinhVien;
    private Set<SinhVien> listSV = new HashSet<SinhVien>();

    public Lop_MonHoc() {
         this.tenLopMH = "";
        this.maSinhVien = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lop_MonHoc(String tenLopMH, String maSinhVien) {
        this.tenLopMH = tenLopMH;
        this.maSinhVien = maSinhVien;
    }

    public String getTenLopMH() {
        return tenLopMH;
    }

    public void setTenLopMH(String tenLopMH) {
        this.tenLopMH = tenLopMH;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Set<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(Set<SinhVien> listSV) {
        this.listSV = listSV;
    }

    
    public void themSV(SinhVien sv){
        this.listSV.add(sv);
    }   
    public void xoaSV(SinhVien sv){
        this.listSV.remove(sv);
    }
    
}