/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;


import com.binhgiunhiet_g3.entity.NhanVien;

import java.util.List;

/**
 *
 * @author PC
 */
public interface IManageNhanVienService {

    List<NhanVien> getAll();

    boolean add(NhanVien nhanVien);

    boolean update(NhanVien nhanVien);

    void delete(NhanVien nhanVien);
    
    NhanVien findByMa(String ma);
}
