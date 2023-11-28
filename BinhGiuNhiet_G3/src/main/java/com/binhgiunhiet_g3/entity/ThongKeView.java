/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.entity;

/**
 *
 * @author dungd
 */
public class ThongKeView {
     private String thang;
    private double doanhThu;
    private int soLuongDon;

    public ThongKeView() {
    }

    public ThongKeView(String thang, double doanhThu, int soLuongDon) {
        this.thang = thang;
        this.doanhThu = doanhThu;
        this.soLuongDon = soLuongDon;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getSoLuongDon() {
        return soLuongDon;
    }

    public void setSoLuongDon(int soLuongDon) {
        this.soLuongDon = soLuongDon;
    }

    @Override
    public String toString() {
        return "ThongKeView{" + "thang=" + thang + ", doanhThu=" + doanhThu + ", soLuongDon=" + soLuongDon + '}';
    }
    
}
