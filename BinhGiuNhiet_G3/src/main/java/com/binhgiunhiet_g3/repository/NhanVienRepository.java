/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.KhachHang;
import com.binhgiunhiet_g3.entity.NhanVien;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author PC
 */
public class NhanVienRepository {

    private Session hSession;

    public NhanVienRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public List<NhanVien> getAll() {

        try ( Session session = HibernateUtil.getFACTORY().openSession();) {
            Query q = session.createQuery("FROM NhanVien WHERE TrangThai = 1");
            List<NhanVien> nhanViens = q.getResultList();
            return nhanViens;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(NhanVien nv) {

        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(nv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;

    }

    public boolean update(NhanVien nhanVien) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(nhanVien);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    public NhanVien findByMa(String ma) {
        try {
            String hql = "SELECT obj FROM NhanVien obj WHERE obj.ma = ?1";
            TypedQuery<NhanVien> query = this.hSession.createQuery(hql, NhanVien.class);
            query.setParameter(1, ma);
            return query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new NhanVien();
    }

}
