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
public class SinhVien implements java.io.Serializable {

    private String maSinhVien;
    private String hoVaTen;
    private String gioiTinh;
    private String cmnd;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoVaTen, String gioiTinh, String cmnd) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getMaSinhVien() {
        return this.maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return this.gioiTinh;
    }

    public void setNgaySinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return this.cmnd;
    }

    public void setDiaChi(String cmnd) {
        this.cmnd = cmnd;
    }
}
