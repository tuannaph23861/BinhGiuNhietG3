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

/**
 *
 * @author dungd
 */
@Entity
@Table(name = "HoaDon")

public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "MaHoaDon")
    private int maHoaDon;
    
    @Column(name = "TienSauGiamGia")
    private float tienSauGiamGia;
    
    @Column(name = "ThanhTien")
    private float thanhTien;
    
    @Column(name = "PhuongThucThanhToan")
    private int phuongThucThanhToan;
//     @Column(name="NgayThanhToan")
//    private date ngayThanhToan ;

    @ManyToOne
    @JoinColumn(name = "IdKhachHang")
    private int idKhachHang;

    @ManyToOne
    @JoinColumn(name = "IdNhanVien")
    private int idNhanVien;

    @ManyToOne
    @JoinColumn(name = "IdKhuyenMai")
    private int idKhuyenMai;

    public HoaDon() {
    }

    public HoaDon(int id, int maHoaDon, float tienSauGiamGia, float thanhTien, int phuongThucThanhToan, int idKhachHang, int idNhanVien, int idKhuyenMai) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.tienSauGiamGia = tienSauGiamGia;
        this.thanhTien = thanhTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idKhuyenMai = idKhuyenMai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public float getTienSauGiamGia() {
        return tienSauGiamGia;
    }

    public void setTienSauGiamGia(float tienSauGiamGia) {
        this.tienSauGiamGia = tienSauGiamGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(int phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(int idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", maHoaDon=" + maHoaDon + ", tienSauGiamGia=" + tienSauGiamGia + ", thanhTien=" + thanhTien + ", phuongThucThanhToan=" + phuongThucThanhToan + ", idKhachHang=" + idKhachHang + ", idNhanVien=" + idNhanVien + ", idKhuyenMai=" + idKhuyenMai + '}';
    }
    
    

}
