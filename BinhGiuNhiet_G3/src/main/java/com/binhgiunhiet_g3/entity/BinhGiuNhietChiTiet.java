package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name = "BinhGiuNhietChiTiet")
public class BinhGiuNhietChiTiet {
    
    @Id
    @Column(name = "Id")
    private int id;
    
    @Column(name = "SoLuong")
    private int soLuong;
    
    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
    
    @Column(name = "GiaBan")
    private BigDecimal giaBan;
    
    @Column(name = "TrangThai")
    private byte trangThai;
    
    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private int idMauSac;
    
    @ManyToOne
    @JoinColumn(name = "IdBinhGiuNhiet")
    private int idBinhGiuNhiet;

    public BinhGiuNhietChiTiet() {
    }

    public BinhGiuNhietChiTiet(int id, int soLuong, BigDecimal giaNhap, BigDecimal giaBan, byte trangThai, int idMauSac, int idBinhGiuNhiet) {
        this.id = id;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.idMauSac = idMauSac;
        this.idBinhGiuNhiet = idBinhGiuNhiet;
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

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public int getIdBinhGiuNhiet() {
        return idBinhGiuNhiet;
    }

    public void setIdBinhGiuNhiet(int idBinhGiuNhiet) {
        this.idBinhGiuNhiet = idBinhGiuNhiet;
    }

    @Override
    public String toString() {
        return "BinhGiuNhietChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", trangThai=" + trangThai + ", idMauSac=" + idMauSac + ", idBinhGiuNhiet=" + idBinhGiuNhiet + '}';
    }
     
    
}
