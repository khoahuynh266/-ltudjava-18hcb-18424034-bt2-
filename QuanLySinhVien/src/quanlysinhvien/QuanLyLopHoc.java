/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import dao.LopHocDAO;
import dao.SinhVienDAO;
import dao.TaiKhoanDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.*;

/**
 *
 * @author yumil
 */
public class QuanLyLopHoc extends javax.swing.JFrame {

    private final int IMPORT_FILE = 1;
    private final int EXPORT_FILE = 2;

    themSinhVien sv;
    Login login;

    private String[] columName = {
        "STT", "MSSV", "Họ Tên", "Giới Tính", "CMND"
    };

    /**
     * Creates new form QuanLyLopHoc
     */
    public QuanLyLopHoc() {
        initComponents();
        initLayout();
    }

    QuanLyLopHoc(Login aThis) {
        this.login = aThis;
        initComponents();
        initLayout();
        this.login.setVisible(false);
    }

    private void initLayout() {
         addDataForComboBoxClass();
        jsvTable.setVisible(true);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jsvTable = new javax.swing.JTable();
        jbtnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnQLMH = new javax.swing.JButton();
        btnQLTKB = new javax.swing.JButton();
        jcbLopHoc = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lớp học");

        jScrollPane1.setAutoscrolls(true);

        jsvTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jsvTable.setAutoscrolls(false);
        jsvTable.setColumnSelectionAllowed(true);
        jsvTable.setFocusable(false);
        jScrollPane1.setViewportView(jsvTable);
        jsvTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jbtnThoat.setText("Thoát");
        jbtnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThoatActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51)));

        btnQLMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQLMH.setText("Quản Lý Môn Học");
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });

        btnQLTKB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQLTKB.setText("Quản Lý TKB");
        btnQLTKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btnQLTKB, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQLTKB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLMH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jcbLopHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbLopHoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        jcbLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLopHocActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thêm Sinh Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Danh sách lớp");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý lớp học");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbLopHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnImport)
                        .addGap(598, 598, 598)
                        .addComponent(jbtnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnImport)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
        importExportFile("Choose file import", IMPORT_FILE);
    }//GEN-LAST:event_btnImportActionPerformed

    private void jcbLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLopHocActionPerformed
        // TODO add your handling code here: 
        if (jcbLopHoc.getSelectedItem().toString().equals("--")) {
            JOptionPane.showMessageDialog(null, "!!! Chưa Có Danh Sách Lớp");
        } else {
           addDataForTableListSV();
        }

    }//GEN-LAST:event_jcbLopHocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String lop = String.valueOf(jcbLopHoc.getItemAt(jcbLopHoc.getSelectedIndex()));
        if (jcbLopHoc.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "!!! Vui Lòng Chọn Môn Học");
        } else {
            sv = new themSinhVien(lop);
            sv.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new GiaoVu().setVisible(true);
    }//GEN-LAST:event_jbtnThoatActionPerformed

    private void btnQLTKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKBActionPerformed
        // TODO add your handling code here:
           new QuanLyTKB().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLTKBActionPerformed

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        // TODO add your handling code here:
           new QuanLyMonHoc().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLMHActionPerformed
    private void importExportFile(String title, int key) {
        JFileChooser j = new JFileChooser();
        j.setDialogTitle(title);
        int choose = -1;
        switch (key) {
            case IMPORT_FILE:
                choose = j.showOpenDialog(null);
                break;
            case EXPORT_FILE:
                choose = j.showSaveDialog(null);
                break;
        }

        if (choose == JFileChooser.APPROVE_OPTION) {
            File f = j.getSelectedFile();
            switch (key) {
                case IMPORT_FILE:
                    readFile(f);
                    break;
                case EXPORT_FILE:
                    //writeFile(f);
                    break;
            }
        }
    }

    private void addDataForComboBoxClass() {
        List<LopHoc> listLopHoc = LopHocDAO.getListLopHoc();
        if (listLopHoc.size() > 0) {
            DefaultComboBoxModel comboboxModel = new DefaultComboBoxModel();
            for (LopHoc lh : listLopHoc) {
                comboboxModel.addElement(lh.getTenLop());
            }
            jcbLopHoc.setModel(comboboxModel);
            addDataForTableListSV();
        } else {
            jcbLopHoc.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
        }
    }

    private void addDataForTableListSV() {
        String select =  jcbLopHoc.getSelectedItem().toString();
        System.out.printf("Lop: " + select);
        LopHoc lh = LopHocDAO.getLopHoc(select);
        if (0 < lh.getListSinhVien().size()) {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(columName);
            int stt = 1;

            for (SinhVien sd : lh.getListSinhVien()) {
                String[] rows = new String[5];
                rows[0] = String.valueOf(stt);
                rows[1] = sd.getMSSV();
                rows[2] = sd.getHoTen();
                if (sd.getGioiTinh() == 0) {
                    rows[3] = "Nam";
                } else {
                    rows[3] = "Nữ";
                }
                rows[4] = sd.getCMND();

                tableModel.addRow(rows);
                stt++;
            }

            jsvTable.setModel(tableModel);
        } else {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(columName);
            jsvTable.setModel(tableModel);
        }

    }

    private void readFile(File file) {
        try {
            try (FileReader fr = new FileReader(file)) {
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                String[] _className = line.split(",");
                String maLop = _className[0].replaceAll("﻿", "");
                LopHoc cr = LopHocDAO.getLopHoc(maLop);
                if(cr == null) {
                    cr = new LopHoc(maLop);
                    LopHocDAO.themLopHoc(cr);
                }
                line = br.readLine();
                // Lấy thông tin SinhVien
                while ((line = br.readLine()) != null) {
                    String[] inforSinhVien = line.split(",");
                     System.out.println(inforSinhVien[0] + "  " + inforSinhVien[1]);
                    SinhVien student = new SinhVien(inforSinhVien[0], inforSinhVien[1], inforSinhVien[3]);
                    TaiKhoan a = new TaiKhoan(inforSinhVien[0], inforSinhVien[0],0);
                    TaiKhoanDAO.themTaiKhoan(a);
                    
                    int sex = -1;
                    if (inforSinhVien[2].equalsIgnoreCase("Nam")) {
                        sex = 0;
                    }

                    if (inforSinhVien[2].equalsIgnoreCase("Nữ")) {
                        sex = 1;
                    }

                    student.setGioiTinh(sex);
                    student.setLopHoc(cr);
                    SinhVienDAO.themSinhVien(student);
                    
                }
                br.close();
            }
            initLayout();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getClassNameInComboBox() {
        String result = jcbLopHoc.getSelectedItem().toString();
        return result;
    }

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
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLopHoc().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnQLMH;
    private javax.swing.JButton btnQLTKB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnThoat;
    private javax.swing.JComboBox jcbLopHoc;
    private javax.swing.JTable jsvTable;
    // End of variables declaration//GEN-END:variables
}
