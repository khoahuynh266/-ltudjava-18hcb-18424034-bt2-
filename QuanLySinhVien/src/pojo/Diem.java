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
    private float diemGK;
    private float diemCK;
    private float diemKhac;
    private float diemTong;
    private SinhVien sv = new SinhVien();
    
    public Diem(){
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
    
    public SinhVien getSV() {
        return sv;
    }

    public void setSV(SinhVien sv) {
        this.sv = sv;
    }
    
    public float getDiemGK(){
        return this.diemGK;
    }
    
    public void setDiemGK(float diemGK){
        this.diemGK = diemGK;
    }
    
    public float getDiemCK(){
        return this.diemCK;
    }
    
    public void setDiemCK(float diemCK){
        this.diemCK = diemCK;
    }
    
    public float getDiemKhac(){
        return this.diemKhac;
    }
    
    public void setDiemKhac(float diemKhac){
        this.diemKhac = diemKhac;
    }
    
    public float getDiemTong(){
        return this.diemTong;
    }
    
    public void setDiemTong(float diemTong){
        this.diemTong = diemTong;
    }
    
    public String xepLoai(){
        if(this.diemTong >= 0 && this.diemTong < 5){
            return "Rớt";
        }
        return "Đậu";
    }
    
}
