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
@Table(name = "GioHangChiTiet")
public class GioHangChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    
     @Column(name = "SoLuong")
    private int soLuong;
    @ManyToOne
    @JoinColumn(name = "IdBinhGiuNhietChiTiet")
    private int idBinhGiuNhietChiTiet;
    @ManyToOne
    @JoinColumn(name = "IdGioHang")
    private int idGioHang;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(int id, int soLuong, int idBinhGiuNhietChiTiet, int idGioHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.idBinhGiuNhietChiTiet = idBinhGiuNhietChiTiet;
        this.idGioHang = idGioHang;
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

    public int getIdBinhGiuNhietChiTiet() {
        return idBinhGiuNhietChiTiet;
    }

    public void setIdBinhGiuNhietChiTiet(int idBinhGiuNhietChiTiet) {
        this.idBinhGiuNhietChiTiet = idBinhGiuNhietChiTiet;
    }

    public int getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(int idGioHang) {
        this.idGioHang = idGioHang;
    }

    @Override
    public String toString() {
        return "GioHangChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", idBinhGiuNhietChiTiet=" + idBinhGiuNhietChiTiet + ", idGioHang=" + idGioHang + '}';
    }
    

}
