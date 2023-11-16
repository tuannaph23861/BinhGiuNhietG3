/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author Fuyusaki
 */
@Entity
@Table(name = "BinhGiuNhietChiTiet")
public class MauSac {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "MaThuongHieu")
    private int maChatLieu;

    @Column(name = "Ten")
    private int ten;

    public MauSac() {
    }

    public MauSac(int id, int maChatLieu, int ten) {
        this.id = id;
        this.maChatLieu = maChatLieu;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(int maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "MauSac{" + "id=" + id + ", maChatLieu=" + maChatLieu + ", ten=" + ten + '}';
    }

}
