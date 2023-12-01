/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;
import com.binhgiunhiet_g3.entity.KhuyenMai;
import com.binhgiunhiet_g3.repository.KhuyenMaiRepository;
import com.binhgiunhiet_g3.service.KhuyenMaiService;
import java.util.List;
/**
 *
 * @author Hung
 */
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    private KhuyenMaiRepository khuyenmaiRepository;

    public KhuyenMaiServiceImpl() {
        this.khuyenmaiRepository = new KhuyenMaiRepository();

    }

    @Override
    public List<KhuyenMai> getAll() {
        return khuyenmaiRepository.findALL();
    }

    @Override
    public void add(KhuyenMai khuyenMai) {
        this.khuyenmaiRepository.insert(khuyenMai);
    }

   

    @Override
    public void delete(KhuyenMai khuyenMai) {
        this.khuyenmaiRepository.delete(khuyenMai);
    }

    @Override
    public void update(KhuyenMai km, Integer id) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       this.khuyenmaiRepository.update(km, id);
    }
}
