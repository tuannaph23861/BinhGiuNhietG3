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
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonGia")
    private float donGia;

    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private int idhoaDon;

    @ManyToOne
    @JoinColumn(name = "IdChiTietSanPham")
    private int idbinhGiuNhietChiTiet;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int id, int soLuong, float donGia, int idhoaDon, int idbinhGiuNhietChiTiet) {
        this.id = id;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.idhoaDon = idhoaDon;
        this.idbinhGiuNhietChiTiet = idbinhGiuNhietChiTiet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getIdhoaDon() {
        return idhoaDon;
    }

    public void setIdhoaDon(int idhoaDon) {
        this.idhoaDon = idhoaDon;
    }

    public int getIdbinhGiuNhietChiTiet() {
        return idbinhGiuNhietChiTiet;
    }

    public void setIdbinhGiuNhietChiTiet(int idbinhGiuNhietChiTiet) {
        this.idbinhGiuNhietChiTiet = idbinhGiuNhietChiTiet;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", donGia=" + donGia + ", idhoaDon=" + idhoaDon + ", idbinhGiuNhietChiTiet=" + idbinhGiuNhietChiTiet + '}';
    }

}
