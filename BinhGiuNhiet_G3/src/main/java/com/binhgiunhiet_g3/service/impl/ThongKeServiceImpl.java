/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.ThongKeView;
import com.binhgiunhiet_g3.repository.ThongKeRepository;
import com.binhgiunhiet_g3.service.ThongKeService;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dungd
 */
public class ThongKeServiceImpl implements ThongKeService{
    ThongKeRepository thongKeRepository = new ThongKeRepository();
    @Override
    public List<ThongKeView> getList(int nam) {
        return thongKeRepository.getList(nam);
   }

    @Override
    public List<ThongKeView> getTongDonHang(String ngayBD, String ngayKT) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            return thongKeRepository.getTongDonHang(ngayBD, ngayKT);
        } catch (ParseException ex) {
            Logger.getLogger(ThongKeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }



    @Override
    public List<ThongKeView> doanhThuNgay(String ngayBD, String ngayKT) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            return thongKeRepository.doanhThuNgay(ngayBD, ngayKT);
        } catch (ParseException ex) {
            Logger.getLogger(ThongKeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }



    @Override
    public List<Double> doanhThuNam(String nam) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return thongKeRepository.doanhThuNam(nam);
    }


    @Override
    public Double doanhThuThang(int nam, int thang) {
    return thongKeRepository.doanhThuThang(nam, thang);
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThongKeView> getTongDonHangByPTTT(String ngayBD, String ngayKT, int trangThai) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return thongKeRepository.getTongDonHangByPTTT(ngayBD, ngayKT, trangThai);
    }

    @Override
    public List<Long> getDonHangThang(int nam, int thang, int trangThai) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return thongKeRepository.getDonHangThang(nam, thang, trangThai);
    }

 
    
    
}
