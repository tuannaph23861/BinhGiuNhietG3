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
public List<ThongKeView> getTongDonHangByPTTT(String ngayBD, String ngayKT, int hinhthucthanhtoan) {
    List<ThongKeView> listTK = new ArrayList<>();
    Transaction transaction = null;
    Session session = null;

    try {
        session = HibernateUtil.getFACTORY().openSession();
        transaction = session.beginTransaction();

        String hql = "SELECT COUNT(*) FROM HoaDon WHERE NgayThanhToan BETWEEN :ngayBD AND :ngayKT AND PhuongThucThanhToan = :phuongThuocThanhToan";
        Query query = session.createQuery(hql);
        query.setParameter("ngayBD", ngayBD);
        query.setParameter("ngayKT", ngayKT);
        query.setParameter("phuongThuocThanhToan", hinhthucthanhtoan); // Thay đổi tên tham số và giá trị truyền vào

        Long count = (Long) query.getSingleResult();
        ThongKeView tk = new ThongKeView();
        tk.setSoLuongDon(count.intValue());
        listTK.add(tk);

        transaction.commit();
    } catch (Exception ex) {
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

public Double doanhThuThang(int nam, int thang) {
    Transaction transaction = null;
    Session session = null;
    Double sum = null;

    try {
        session = HibernateUtil.getFACTORY().openSession();
        transaction = session.beginTransaction();

        // Sử dụng HQL để thực hiện truy vấn
        String hql = "SELECT SUM(hd.thanhTien) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam AND MONTH(hd.ngayThanhToan) = :thang";
        Query<Double> query = session.createQuery(hql, Double.class);
        query.setParameter("nam", nam);
        query.setParameter("thang", thang);

        sum = query.uniqueResult();

        transaction.commit();
    } catch (HibernateException ex) {
        if (transaction != null) {
            transaction.rollback();
        }
        ex.printStackTrace();
    } finally {
        if (session != null) {
            session.close();
        }
    }
    return sum;
}


public List<Long> getDonHangThang(int nam, int thang, int hinhThucThanhToan) {
    List<Long> resultList = new ArrayList<>();
    Transaction transaction = null;
    Session session = null;

    try {
        session = HibernateUtil.getFACTORY().openSession();
        transaction = session.beginTransaction();

        String hql = "SELECT COUNT(*) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam AND MONTH(hd.ngayThanhToan) = :thang AND hd.phuongThucThanhToan = :hinhThucThanhToan";
        
        Query<Long> query = session.createQuery(hql, Long.class);
        query.setParameter("nam", nam);
        query.setParameter("thang", thang);
        query.setParameter("hinhThucThanhToan", hinhThucThanhToan);

        Long result = query.uniqueResult();

        if (result != null) {
            resultList.add(result);
        }
    } catch (HibernateException | NumberFormatException ex) {
        ex.printStackTrace();
    } finally {
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    return resultList;
}

public List<Double> doanhThuNam(String nam) {
    List<Double> listTK = new ArrayList<>();
    Transaction transaction = null;

    try {
        Session hSession = HibernateUtil.getFACTORY().openSession();
        transaction = hSession.beginTransaction();

        String hql = "SELECT SUM(hd.thanhTien) FROM HoaDon hd WHERE YEAR(hd.ngayThanhToan) = :nam";
        Query<Double> query = hSession.createQuery(hql, Double.class);
        query.setParameter("nam", Integer.parseInt(nam));

        Double result = query.uniqueResult();

        if (result != null) {
            listTK.add(result);
        }

        transaction.commit();
    } catch (HibernateException | NumberFormatException ex) {
        if (transaction != null) {
            transaction.rollback();
        }
        ex.printStackTrace();
    } finally {
        if (hSession != null && hSession.isOpen()) {
            hSession.close();
        }
    }

    return listTK;
}
}
