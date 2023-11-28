/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;
import com.binhgiunhiet_g3.entity.KhuyenMai;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/**
 *
 * @author Hung
 */
public class KhuyenMaiRepository {
     private Session hSession;

    public KhuyenMaiRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();

    }

    public void insert(KhuyenMai khuyenMai) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(khuyenMai);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }

    }

public void update(KhuyenMai khuyenMai, Integer id) {
    Transaction transaction = null;
    try {
        transaction = this.hSession.getTransaction();
        transaction.begin();

        KhuyenMai km = this.hSession.get(KhuyenMai.class, id);
        if (km != null) {
            km.setGiaTri(khuyenMai.getGiaTri());
            km.setNgayBatDau(khuyenMai.getNgayBatDau());
            km.setNgayKetThuc(khuyenMai.getNgayKetThuc());
            km.setKieuGiamGia(khuyenMai.getKieuGiamGia());
            km.setTrangThai(khuyenMai.getTrangThai());

            this.hSession.update(km);
            transaction.commit();
        } else {
            System.out.println("Không tìm thấy đối tượng cần cập nhật.");
        }
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}
    public void delete(KhuyenMai khuyenMai)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(khuyenMai);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<KhuyenMai> findALL()
    {
         String hql = "SELECT obj FROM KhuyenMai obj";
        TypedQuery<KhuyenMai> query = this.hSession.createQuery(hql, KhuyenMai.class);
        return query.getResultList();
    }
    public KhuyenMai findByMa(String ma)
    {
        String hql = "SELECT obj FROM KhuyenMai obj WHERE obj.MaKhuyenMai = ?1";
        TypedQuery<KhuyenMai> query = this.hSession.createQuery(hql, KhuyenMai.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
    }


