/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;


import com.binhgiunhiet_g3.entity.NhanVien;
import com.binhgiunhiet_g3.repository.NhanVienRepository;
import com.binhgiunhiet_g3.service.IManageNhanVienService;
import com.binhgiunhiet_g3.viewModel.NhanVienViewModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class NhanVienService implements IManageNhanVienService {

    private NhanVienRepository nhanVienRepo = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
   return nhanVienRepo.getAll();
     
    }

    
    

    @Override
    public boolean update(NhanVien nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NhanVien nhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
 public boolean add(NhanVien nv) {
        
        try {
            return nhanVienRepo.add(nv);
        } catch (Exception e) {
            return false;
        }
    }
}


