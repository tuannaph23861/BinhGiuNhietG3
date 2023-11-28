/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.ThongKeView;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TemporalType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author dungd
 */
public class ThongKeRepository {

    private Session hSession;

    public ThongKeRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public List<ThongKeView> getList(int nam) {
        List<ThongKeView> listTK = new ArrayList<>();
        Transaction transaction = null;

        try {
            transaction = hSession.beginTransaction();

            String hql = "SELECT MONTH(hd.NgayThanhToan), SUM(hd.ThanhTien) "
                    + "FROM HoaDon hd "
                    + "WHERE YEAR(hd.NgayThanhToan) = :nam "
                    + "GROUP BY MONTH(hd.NgayThanhToan)";

            Query query = hSession.createQuery(hql);
            query.setParameter("nam", nam);

            List<Object[]> results = query.list();
            for (Object[] result : results) {
                ThongKeView tk = new ThongKeView();
                tk.setThang(String.valueOf(result[0]));
                tk.setDoanhThu((Double) result[1]);
                listTK.add(tk);
            }

            transaction.commit();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            if (hSession != null && hSession.isOpen()) {
                hSession.close();
            }
            return listTK;
        }
    }

    public List<ThongKeView> getTongDonHang(String ngayBD, String ngayKT) throws ParseException {
        List<ThongKeView> listTK = new ArrayList<>();
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fromDate = dateFormat.parse(ngayBD);
            Date toDate = dateFormat.parse(ngayKT);

            String hql = "SELECT COUNT(*) FROM HoaDon WHERE NgayThanhToan BETWEEN :ngayBD AND :ngayKT";
            Query query = session.createQuery(hql);
            query.setParameter("ngayBD", fromDate, TemporalType.DATE);
            query.setParameter("ngayKT", toDate, TemporalType.DATE);

            Long count = (Long) query.uniqueResult();

            if (count != null) {
                ThongKeView tk = new ThongKeView();
                tk.setSoLuongDon(count.intValue());
                listTK.add(tk);
            }
        } catch (HibernateException | ParseException ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return listTK;
    }

    public List<ThongKeView> doanhThuNgay(String ngayBD, String ngayKT) throws ParseException {
    List<ThongKeView> listTK = new ArrayList<>();
    Transaction transaction = null;
    Session session = null;
    try {
        session = HibernateUtil.getFACTORY().openSession();
        transaction = session.beginTransaction();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fromDate = dateFormat.parse(ngayBD);
        Date toDate = dateFormat.parse(ngayKT);
        
        String hql = "SELECT SUM(hd.thanhTien) FROM HoaDon hd WHERE hd.ngayThanhToan BETWEEN :ngayBD AND :ngayKT";
        Query query = session.createQuery(hql);
        query.setParameter("ngayBD", fromDate, TemporalType.DATE);
        query.setParameter("ngayKT", toDate, TemporalType.DATE);
        
        Double sum = (Double) query.uniqueResult();
        
        if (sum != null) {
            ThongKeView tk = new ThongKeView();
            tk.setDoanhThu(sum);
            listTK.add(tk);
        }
        
        transaction.commit();
    } catch (HibernateException | ParseException ex) {
        if (transaction != null) {
            transaction.rollback();
        }
        ex.printStackTrace();
    } finally {
        if (session != null) {
            session.close();
        }
    }
    return listTK;
}
    public List<ThongKeView> doanhThuThang(String nam, String thang) {
        List<ThongKeView> listTK = new ArrayList<>();
        Transaction transaction = null;
        Session session = null;

        try {
             session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date fromDate = dateFormat.parse(nam);
//        Date toDate = dateFormat.parse(thang);
            String hql = "SELECT new ThongKeView(SUM(hd.thanhTien) as doanhThu) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam AND MONTH(hd.ngayThanhToan) = :thang";
            Query<ThongKeView> query = session.createQuery(hql, ThongKeView.class);
            query.setParameter("nam", Integer.parseInt(nam));
            query.setParameter("thang", Integer.parseInt(thang));

            ThongKeView result = query.uniqueResult();

            if (result != null) {
                listTK.add(result);
            }
        } catch (HibernateException | NumberFormatException ex) {
            ex.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return listTK;
    }

    public List<ThongKeView> getDonHangThang(String nam, String thang, String trangThai) {
        List<ThongKeView> listTK = new ArrayList<>();
        Transaction transaction = null;
        Session session = null;

        try {
                session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            String hql = "SELECT new ThongKeView(COUNT(hd.tinhTrang) as soLuongDon) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam AND MONTH(hd.ngayThanhToan) = :thang AND hd.tinhTrang LIKE :trangThai";
            Query<ThongKeView> query = session.createQuery(hql, ThongKeView.class);
            query.setParameter("nam", Integer.parseInt(nam));
            query.setParameter("thang", Integer.parseInt(thang));
            query.setParameter("trangThai", "%" + trangThai + "%");

            ThongKeView result = query.uniqueResult();

            if (result != null) {
                listTK.add(result);
            }
        } catch (HibernateException | NumberFormatException ex) {
            ex.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
               session.close();
            }
        }

        return listTK;
    }
//
//    public List<ThongKeView> doanhThuNam(String nam) {
//        List<ThongKeView> listTK = new ArrayList<>();
//        Transaction transaction = null;
//
//        try {
//            transaction = hSession.beginTransaction();
//
//            String hql = "SELECT new ThongKeView(SUM(hd.thanhTien) as doanhThu) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam";
//            Query<ThongKeView> query = hSession.createQuery(hql, ThongKeView.class);
//            query.setParameter("nam", Integer.parseInt(nam));
//
//            ThongKeView result = query.uniqueResult();
//
//            if (result != null) {
//                listTK.add(result);
//            }
//        } catch (HibernateException | NumberFormatException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (hSession != null && hSession.isOpen()) {
//                hSession.close();
//            }
//        }
//
//        return listTK;
//    }
}
