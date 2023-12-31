/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.binhgiunhiet_g3.view;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.entity.HoaDon;
import com.binhgiunhiet_g3.entity.HoaDonChiTiet;
import com.binhgiunhiet_g3.service.GioHangChiTietService;
import com.binhgiunhiet_g3.service.HoaDonChiTietService;
import com.binhgiunhiet_g3.service.impl.BinhGiuNhietChiTietServiceImpl;
import com.binhgiunhiet_g3.service.impl.HoaDonChiTietServiceImpl;
import com.binhgiunhiet_g3.service.impl.HoaDonServiceImpl;
import com.binhgiunhiet_g3.viewModel.HoaDonChiTietViewModel;
import com.binhgiunhiet_g3.viewModel.HoaDonViewModel;
import static com.binhgiunhiet_g3.viewModel.NhanVienViewModel.all;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hung
 */
public class HoaDonView extends javax.swing.JFrame {

    private HoaDonServiceImpl HoaDonService;
    private BinhGiuNhietChiTietServiceImpl chiTietService = new BinhGiuNhietChiTietServiceImpl();
    private HoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietServiceImpl();
    List<HoaDonViewModel> hdlist = new ArrayList<>();

    /**
     * Creates new form GiamGia
     */
    public HoaDonView() {
        initComponents();
        HoaDonService = new HoaDonServiceImpl();

        for (HoaDon hoaDon : HoaDonService.getAll()) {
            HoaDonViewModel donViewModel = new HoaDonViewModel();
            donViewModel.setIdHD(hoaDon.getMaHoaDon());
            donViewModel.setMaHD(hoaDon.getMaHoaDon());
            donViewModel.setMaKH(hoaDon.getKhachHang().getMa());
            donViewModel.setMaNV(hoaDon.getNhanVien().getMa());
            donViewModel.setPTDG(hoaDon.getPhuongThucThanhToan());
            donViewModel.setTongTien(hoaDon.getThanhTien());

            hdlist.add(donViewModel);
        }
        loadTableHoaDon(hdlist);
    }

//    private void showDataChiTietGioHang(ArrayList<HoaDonServiceImpl> list) {
//        DefaultTableModel modeltb = new DefaultTableModel();
//        modeltb = (DefaultTableModel) tb_hoaDonCT.getModel();
//        modeltb.setRowCount(0);
//        int i = 1;
//
//        for (HoaDonServiceImpl HoaDonChiTietViewModel : list) {
//            modeltb.addRow(new Object[]{
//                i++,
//                HoaDonChiTietViewModel.getmaSP(),
//                HoaDonChiTietViewModel.getTenSP(),
//                HoaDonChiTietViewModel.getSoLuong(),
//                HoaDonChiTietViewModel.getdonGia(),
//                HoaDonChiTietViewModel.getsoLuong(),
//                HoaDonChiTietViewModel.getdonGia()
//            });
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnSearchTK = new javax.swing.JButton();
        btnClearTK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tb_hoaDonCT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });

        tblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Mã nhân viên", "Tên Khách", "GD", "Tình Trạng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblHoaDon);

        btnSearchTK.setBackground(new java.awt.Color(204, 204, 204));
        btnSearchTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchTK.setText("Tìm kiếm");
        btnSearchTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTKActionPerformed(evt);
            }
        });

        btnClearTK.setBackground(new java.awt.Color(204, 204, 204));
        btnClearTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearTK.setText("Làm mới");
        btnClearTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm theo Mã HĐ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnSearchTK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(btnClearTK))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tb_hoaDonCT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_hoaDonCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá/1 sản phẩm", "Thành tiền"
            }
        ));
        jScrollPane11.setViewportView(tb_hoaDonCT);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        // TODO add your handling code here:
//        List<HoaDonViewModel> hd = new ArrayList<>();
//        for (HoaDonViewModel h : HoaDonService.all()) {
//            if (h.getMaHD().contains(txtTimKiem.getText())) {
//                hd.add(h);
//            }
//        }
//        loadTableHoaDon(hd);
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        //TODO add your handling code here:
        int row = tblHoaDon.getSelectedRow();
        System.out.println(row);
        HoaDon hoaDon = HoaDonService.getAll().get(row);
        List<HoaDonChiTiet> listHDCT = new ArrayList<>();
        for (HoaDonChiTiet hoaDonChiTiet : this.hoaDonChiTietService.getAll()) {
            if(hoaDonChiTiet.getHoaDon().getId()== hoaDon.getId()){
                listHDCT.add(hoaDonChiTiet);
            }
        }
//         = chiTietService.getOneByIdHD(hoaDon.getId());
        listHDCT.stream().forEach(a -> System.out.println(a));
        
        loadTableHoaDonChiTiet(listHDCT);
//        HoaDonViewModel hoaDon = hdlist.get(row);
//        List<HoaDonChiTietViewModel> listCTGH = new ArrayList<>();
//        try {
//            listCTGH = HoaDonService.getListById(hoaDon.getMaHD());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            
//        }

    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnSearchTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTKActionPerformed

        String maHD = txtTimKiem.getText();
        System.out.println(maHD);
        HoaDon hoaDon = HoaDonService.findByMa(maHD);
        System.out.println(hoaDon);
    }//GEN-LAST:event_btnSearchTKActionPerformed

    private void btnClearTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTKActionPerformed

    }//GEN-LAST:event_btnClearTKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTK;
    private javax.swing.JButton btnSearchTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable tb_hoaDonCT;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void loadTableHoaDon(List<HoaDonViewModel> hdlist) {
        DefaultTableModel modeltb = new DefaultTableModel();
        modeltb = (DefaultTableModel) tblHoaDon.getModel();
        modeltb.setRowCount(0);
        int i = 1;
        for (HoaDonViewModel hoaDon : hdlist) {
            modeltb.addRow(new Object[]{
                i++,
                hoaDon.getMaHD(),
                hoaDon.getMaNV(),
                hoaDon.getTenKH(),
                hoaDon.getNgayTao(),
                hoaDon.getPTDG() == 0 ? "Tiền mặt" : "Chuyển khoản",
                hoaDon.getTinhTrang() == 0 ? "Chờ" : "Đã Thanh Toán",
                hoaDon.getTongTien()

            });
        }
    }

    private void loadTableHoaDonChiTiet(List<HoaDonChiTiet> listHDCT) {

        DefaultTableModel modeltb = new DefaultTableModel();
        modeltb = (DefaultTableModel) tb_hoaDonCT.getModel();
        modeltb.setRowCount(0);
        
        for (HoaDonChiTiet hoaDonChiTiet : listHDCT) {
            int tien = hoaDonChiTiet.getSoLuong() * hoaDonChiTiet.getDonGia().intValue();
            modeltb.addRow(new Object[]{
                hoaDonChiTiet.getId(),
                hoaDonChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getMa(),
                hoaDonChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getTen(),
                hoaDonChiTiet.getSoLuong(),
                hoaDonChiTiet.getDonGia(),
                tien
                
            });
        }
    }
}
