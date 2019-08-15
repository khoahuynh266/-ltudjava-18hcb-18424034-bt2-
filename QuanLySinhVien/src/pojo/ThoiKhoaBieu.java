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
public class ThoiKhoaBieu implements java.io.Serializable {
    private int id;
    private String maMonHoc;
    private String tenMonHoc;
    private String tenLop;
     private String phongHoc;
     private String hocKy;
     private String namHoc;
    
    public ThoiKhoaBieu(){
        this.maMonHoc= "";
        this.tenMonHoc= "";
        this.tenLop = "";
           this.phongHoc= "";
        this.hocKy = "";
           this.namHoc= "";
    } 
    public ThoiKhoaBieu(String maMonHoc, String tenMonHoc, String tenLop, String phongHoc, String hocKy, String namHoc){
        this.maMonHoc= "";
        this.tenMonHoc= "";
        this.tenLop = "";
           this.phongHoc= "";
        this.hocKy = "";
           this.namHoc= "";
    }
     
    public String getMaMonHoc() {
        return this.maMonHoc;
    }
    
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    public String getTenMonHoc() {
        return this.tenMonHoc;
    }
    
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    public String getMaLop() {
        return this.tenLop;
    }
    
    public void setMaLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public String getPhongHoc() {
        return this.phongHoc;
    }
    
    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
    public String getHocKy() {
        return this.hocKy;
    }
    
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }
    public String getNamHoc() {
        return this.namHoc;
    }
    
    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }
}