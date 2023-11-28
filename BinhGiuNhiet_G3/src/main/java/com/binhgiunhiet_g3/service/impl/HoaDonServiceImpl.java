/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.HoaDon;
import com.binhgiunhiet_g3.repository.HoaDonRepository;
import com.binhgiunhiet_g3.service.HoaDonService;
import java.util.List;

/**
 *
 * @author dungd
 */
public class HoaDonServiceImpl  implements HoaDonService{
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();
    
    @Override
    public List<HoaDon> getAll() {
      return hoaDonRepository.findALL();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(HoaDon hoaDon) {
         hoaDonRepository.insert(hoaDon);
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(HoaDon hoaDon) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      hoaDonRepository.update(hoaDon);
    }

    @Override
    public void delete(HoaDon hoaDon) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      hoaDonRepository.delete(hoaDon);
    }
}
