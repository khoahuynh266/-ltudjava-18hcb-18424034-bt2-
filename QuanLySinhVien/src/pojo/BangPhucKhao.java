/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


/**
 *
 * @author yumil
 */
public class BangPhucKhao {
   private int id;
    private String hocKy;
    private String namHoc;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int trangThai;
    
     public BangPhucKhao(String hocKy, String namHoc, String ngayBatDau, String ngayKetThuc, int trangThai) {
        this.hocKy = hocKy;
        this.namHoc = namHoc;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }
      public BangPhucKhao() {
        this.hocKy = "";
        this.namHoc = "";
        this.ngayBatDau = null;
        this.ngayKetThuc = null;
        this.trangThai = -1;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getNamHoc() {
        return namHoc;
    }

   

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
 
}
