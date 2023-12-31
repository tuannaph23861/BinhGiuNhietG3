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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SanPham extends javax.swing.JFrame {

    // add Service
    BinhGiuNhietChiTietService binhGiuNhietChiTietService = new BinhGiuNhietChiTietServiceImpl();
    BinhGiuNhietService binhGiuNhietService = new BinhGiuNhietServiceImpl();
    ThuongHieuService thuongHieuService = new ThuongHieuServiceImpl();
    ChatLieuService chatLieuService = new ChatLieuServiceImpl();
    MauSacService mauSacService = new MauSacServiceImpl();
    ThuongHieuService ths = new ThuongHieuServiceImpl();
    ChatLieuService cls = new ChatLieuServiceImpl();
    MauSacService mss = new MauSacServiceImpl();

    // creat List
    List<BinhGiuNhietChiTiet> binhGiuNhietChiTiets = new ArrayList<>();
    List<ThuongHieu> thuongHieus = this.thuongHieuService.getAll();
    List<ChatLieu> chatLieus = this.chatLieuService.getAll();
    List<BinhGiuNhiet> binhGiuNhiets = new ArrayList<>();
    List<ThuongHieu> listTH = new ArrayList<>();
    List<ChatLieu> listCL = new ArrayList<>();
    List<MauSac> listMS = new ArrayList<>();

    // setup Table
    DefaultTableModel model = new DefaultTableModel();

    public SanPham() {
        initComponents();

        loadTableSanPham();

        loadCombobox();

        loadTableTH();
        loadTableCL();
        loadTableMS();
    }

    private void loadTableSanPham() {
        this.model = (DefaultTableModel) tableSanPham.getModel();
        model.setRowCount(0);
        this.binhGiuNhiets = this.binhGiuNhietService.getAll();
        for (BinhGiuNhiet binhGiuNhiet : binhGiuNhiets) {
            model.addRow(new Object[]{
                binhGiuNhiet.getMa(),
                binhGiuNhiet.getTen(),
                binhGiuNhiet.getThuongHieu().getTen(),
                binhGiuNhiet.getChatLieu().getTen(),
                binhGiuNhiet.getNamSanXuat(),
                binhGiuNhiet.getDungTich(),
                binhGiuNhiet.getUrl()
            });
        }
    }

    private void loadTableSanPhamChiTiet(int idSanPham) {
        this.model = (DefaultTableModel) tableGetSanPhamChiTiet.getModel();
        model.setRowCount(0);
        this.binhGiuNhietChiTiets = this.binhGiuNhietChiTietService.getByIdSanPham(idSanPham);
        for (BinhGiuNhietChiTiet binhGiuNhietChiTiet : this.binhGiuNhietChiTiets) {
            model.addRow(new Object[]{
                binhGiuNhietChiTiet.getBinhGiuNhiet().getMa(),
                binhGiuNhietChiTiet.getMauSac().getTen(),
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThemSanPham = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMaSanPham = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNamSanXuat = new javax.swing.JTextField();
        txtDungTich = new javax.swing.JTextField();
        cbbThuongHieu = new javax.swing.JComboBox<>();
        cbbChatLieu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableGetSanPhamChiTiet = new javax.swing.JTable();
        btnThemSanPham1 = new javax.swing.JButton();
        txtTimKiemSanPham = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Quản lý sản phẩm");

        jLabel1.setText("Mã sản phẩm");

        jLabel3.setText("Thương hiệu");

        jLabel4.setText("Chất liệu");

        jLabel5.setText("Năm sản xuất");

        jLabel6.setText("Dung tích");

        jLabel7.setText("Tên");

        btnThemSanPham.setText("Thêm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtMaSanPham.setEditable(false);

        txtDungTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDungTichActionPerformed(evt);
            }
        });

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Thương hiệu", "Chất liệu", "Năm sản xuát", "Dung tích"
            }
        ));
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSanPham);

        tableGetSanPhamChiTiet.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGetSanPhamChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGetSanPhamChiTietMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableGetSanPhamChiTiet);

        btnThemSanPham1.setText("Thêm biến thể sản phẩm");
        btnThemSanPham1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPham1ActionPerformed(evt);
            }
        });

        jButton1.setText("TÌm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbbThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemSanPham1)
                    .addComponent(jButton3)
                    .addComponent(btnThemSanPham)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemSanPham))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemSanPham1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sản phẩm", jPanel1);

        jLabel15.setText("Loại");

        tableTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã thương hiệu", "Tên thương hiệu"
            }
        ));
        tableTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTHMouseClicked(evt);
            }
        });
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thương hiệu", jPanel3);

        tableCL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Ma chất liệu", "Tên chất liệu"
            }
        ));
        tableCL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCLMouseClicked(evt);
            }
        });
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Chất liệu", jPanel4);

        tableMS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã màu sắc", "Tên mau sắc"
            }
        ));
        tableMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMSMouseClicked(evt);
            }
        });
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Màu sắc ", jPanel6);

        jLabel16.setText("Mã");

        jLabel17.setText("Tên");

        cbbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thương hiệu", "Chất liệu", "Màu Sắc" }));

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel18.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton4)
                .addGap(98, 98, 98)
                .addComponent(jButton5)
                .addGap(88, 88, 88)
                .addComponent(jButton6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Thuộc tính", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Random random = new Random();

        ThuongHieu thuongHieu = new ThuongHieu();
        ChatLieu ch = new ChatLieu();
        MauSac ms = new MauSac();

        String ten = txtTen2.getText();

        System.out.println(cbbLoai.getSelectedIndex());
        if (cbbLoai.getSelectedIndex() == 0) {

            String ma = "TH";
            ma = ma + random.nextInt(99999999);

            thuongHieu.setMaThuongHieu(ma);
            thuongHieu.setTen(ten);

            this.ths.add(thuongHieu);
            loadTableTH();
        } else if (cbbLoai.getSelectedIndex() == 1) {

            String ma = "CL";
            ma = ma + random.nextInt(99999999);

            ch.setMaChatLieu(ma);
            ch.setTen(ten);

            this.cls.add(ch);
            loadTableCL();
        } else {

            String ma = "MS";
            ma = ma + random.nextInt(99999999);

            ms.setMaMauSac(ma);
            ms.setTen(ten);

            this.mss.add(ms);
            loadTableMS();
        };

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnThemSanPham1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPham1ActionPerformed

        int row = tableSanPham.getSelectedRow();

        if (row >= 0) {
            SanPhamChiTietView sanPhamChiTietView = new SanPhamChiTietView(binhGiuNhiets.get(row));
            sanPhamChiTietView.setLocationRelativeTo(this);
            sanPhamChiTietView.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn sản phẩm");
        }
    }//GEN-LAST:event_btnThemSanPham1ActionPerformed

    private void tableGetSanPhamChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGetSanPhamChiTietMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableGetSanPhamChiTietMouseClicked

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked

        int row = tableSanPham.getSelectedRow();

        System.out.println(row);

        int id = this.binhGiuNhiets.get(row).getId();

        System.out.println(this.binhGiuNhiets.get(row).toString());

        loadTxtSanPham(id);

        loadTableSanPhamChiTiet(id);
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void txtDungTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDungTichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDungTichActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String ma = txtMaSanPham.getText();
        if (ma.isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm");
        } else {
            BinhGiuNhiet binhGiuNhiet = this.binhGiuNhietService.findByMa(ma);

            binhGiuNhiet.setTen(txtTen.getText());
            binhGiuNhiet.setDungTich(Integer.parseInt(txtDungTich.getText()));
            binhGiuNhiet.setNamSanXuat(Integer.parseInt(txtNamSanXuat.getText()));
            binhGiuNhiet.setThuongHieu(this.thuongHieus.get(cbbThuongHieu.getSelectedIndex()));
            binhGiuNhiet.setChatLieu(this.chatLieus.get(cbbChatLieu.getSelectedIndex()));

            this.binhGiuNhietService.update(binhGiuNhiet);

            loadTableSanPham();
        };

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        String ma = "SP";
        Random random = new Random();

        ma = ma + random.nextInt(99999999);
        if (txtMaSanPham.getText().equals("")) {

            BinhGiuNhiet binhGiuNhiet = getSanPham();
            binhGiuNhiet.setMa(ma);
            createSanPham(binhGiuNhiet);

            loadTableSanPham();

        }
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.model = (DefaultTableModel) tableSanPham.getModel();
        model.setRowCount(0);

        String ten = txtTimKiemSanPham.getText();

        for (BinhGiuNhiet binhGiuNhiet : binhGiuNhiets) {
            if (binhGiuNhiet.getTen().equals(ten)) {
                model.addRow(new Object[]{
                    binhGiuNhiet.getMa(),
                    binhGiuNhiet.getTen(),
                    binhGiuNhiet.getThuongHieu().getTen(),
                    binhGiuNhiet.getChatLieu().getTen(),
                    binhGiuNhiet.getNamSanXuat(),
                    binhGiuNhiet.getDungTich(),
                    binhGiuNhiet.getUrl()
                });
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        loadTableSanPham();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTHMouseClicked

        int row = tableTH.getSelectedRow();

        ThuongHieu thuongHieu = listTH.get(row);

        txtMa.setText(thuongHieu.getMaThuongHieu());
        txtTen2.setText(thuongHieu.getTen());
    }//GEN-LAST:event_tableTHMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String ma = txtMa.getText();
        String ten = txtTen2.getText();

        System.out.println(cbbLoai.getSelectedIndex());
        if (cbbLoai.getSelectedIndex() == 0) {

            int row = tableTH.getSelectedRow();

            ThuongHieu thuongHieu = listTH.get(row);

            thuongHieu.setTen(ten);

            this.ths.update(thuongHieu);
            loadTableTH();
        } else if (cbbLoai.getSelectedIndex() == 1) {

            int row = tableCL.getSelectedRow();

            ChatLieu chatLieu = listCL.get(row);

            chatLieu.setTen(ten);

            this.cls.update(chatLieu);
            loadTableCL();
        } else {

            int row = tableMS.getSelectedRow();

            MauSac mauSac = listMS.get(row);

            mauSac.setTen(ten);

            this.mss.update(mauSac);
            loadTableMS();
        };
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableCLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCLMouseClicked
        int row = tableCL.getSelectedRow();

        ChatLieu chatLieu = listCL.get(row);

        txtMa.setText(chatLieu.getMaChatLieu());
        txtTen2.setText(chatLieu.getTen());
    }//GEN-LAST:event_tableCLMouseClicked

    private void tableMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMSMouseClicked

        int row = tableMS.getSelectedRow();

        MauSac mauSac = listMS.get(row);

        txtMa.setText(mauSac.getMaMauSac());
        txtTen2.setText(mauSac.getTen());
    }//GEN-LAST:event_tableMSMouseClicked

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
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnThemSanPham1;
    private javax.swing.JComboBox<String> cbbChatLieu;
    private javax.swing.JComboBox<String> cbbLoai;
    private javax.swing.JComboBox<String> cbbThuongHieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTable tableCL;
    private javax.swing.JTable tableGetSanPhamChiTiet;
    private javax.swing.JTable tableMS;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTable tableTH;
    private javax.swing.JTextField txtDungTich;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTen2;
    private javax.swing.JTextField txtTimKiemSanPham;
    // End of variables declaration//GEN-END:variables

    private void createSanPham(BinhGiuNhiet binhGiuNhiet) {
        if (this.binhGiuNhietService.add(binhGiuNhiet) == true) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất bại");
        }
    }

    private BinhGiuNhiet getSanPham() {
        BinhGiuNhiet binhGiuNhiet = new BinhGiuNhiet();

        binhGiuNhiet.setMa(txtMaSanPham.getText());
        binhGiuNhiet.setNamSanXuat(Integer.parseInt(txtNamSanXuat.getText()));
        binhGiuNhiet.setTen(txtTen.getText());
        binhGiuNhiet.setDungTich(Integer.parseInt(txtDungTich.getText()));
        binhGiuNhiet.setThuongHieu(thuongHieus.get(cbbThuongHieu.getSelectedIndex()));
        binhGiuNhiet.setChatLieu(chatLieus.get(cbbChatLieu.getSelectedIndex()));
        return binhGiuNhiet;
    }

    private void createSanPhamChiTiet(BinhGiuNhietChiTiet sanPhamChiTiet) {
        if (this.binhGiuNhietChiTietService.add(sanPhamChiTiet) == true) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất bại");
        }
    }

    private void loadTxtSanPham(int id) {
        BinhGiuNhiet binhGiuNhiet = new BinhGiuNhiet();

        binhGiuNhiet = this.binhGiuNhietService.findById(id);

        txtMaSanPham.setText(binhGiuNhiet.getMa());
        txtTen.setText(binhGiuNhiet.getTen());
        txtNamSanXuat.setText(String.valueOf(binhGiuNhiet.getNamSanXuat()));
        cbbThuongHieu.setSelectedItem(binhGiuNhiet.getThuongHieu().getTen());
        cbbChatLieu.setSelectedItem(binhGiuNhiet.getChatLieu().getTen());
        txtDungTich.setText(String.valueOf(binhGiuNhiet.getDungTich()));

    }

    private void loadCombobox() {
        for (ThuongHieu thuongHieu : thuongHieus) {
            cbbThuongHieu.addItem(thuongHieu.getTen());
        }
        for (ChatLieu chatLieu : chatLieus) {
            cbbChatLieu.addItem(chatLieu.getTen());
        }

    }

    private void loadTableTH() {
        this.model = (DefaultTableModel) tableTH.getModel();
        model.setRowCount(0);
        this.listTH = this.ths.getAll();
        for (ThuongHieu th1 : listTH) {
            model.addRow(new Object[]{
                th1.getMaThuongHieu(),
                th1.getTen()
            });
            System.out.println(th1.toString());
        }
    }

    private void loadTableCL() {
        this.model = (DefaultTableModel) tableCL.getModel();
        model.setRowCount(0);
        this.listCL = this.cls.getAll();
        for (ChatLieu cl : listCL) {
            model.addRow(new Object[]{
                cl.getMaChatLieu(),
                cl.getTen()
            });
        }
    }

    private void loadTableMS() {
        this.model = (DefaultTableModel) tableMS.getModel();
        model.setRowCount(0);
        this.listMS = this.mss.getAll();
        for (MauSac ms : listMS) {
            model.addRow(new Object[]{
                ms.getMaMauSac(),
                ms.getTen()
            });
        }
    }
}
