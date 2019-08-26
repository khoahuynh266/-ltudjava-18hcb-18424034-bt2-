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
    private String MSSV;
    private String tenLopMonHoc;
    private float diemGK;
    private float diemCK;
    private float diemKhac;
    private float diemTong;

    public Diem(int id, String MSSV, String tenLopMonHoc, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.id = id;
        this.MSSV = MSSV;
        this.tenLopMonHoc = tenLopMonHoc;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
    }
  
    

    public Diem() {
        this.MSSV = null;
        this.diemGK = 0;
        this.diemCK = 0;
        this.diemKhac = 0;
        this.diemTong = 0;
    }

    public Diem(String MSSV, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.MSSV = MSSV;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        this.diemKhac = diemKhac;
        this.diemTong = diemTong;
    }

    public Diem(String MSSV, String tenLopMonHoc, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.MSSV = MSSV;
        this.tenLopMonHoc = tenLopMonHoc;
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

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String xepLoai() {
        if (this.diemTong >= 0 && this.diemTong < 5) {
            return "Rớt";
        }
        return "Đậu";
    }
      
    public boolean kiemTraDau() {
        if(this.diemTong < 5) {
            return false;
        }
        
        return true;
    }
    

}
