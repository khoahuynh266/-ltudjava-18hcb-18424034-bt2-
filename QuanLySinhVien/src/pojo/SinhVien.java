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
    private String hoTen;
    private int gioiTinh; 
    private String CMND;    
    
    public SinhVien(){
        this.maSinhVien = "";
        this.hoTen = "";
        this.gioiTinh = -1;
        this.CMND = "";
    }
    public SinhVien(String maSinhVien, String hoTen, String CMND){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.CMND = CMND;
    }
    public SinhVien(String maSinhVien, String hoTen, int gioiTinh, String CMND){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
    }
    
     public SinhVien(String maSinhVien, String hoTen){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gioiTinh = -1;
        this.CMND = "";
    }
    public String getmaSinhVien(){
        return this.maSinhVien;
    }
    public void setmaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    
    
    public String getTen(){
        return this.hoTen;
    }
    public void setTen(String fullname) {
        this.hoTen = fullname;
    }
    
    public int getGioiTinh(){
        return this.gioiTinh;
    }
    public void setGioiTinh(int sex) {
        this.gioiTinh = sex;
    }
    
    public String getCMND() {
        return CMND;
    }
    public void setCMND(String cmnd) {
        this.CMND = cmnd;
    }
 public boolean isExistsSV(String mssv) {
        boolean result = false;
        if(this.maSinhVien.equalsIgnoreCase(mssv)) {
            result = true;
        }
        return result;
    }
}
