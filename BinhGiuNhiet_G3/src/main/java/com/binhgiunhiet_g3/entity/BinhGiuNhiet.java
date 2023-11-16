/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author PC
 */

@Entity
@Table(name = "BinhGiuNhiet")
public class BinhGiuNhiet {
    
    @Id
    @Column(name="Id")
    private int id;
    
    @Column(name="MaBinhGiuNhiet")
    private String ma;
    
    @Column(name="NamSanXuat")
    private int namSanXuat;
    
    @Column(name="DungTich")
    private int dungTich;
    
    @Column(name="Ten")
    private String ten;
    
    @Column(name="UrlAnh")
    private String url;
    
    @ManyToOne
    @JoinColumn(name = "IdThuongHieu")
    private int idThuongHieu;
    
    @ManyToOne
    @JoinColumn(name = "IdChatLieu")
    private int idChatLieu;

    public BinhGiuNhiet() {
    }

    public BinhGiuNhiet(int id, String ma, int namSanXuat, int dungTich, String ten, String url, int idThuongHieu, int idChatLieu) {
        this.id = id;
        this.ma = ma;
        this.namSanXuat = namSanXuat;
        this.dungTich = dungTich;
        this.ten = ten;
        this.url = url;
        this.idThuongHieu = idThuongHieu;
        this.idChatLieu = idChatLieu;
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

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(int idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public int getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(int idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    @Override
    public String toString() {
        return "BinhGiuNhiet{" + "id=" + id + ", ma=" + ma + ", namSanXuat=" + namSanXuat + ", dungTich=" + dungTich + ", ten=" + ten + ", url=" + url + ", idThuongHieu=" + idThuongHieu + ", idChatLieu=" + idChatLieu + '}';
    }
    
    
}
