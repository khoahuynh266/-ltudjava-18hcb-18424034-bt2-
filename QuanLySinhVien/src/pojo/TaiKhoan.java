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
public class TaiKhoan implements java.io.Serializable {
    private String tenTaiKhoan;
    private String matKhau;
    private int per; // 1 la giao vu 0 la sv
    
    public TaiKhoan(){
        this.tenTaiKhoan = "";
        this.matKhau = "";
        this.per = -1; 
    }
    
    
    public TaiKhoan(String tenTaiKhoan, String mk, int per) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = mk;
        this.per = per;
    }

    public String getTenTaiKhoan() {
        return this.tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String mk) {
        this.matKhau = mk;
    }

    public int getPer() {
        return this.per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public boolean checkTaiKhoan(String tenTaiKhoan) {
        boolean result = false;
        if (this.tenTaiKhoan.equals(tenTaiKhoan)) {
            result = true;
        }
        return result;
    }
}
