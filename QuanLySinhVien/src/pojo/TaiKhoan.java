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
    private String tenLop;
    private int per; // 1 la giao vu 0 la sv
    
    public TaiKhoan(){
        this.tenTaiKhoan = "";
        this.matKhau = "";
        this.tenLop = "";
        this.per = -1; 
    }
    
    public TaiKhoan(String tenTaiKhoan, String pass, String lop, int per){
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = pass;
        this.tenLop = lop;
        this.per = per;
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

    public int getQuyen() {
        return per;
    }

    public void setQuyen(int per) {
        this.per = per;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public boolean checkTaiKhoan(String tenTaiKhoan) {
        boolean result = false;
        if (this.tenTaiKhoan.equals(tenTaiKhoan)) {
            result = true;
        }
        return result;
    }
}
