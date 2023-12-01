/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.ThongKeView;
import java.util.List;

/**
 *
 * @author dungd
 */
public interface ThongKeService {
    List<ThongKeView> getList(int nam);

    List<ThongKeView> getTongDonHang(String ngayBD, String ngayKT);

    List<ThongKeView> getTongDonHangByPTTT(String ngayBD, String ngayKT, int trangThai);

    List<ThongKeView> doanhThuNgay(String ngayBD, String ngayKT);
//
//    List<ThongKeView> doanhThuThang(String nam, String thang);
    
//    Double doanhThuThang(String nam, String thang);
      Double doanhThuThang(int nam, int thang);

    List<Double> doanhThuNam(String nam);

    List<Long> getDonHangThang(int nam, int thang, int trangThai);
    
}
