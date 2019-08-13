/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;

/**
 *
 * @author yumil
 */
public class Lop_MonHoc implements java.io.Serializable {
    private String tenLopMH;
    private String maMonHoc;
    private ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    private ArrayList<Diem> listDiem = new ArrayList<Diem>();
    public Lop_MonHoc(){
        this.tenLopMH = "";
    }
     public Lop_MonHoc(String ten){
        this.tenLopMH = ten;
    }
    public String getTenLopMH(){
        return this.tenLopMH;
    }
    public void setTenLopMH(String name){
        this.tenLopMH = name;
    }
    
    public String getMaMonHoc(){
        return this.maMonHoc;
    }
    
    public void setMaMonHoc(String id){
        this.maMonHoc = id;
    }
    
    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(ArrayList<SinhVien> list) {
        this.listSV = (ArrayList<SinhVien>) list.clone();
    }
    
    public boolean isExists(String name, String id) {
        if (this.tenLopMH.equalsIgnoreCase(name+"-"+id) && this.maMonHoc.equalsIgnoreCase(id)) {
            return true;
        }
        return false;
    }
      public boolean isExists(String name) {
        if (this.tenLopMH.equalsIgnoreCase(name)) {
            return true;
        }
        return false;
    }
    public void themSV(SinhVien sv){
        this.listSV.add(sv);
    }   
    public void xoaSV(SinhVien sv){
        this.listSV.remove(sv);
    }
    
    
    public ArrayList<Diem> getListDiem() {
        return this.listDiem;
    }
    
    public void setListDiemSV(ArrayList<Diem> listDiem) {
        this.listDiem = (ArrayList<Diem>) listDiem.clone();
    }
    
    public Diem getDiemSV(String mssv) {
        Diem result = null;

        for (Diem diemSV : this.listDiem) {
            if (diemSV.getSV().isExistsSV(mssv)) {
                result = diemSV;
            }
        }

        return result;
    }
    
    public void setDiem(Diem diem, String mssv) {
        for (Diem diemSV : this.listDiem) {
            if (diemSV.getSV().isExistsSV(mssv)) {
                this.listDiem.set(this.listDiem.indexOf(diemSV), diem);
            }
        }
    }
       
    public int tongDau(){
        int result = 0;
        if (this.listDiem.size() > 0) {
            for (Diem item : this.listDiem) {//                
                if (item.getDiemTong() >= 5) {
                    result += 1;
                }
            }
        }
        return result;
    }
    
    public int tongRot(){
        int result = 0;
        if (this.listDiem.size() > 0) {
            for (Diem item : this.listDiem) {
                if (item.getDiemTong() < 5) {
                    result += 1;
                }
            }
        }
        return result;
    }
    
    public float tiLeDau(){
        float result = 0;
        int tongDau = this.tongDau();
        result = (tongDau * 100) / this.listDiem.size();
        return result;
    }
    
    public float tiLeRot(){
        float result = 0;
        int tongRot = this.tongRot();
        result = (tongRot * 100) / this.listDiem.size();
        return result;
    }
}