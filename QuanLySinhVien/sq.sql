create database quanlysinhvien
use  quanlysinhvien
CREATE TABLE TaiKhoan(
   ID bigint ,
   TenTaiKhoan nvarchar(50) not null,
   MatKhau nvarchar(50) not null,
   Per int,
   PRIMARY KEY(ID)
);
CREATE TABLE SinhVien(
   MSSV nvarchar(20),
   HoTen nvarchar(50) ,
   GioiTinh nvarchar(50),
   CMND nvarchar(10),
   PRIMARY KEY(MSSV)
);

CREATE TABLE LopHoc(
   TenLop nvarchar(50) ,
   SoSinhVien int,
   PRIMARY KEY(TenLop)
);

CREATE TABLE MonHoc(
   MaMonHoc nvarchar(10),
   TenMonHoc nvarchar(50),
   PRIMARY KEY(MaMonHoc)
);


CREATE TABLE ThoiKhoaBieu(
  ID bigint ,
   MaMonHoc nvarchar(10),
   TenMonHoc nvarchar(50),
   TenLop nvarchar(50),
   PhongHoc nvarchar(50),
   HocKy nvarchar(50),
   NamHoc nvarchar(50),
   PRIMARY KEY(ID)
);
CREATE TABLE `quanlysinhvien`.`bangphuckhao` (
  `id` INT NOT NULL,
  `HocKy` VARCHAR(45) NOT NULL,
  `NamHoc` VARCHAR(45) NOT NULL,
  `NgayBatDau` DATE NOT NULL,
  `NgayKetThuc` DATE NOT NULL,
  `TrangThai` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `quanlysinhvien`.`phuckhao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `MSSV` VARCHAR(45) NOT NULL,
  `HoTen` VARCHAR(45) NULL,
  `MonHoc` VARCHAR(45) NOT NULL,
  `CotDiem` VARCHAR(45) NOT NULL,
  `DiemMonmuon` FLOAT NOT NULL,
  `LyDo` VARCHAR(500) NULL,
  `TrangThai` VARCHAR(45) NOT NULL,
  `IdBangPhucKhao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE ThoiKhoaBieu ADD CONSTRAINT fk_Lop_TKB
FOREIGN KEY(TenLop) REFERENCES LopHoc(TenLop);

ALTER TABLE SinhVien ADD CONSTRAINT fk_Lop_SinhVien
FOREIGN KEY(TenLop) REFERENCES LopHoc(TenLop);



