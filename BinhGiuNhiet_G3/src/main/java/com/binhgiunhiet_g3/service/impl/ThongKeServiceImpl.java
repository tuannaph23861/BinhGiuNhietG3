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
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

//    @Override
//    public List<ThongKeView> getTongDonHangByTrangThai(String ngayBD, String ngayKT, String trangThai) {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//  return thongKeRepository.ge;
//    }

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
    public List<ThongKeView> doanhThuThang(String nam, String thang) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return thongKeRepository.doanhThuThang(nam, thang);
    }

//    @Override
//    public List<ThongKeView> doanhThuNam(String nam) {
//       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//   return thongKeRepository.doanhThuNam(nam);
//    }

    @Override
    public List<ThongKeView> getDonHangThang(String nam, String thang, String trangThai) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return thongKeRepository.getDonHangThang(nam, thang, trangThai);
    }
    
}
