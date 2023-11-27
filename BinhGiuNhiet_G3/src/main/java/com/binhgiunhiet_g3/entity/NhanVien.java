/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "NhanVien")

public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    
    @Column(name = "MaNhanVien ")
    private String ma;
    
    @Column(name = "Ten ")
    private String ten;
    
    @Column(name = "GioiTInh ")
    private Boolean gioiTinh;
    @Column(name = "NgaySinh ")
    private Date ngaySinh;
    @Column(name = "DiaChi ")
    private String diaChi;
    @Column(name = "MatKhau ")
    private String matKhau;
    @Column(name = "Email ")
    private String email;
    @Column(name = "ChucVu ")
    private int chucVu;
    @Column(name = "SoDienThoai ")
    private String sdt;
    @Column(name = "TrangThai ")
    private Boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(int id, String ma, String ten, Boolean gioiTinh, Date ngaySinh, String diaChi, String matKhau, String email, int chucVu, String sdt, Boolean trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.email = email;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
 public Object[] toRowData() {
        return new Object[]{
            id, ma, ten, gioiTinhNV(), ngaySinh,diaChi,matKhau,email,chucVuNV(),sdt,trangThaiNV()
        };
    }
 public String trangThaiNV() {
        if (trangThai == true) {
            return "Đang Đi Làm";
        } else {
            return "Nghỉ Phép";
        }
    }
 public String gioiTinhNV() {
        if (gioiTinh == true) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }
  public String chucVuNV() {
        if (chucVu == 1) {
            return "Admin";
        } else {
            return "Nhân Viên";
        }
    }
 
    
    
}
