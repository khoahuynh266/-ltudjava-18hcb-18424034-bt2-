/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import quanlysinhvien.QuanLyPhucKhao;

/**
 *
 * @author yumil
 */
public class PhucKhao {

    public PhucKhao() {
        this.mssv = "";
        this.hoTen = "";
        this.monHoc = "";
        this.cotDiem = "";
        this.diemMongMuon = 0.0;
        this.lyDo = "";
    }

    public PhucKhao(String mssv, String hoTen, String monHoc, String cotDiem, Double diemMongMuon, String lyDo, int idBangPhucKhao) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.monHoc = monHoc;
        this.cotDiem = cotDiem;
        this.diemMongMuon = diemMongMuon;
        this.lyDo = lyDo;
        this.idBangPhucKhao = idBangPhucKhao;
    }

    public PhucKhao(String mssv, String hoTen, String monHoc, String cotDiem, Double diemMongMuon, String lyDo) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.monHoc = monHoc;
        this.cotDiem = cotDiem;
        this.diemMongMuon = diemMongMuon;
        this.lyDo = lyDo;
    }

    public PhucKhao(QuanLyPhucKhao aThis, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCotDiem() {
        return cotDiem;
    }

    public void setCotDiem(String cotDiem) {
        this.cotDiem = cotDiem;
    }

    public Double getDiemMongMuon() {
        return diemMongMuon;
    }

    public void setDiemMongMuon(Double diemMongMuon) {
        this.diemMongMuon = diemMongMuon;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdBangPhucKhao() {
        return idBangPhucKhao;
    }

    public void setIdBangPhucKhao(int idBangPhucKhao) {
        this.idBangPhucKhao = idBangPhucKhao;
    }

    public PhucKhao(String mssv, String hoTen, String monHoc, String cotDiem, Double diemMongMuon, String lyDo, String trangThai, int idBangPhucKhao) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.monHoc = monHoc;
        this.cotDiem = cotDiem;
        this.diemMongMuon = diemMongMuon;
        this.lyDo = lyDo;
        this.trangThai = trangThai;
        this.idBangPhucKhao = idBangPhucKhao;
    }
      private int id;
    private String mssv;
    private String hoTen;
    private String monHoc;
    private String cotDiem;
    private Double diemMongMuon;
    private String lyDo;
    private String trangThai;
    private int idBangPhucKhao;
}
