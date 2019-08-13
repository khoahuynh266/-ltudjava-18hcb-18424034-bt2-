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

    private String MSSV;
    private String hoTen;
    private int gioiTinh; 
    private String CMND;    
    
    public SinhVien(){
        this.MSSV = "";
        this.hoTen = "";
        this.gioiTinh = -1;
        this.CMND = "";
    }
    public SinhVien(String MSSV, String hoTen, String CMND){
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.CMND = CMND;
    }
    public SinhVien(String MSSV, String hoTen, int gioiTinh, String CMND){
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
    }
    
     public SinhVien(String MSSV, String hoTen){
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.gioiTinh = -1;
        this.CMND = "";
    }
    public String getMSSV(){
        return this.MSSV;
    }
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
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
        if(this.MSSV.equalsIgnoreCase(mssv)) {
            result = true;
        }
        return result;
    }
}
