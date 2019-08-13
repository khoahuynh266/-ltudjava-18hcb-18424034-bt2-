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

public class MonHoc implements java.io.Serializable {
    private String maMonHoc;
    private String tenMonHoc;
    
    public MonHoc(){
        this.maMonHoc = "";
        this.tenMonHoc = "";
    }
    
    public MonHoc(String maMH, String tenMH){
        this.maMonHoc = maMH;
        this.tenMonHoc = tenMH;
    }
    
    public String getMaMH(){
        return this.maMonHoc;
    }
    
    public void setMaMH(String maMH){
        this.maMonHoc = maMH;
    }
    
    public String getTenMH(){
        return this.tenMonHoc;
    }
    
    public void setTenMH(String tenMH){
        this.tenMonHoc = tenMH;
    }    
}