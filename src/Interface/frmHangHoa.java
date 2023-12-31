package Interface;

import Model.HangHoaModel;
import Proccess.HangHoa;
import Proccess.LoaiSP;
import Proccess.NhaCC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class frmHangHoa extends javax.swing.JInternalFrame {

    private final HangHoa hang = new HangHoa();
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private boolean cothem = true;
    private final DefaultComboBoxModel comModel = new DefaultComboBoxModel();
    private final LoaiSP Loai = new LoaiSP();

    /**
     * Creates new form NewJInternalFrame
     */
    public frmHangHoa() throws SQLException {
        initComponents();
        String[] colsName = {"Mã Hàng", "Mã Loại", "Tên hàng", "Đơn Vị Tính", "Đơn Giá", "Số lượng tồn"};
        tableModel.setColumnIdentifiers(colsName);  // đặt tiêu đề cột cho tableModel
        jComboBox1.setModel(comModel);
        JTableLoaiSP.setModel(tableModel);    // kết nối jtable với tableModel  
        ShowData(hang.ShowHangHoa()); // gọi hàm ShowData để đưa dữ liệu vào tableModel và hiện 
        setNull();
        setKhoa(true);
        setButton(true);
        JTableLoaiSP.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        btKLuu = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableLoaiSP = new javax.swing.JTable();
        btLuu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        txtSoLuongTon = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboDonViTinh = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        txbTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        jLabel4.setText("Mã Loại");

        btKLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gtk-refresh.png"))); // NOI18N
        btKLuu.setText("K Lưu");
        btKLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKLuuActionPerformed(evt);
            }
        });

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThoatMouseClicked(evt);
            }
        });
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btXoaMouseClicked(evt);
            }
        });
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("DANH MỤC HÀNG HÓA TRONG KHO");

        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        JTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTableLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableLoaiSP);

        btLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_save.png"))); // NOI18N
        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Hàng");

        jLabel3.setText("Tên Hàng");

        jLabel5.setText("Đơn Vị Tính");

        a.setText("Số lượng tồn");

        jLabel7.setText("Đơn giá");

        cboDonViTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cái", "Chai", "Thùng", "Hộp", "Bịch", "Lon", "Thanh", "Miếng", "Lốc", " " }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txbTimKiem.setName(""); // NOI18N

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btKLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btThoat)
                            .addComponent(txbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(a)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtDonGia)
                            .addComponent(txtSoLuongTon)
                            .addComponent(txtMaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(cboDonViTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDonGia, txtMaHang, txtSoLuongTon, txtTenHang});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ClearData() throws SQLException {
        //Lay chi so dong cuoi cung
        int n = tableModel.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableModel.removeRow(i);//Remove tung dong    
        }
    }

    private void setNull() {
        //Xoa trang cac JtextField
        this.txtMaHang.setText(null);
        this.txtTenHang.setText(null);
        //this.txtMaLoai.setText(null);
        txtSoLuongTon.setText(null);
        txtDonGia.setText(null);
        this.txtMaHang.requestFocus();
    }

    private void setKhoa(boolean a) {
        //Khoa hoac mo khoa cho Cac JTextField
        this.txtMaHang.setEnabled(!a);
        this.txtTenHang.setEnabled(!a);
        //this.txtMaLoai.setEnabled(!a);
        txtSoLuongTon.setEnabled(!a);
        txtDonGia.setEnabled(!a);
        cboDonViTinh.setEnabled(!a);
        jComboBox1.setEnabled(!a);

    }

    private void setButton(boolean a) {
        //Vo hieu hoac co hieu luc cho cac JButton
        this.btThem.setEnabled(a);
        this.btXoa.setEnabled(a);
        this.btSua.setEnabled(a);
        this.btLuu.setEnabled(!a);
        this.btKLuu.setEnabled(!a);
        this.btThoat.setEnabled(a);
    }

    public void ShowData(ResultSet result) throws SQLException {
        ResultSet rs2 = Loai.ShowLoaiHang();

        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[6];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[2] = result.getString(3);
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel để hiện thị lên jtable
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update lại trên frame
            }
            comModel.removeAllElements();
            while (rs2.next()) {
                comModel.addElement(rs2.getString(1));
            }
        } catch (SQLException e) {
        }
    }
    private void btKLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKLuuActionPerformed
        // TODO add your handling code here:
        setNull();
        setKhoa(true);
        setButton(true);
    }//GEN-LAST:event_btKLuuActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        setKhoa(false);
        setButton(false);
        setNull();
        cothem = true;
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMouseClicked
        // TODO add your handling code here:
        String maHang = txtMaHang.getText();
        try {
            if (maHang.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + maHang + "nay hay khong?", "Thong bao", 2) == 0) {
                    hang.DeleteData(maHang);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData(hang.ShowHangHoa());//Do du lieu vao table Model
                    setNull();//Xoa trang Textfield
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thong bao", 1);
        }
    }//GEN-LAST:event_btXoaMouseClicked

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        String maHang = txtMaHang.getText();
        if (maHang.length() == 0) //Chua chon Ma loai
        {
            JOptionPane.showMessageDialog(null, "Vui long chon loi can sua", "Thong bao", 1);
        } else {
            setKhoa(false);//Mo khoa cac TextField
            this.txtMaHang.setEnabled(false);
            setButton(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void JTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableLoaiSPMouseClicked
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        try {
            int row = this.JTableLoaiSP.getSelectedRow();//Lay chi so dong dang chon
            String maHang = (this.JTableLoaiSP.getModel().getValueAt(row, 0)).toString();
            ResultSet rs = hang.ShowHangHoa(maHang);
            if (rs.next())//Neu co du lieu
            {
                this.txtMaHang.setText(rs.getString("MaHang"));
                this.txtTenHang.setText(rs.getString("TenHang"));
                //this.txtMaLoai.setText(rs.getString("MaLoai"));
                jComboBox1.setSelectedItem(rs.getString("MaLoai"));
                this.txtDonGia.setText(rs.getString("DonGia"));
                txtSoLuongTon.setText(rs.getString("SoLuongTon"));
                cboDonViTinh.setSelectedItem(rs.getString("DonViTinh"));
            }
        } catch (SQLException e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableLoaiSPMouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        String maHang = txtMaHang.getText().trim();
        String tenHang = txtTenHang.getText().trim();
        String maLoai = jComboBox1.getSelectedItem().toString().trim();
        String donViTinh = cboDonViTinh.getSelectedItem().toString().trim();
        System.out.println(donViTinh);
        int soLuongTon = 1;
        float donGia = 1;
        try {
            soLuongTon = Integer.parseInt(txtSoLuongTon.getText().trim());
            donGia = Float.parseFloat(txtDonGia.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Số lượng tồn và đơn giá phải là định dạng số");
            txtSoLuongTon.setText("");
            txtDonGia.setText("");
            txtSoLuongTon.requestFocus();
            return;
        }

        if (maHang.length() == 0 || tenHang.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Vui long nhap Ma loai va ten loai", "Thong bao", 1);
        } else if (maHang.length() > 20 || tenHang.length() > 200) {
            JOptionPane.showMessageDialog(null,
                    "Ma nhà cung cấp chi 20 ky tu, ten loai la 200", "Thong bao", 1);
        } else {
            try {
                HangHoaModel hh = new HangHoaModel(maHang, maLoai, tenHang, donViTinh, donGia, soLuongTon);
                if (cothem == true) {    //Luu cho tthem moi{
                    if (hang.ShowHangHoa(maHang).next()) {
                        JOptionPane.showMessageDialog(null, "Mã nhà cung cấp trùng");
                        txtMaHang.setText("");
                        txtMaHang.requestFocus();
                        return;
                    } else {
                        hang.InsertData(hh);
                    }
                } else //Luu cho sua
                {
                    hang.EditData(hh);
                }
                ClearData(); //goi ham xoa du lieu tron tableModel
                ShowData(hang.ShowHangHoa()); //Do lai du lieu vao Table Model
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cap nhat that bai", "Thong bao", 1);
            }
            setKhoa(true);
            setButton(true);
            //setNull();
        }
    }//GEN-LAST:event_btLuuActionPerformed

    private void btThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThoatMouseClicked
        // TODO add your handling code here:
        //this.dispose();
    }//GEN-LAST:event_btThoatMouseClicked

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //System.out.println(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        //System.out.println(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        System.out.println(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String keySearch = txbTimKiem.getText();

        try {
            ClearData();
            ShowData(hang.SearchHangHoa(keySearch));
        } catch (SQLException ex) {
            Logger.getLogger(frmHangHoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableLoaiSP;
    private javax.swing.JLabel a;
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox cboDonViTinh;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txbTimKiem;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables
}
