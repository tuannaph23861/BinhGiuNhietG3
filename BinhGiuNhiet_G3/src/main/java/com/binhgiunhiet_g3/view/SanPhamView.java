/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.binhgiunhiet_g3.view;

import com.binhgiunhiet_g3.entity.BinhGiuNhiet;
import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.entity.ChatLieu;
import com.binhgiunhiet_g3.entity.MauSac;
import com.binhgiunhiet_g3.entity.ThuongHieu;
import com.binhgiunhiet_g3.service.BinhGiuNhietChiTietService;
import com.binhgiunhiet_g3.service.BinhGiuNhietService;
import com.binhgiunhiet_g3.service.ChatLieuService;
import com.binhgiunhiet_g3.service.MauSacService;
import com.binhgiunhiet_g3.service.ThuongHieuService;
import com.binhgiunhiet_g3.service.impl.BinhGiuNhietChiTietServiceImpl;
import com.binhgiunhiet_g3.service.impl.BinhGiuNhietServiceImpl;
import com.binhgiunhiet_g3.service.impl.ChatLieuServiceImpl;
import com.binhgiunhiet_g3.service.impl.MauSacServiceImpl;
import com.binhgiunhiet_g3.service.impl.ThuongHieuServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SanPhamView extends javax.swing.JFrame {
    
    ThuongHieuService ths = new ThuongHieuServiceImpl();
    List<ThuongHieu> listTH = new ArrayList<>();
    ChatLieuService cls = new ChatLieuServiceImpl();
    List<ChatLieu> listCL = new ArrayList<>();
    MauSacService mss = new MauSacServiceImpl();
    List<MauSac> listMS = new ArrayList<>();
    BinhGiuNhietService binhGiuNhietService = new BinhGiuNhietServiceImpl();
    BinhGiuNhietChiTietService binhGiuNhietChiTietService = new BinhGiuNhietChiTietServiceImpl();
    DefaultTableModel model = new DefaultTableModel();
    List<BinhGiuNhiet> binhGiuNhiets = new ArrayList<>();

    public SanPhamView() {
        initComponents();
        model = (DefaultTableModel) tableTH.getModel();
        String[] header = {"Id","MaTH","TenTH"};
        model.setColumnIdentifiers(header);
        
        model = (DefaultTableModel) tableCL.getModel();
        String[] headerCL = {"Id","MaCL","TenCL"};
        model.setColumnIdentifiers(headerCL);
        
        model = (DefaultTableModel) tableMS.getModel();
        String[] headerMS = {"Id","MaMS","TenMS"};
        model.setColumnIdentifiers(headerMS);
        
        loadTableTH();
        loadTableCL();
        loadTableSanPham();
    }
    
    private void loadTableTH(){
        this.model = (DefaultTableModel) tableTH.getModel();
        model.setRowCount(0);
        this.listTH = this.ths.getAll();
        for(ThuongHieu th1 : listTH){
            model.addRow(new Object[]{
                th1.getMaThuongHieu(),
                th1.getTen()
            });
            System.out.println(th1.toString());
        }
    }
    
    private void loadTableCL(){
        this.model = (DefaultTableModel) tableCL.getModel();
        model.setRowCount(0);
        this.listCL = this.cls.getAll();
        for(ChatLieu cl : listCL){
            model.addRow(new Object[]{
                cl.getMaChatLieu(),
                cl.getTen()
            });
        }
    }
    
    private void loadTableMS(){
        this.model = (DefaultTableModel) tableMS.getModel();
        model.setRowCount(0);
        this.listMS = this.mss.getAll();
        for(MauSac ms : listMS){
            model.addRow(new Object[]{
                ms.getMaMauSac(),
                ms.getTen()
            });
        }
    }
    
    private void loadTableSanPham(){
        this.model = (DefaultTableModel) tableSanPham.getModel();
        model.setRowCount(0);
        this.binhGiuNhiets = this.binhGiuNhietService.getAll();
        for (BinhGiuNhiet binhGiuNhiet : binhGiuNhiets) {
            model.addRow(new Object[]{
                binhGiuNhiet.getMa(),
                binhGiuNhiet.getTen(),
//                binhGiuNhiet.getIdThuongHieu(),
//                binhGiuNhiet.getIdChatLieu(),
                binhGiuNhiet.getNamSanXuat(),
                binhGiuNhiet.getDungTich(),
                binhGiuNhiet.getUrl()
            });
        }
    }

    
    private void loadTableSanPhamChiTiet(int idSanPham){
        this.model = (DefaultTableModel) tableSanPhamChiTiet.getModel();
        model.setRowCount(0);
        for (BinhGiuNhietChiTiet binhGiuNhietChiTiet : this.binhGiuNhietChiTietService.getByIdSanPham(idSanPham)) {
            model.addRow(new Object[]{
                binhGiuNhietChiTiet.getBinhGiuNhiet(),
//                binhGiuNhietChiTiet.getIdMauSac(),
                binhGiuNhietChiTiet.getGiaNhap(),
                binhGiuNhietChiTiet.getGiaBan(),
                binhGiuNhietChiTiet.getSoLuong()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSanPhamChiTiet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnThemSanPham = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMaSanPham = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNamSanXuat = new javax.swing.JTextField();
        txtDungTich = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGiaNhap = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTH = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCL = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableMS = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTen2 = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        cbbLoai = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Quản lý sản phẩm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 195, 40));

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Thương hiệu", "Chất liệu", "Năm sản xuát", "Dung tích", "Ảnh"
            }
        ));
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSanPham);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, -1, -1));

        tableSanPhamChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Màu", "Giá nhập", "Giá bán", "Số lượng"
            }
        ));
        jScrollPane3.setViewportView(tableSanPhamChiTiet);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 719, 280));

        jLabel1.setText("Mã sản phẩm");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 78, 108, -1));

        jLabel3.setText("Thương hiệu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 161, 108, -1));

        jLabel4.setText("Chất liệu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 204, 108, -1));

        jLabel5.setText("Năm sản xuất");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 247, 108, -1));

        jLabel6.setText("Dung tích");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 290, 108, -1));

        jLabel7.setText("Tên");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 118, 108, -1));

        jLabel8.setText("Màu");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 373, 108, -1));

        jLabel9.setText("Ảnh");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 333, 108, -1));

        jLabel10.setText("Số lượng");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 416, 108, -1));

        jLabel12.setText("Giá bán");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 502, 108, -1));

        jLabel13.setText("Giá nhập");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 459, 108, -1));

        jButton1.setText("Xóa");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 542, -1, -1));

        btnThemSanPham.setText("Thêm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });
        jPanel1.add(btnThemSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 542, -1, -1));

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 542, -1, -1));
        jPanel1.add(txtMaSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 75, 193, -1));
        jPanel1.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 115, 193, -1));
        jPanel1.add(txtNamSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 241, 193, -1));
        jPanel1.add(txtDungTich, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 284, 193, -1));
        jPanel1.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 413, 193, -1));
        jPanel1.add(txtGiaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 456, 193, -1));
        jPanel1.add(txtGiaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 499, 193, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 158, 193, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 201, 193, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 330, 193, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 370, 193, -1));

        jTabbedPane1.addTab("Sản phẩm", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Loại");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 40, 20));

        tableTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableTH);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thương hiệu", jPanel3);

        tableCL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableCL);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Chất liệu", jPanel4);

        tableMS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableMS);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Màu sắc ", jPanel6);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1060, 400));

        jLabel16.setText("Mã");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 20));

        jLabel17.setText("Tên");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 40, 20));
        jPanel2.add(txtTen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 210, -1));

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 210, -1));

        cbbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thương hiệu", "Chất liệu", "Màu Sắc" }));
        jPanel2.add(cbbLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 220, -1));

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jLabel18.setText("Tìm kiếm");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, 20));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, -1));

        jTabbedPane1.addTab("Khác", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        // TODO add your handling code here:
        
        getSanPham();
        
        createSanPham(getSanPham());
        
        loadTableSanPham();
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        
        int row = tableSanPham.getRowCount();

        int id = this.binhGiuNhiets.get(row - 1).getId();
        
        System.out.println(this.binhGiuNhiets.get(row - 1).toString());

        loadTableSanPhamChiTiet(id);
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ThuongHieu thuongHieu = new ThuongHieu();
        ChatLieu ch = new ChatLieu();
        MauSac ms = new MauSac();
        System.out.println(cbbLoai.getSelectedIndex());
        if(cbbLoai.getSelectedIndex() == 0){
            this.ths.add(thuongHieu);
        }else if(cbbLoai.getSelectedIndex() == 1){
            this.cls.add(ch);
        }else{
            this.mss.add(ms);
        };
        loadTableTH();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JComboBox<String> cbbLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTable tableCL;
    private javax.swing.JTable tableMS;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTable tableSanPhamChiTiet;
    private javax.swing.JTable tableTH;
    private javax.swing.JTextField txtDungTich;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTen2;
    // End of variables declaration//GEN-END:variables

    private void createSanPham( BinhGiuNhiet binhGiuNhiet) {
        if(this.binhGiuNhietService.add(binhGiuNhiet) == true){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else{
            JOptionPane.showMessageDialog(this, "Thêm Thất bại");
        }
    }

    private BinhGiuNhiet getSanPham() {
        BinhGiuNhiet binhGiuNhiet = new BinhGiuNhiet();
        
        binhGiuNhiet.setMa(txtMaSanPham.getText());
        binhGiuNhiet.setNamSanXuat(Integer.parseInt(txtNamSanXuat.getText()));
        binhGiuNhiet.setTen(txtTen.getText());
        binhGiuNhiet.setDungTich(Integer.parseInt(txtNamSanXuat.getText()));
//        binhGiuNhiet anh
//        binhGiuNhiet
//        binhGiuNhiet        
        return binhGiuNhiet;
    }
}
