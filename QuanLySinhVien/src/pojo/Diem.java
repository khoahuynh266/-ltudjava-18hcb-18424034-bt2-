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
public class Diem implements java.io.Serializable {

    private int id;
    private String tenLopMonHoc;
    private SinhVien sinhvien;
    private float diemGK;
    private float diemCK;
    private float diemKhac;
    private float diemTong;
    private SinhVien sv = new SinhVien();

    public Diem() {
        this.sv = null;
        this.diemGK = 0;
        this.diemCK = 0;
        this.diemKhac = 0;
        this.diemTong = 0;
    }

    public Diem(SinhVien sv, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.sv = sv;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLopMonHoc() {
        return tenLopMonHoc;
    }

    public void setTenLopMonHoc(String tenLopMonHoc) {
        this.tenLopMonHoc = tenLopMonHoc;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public float getDiemGK() {
        return diemGK;
    }

    public void setDiemGK(float diemGK) {
        this.diemGK = diemGK;
    }

    public float getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(float diemCK) {
        this.diemCK = diemCK;
    }

    public float getDiemKhac() {
        return diemKhac;
    }

    public void setDiemKhac(float diemKhac) {
        this.diemKhac = diemKhac;
    }

    public float getDiemTong() {
        return diemTong;
    }

    public void setDiemTong(float diemTong) {
        this.diemTong = diemTong;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String xepLoai() {
        if (this.diemTong >= 0 && this.diemTong < 5) {
            return "Rớt";
        }
        return "Đậu";
    }

}
