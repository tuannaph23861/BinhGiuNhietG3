/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.GioHangChiTiet;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dungd
 */
public class GioHangChiTietRepository {
    private Session hSession;

    public GioHangChiTietRepository() {
    }
    public void insert(GioHangChiTiet gioHangChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(gioHangChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(GioHangChiTiet gioHangChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete( gioHangChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
