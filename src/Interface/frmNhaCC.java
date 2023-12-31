package Interface;

import Model.NhaCCModel;
import Proccess.LoaiSP;
import Proccess.NhaCC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class frmNhaCC extends javax.swing.JInternalFrame {

    private final NhaCC lsp = new NhaCC();
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private boolean cothem = true;

    /**
     * Creates new form NewJInternalFrame
     */
    public frmNhaCC() throws SQLException {
        initComponents();
        String[] colsName = {"Mã nhà cung cấp", "Tên loai", "địa chỉ", "Điện thoại"};
        tableModel.setColumnIdentifiers(colsName);  // đặt tiêu đề cột cho tableModel
        JTableLoaiSP.setModel(tableModel);    // kết nối jtable với tableModel  
        ShowData(lsp.ShowNhaCungCap()); // gọi hàm ShowData để đưa dữ liệu vào tableModel và hiện 
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

        txtMaLoai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
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
        txtDiaChi = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txbTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        jLabel4.setText("Địa Chỉ");

        btKLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Transfer.png"))); // NOI18N
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
        jLabel1.setText("DANH MỤC NHÀ CUNG CẤP");

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

        jLabel2.setText("Mã Nhà Cung Cấp");

        jLabel3.setText("Tên Nhà Cung Cấp:");

        jLabel5.setText("Điện thoại");

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTenLoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtMaLoai)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(334, 334, 334))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170))
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(btThoat)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiaChi, txtDienThoai, txtMaLoai, txtTenLoai});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
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
        this.txtMaLoai.setText(null);
        this.txtTenLoai.setText(null);
        this.txtDiaChi.setText(null);
        this.txtDienThoai.setText(null);
        this.txtMaLoai.requestFocus();
    }

    private void setKhoa(boolean a) {
        //Khoa hoac mo khoa cho Cac JTextField
        this.txtMaLoai.setEnabled(!a);
        this.txtTenLoai.setEnabled(!a);
        this.txtDiaChi.setEnabled(!a);
        this.txtDienThoai.setEnabled(!a);

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

        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[4];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[2] = result.getString(3);
                rows[3] = result.getString(4);
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel để hiện thị lên jtable
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update lại trên frame
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
        String ml = txtMaLoai.getText();
        try {
            if (ml.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + ml + "nay hay khong?", "Thong bao", 2) == 0) {
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData(lsp.ShowNhaCungCap());//Do du lieu vao table Model
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
        String ml = txtMaLoai.getText();
        if (ml.length() == 0) //Chua chon Ma loai
        {
            JOptionPane.showMessageDialog(null, "Vui long chon loi can sua", "Thong bao", 1);
        } else {
            setKhoa(false);//Mo khoa cac TextField
            this.txtMaLoai.setEnabled(false);
            setButton(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void JTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableLoaiSPMouseClicked
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        try {
            int row = this.JTableLoaiSP.getSelectedRow();//Lay chi so dong dang chon
            String ml = (this.JTableLoaiSP.getModel().getValueAt(row, 0)).toString();
            ResultSet rs = lsp.ShowNhaCungCap(ml);
            if (rs.next())//Neu co du lieu
            {
                this.txtMaLoai.setText(rs.getString("MaNhaCungCap"));
                this.txtTenLoai.setText(rs.getString("TenNhaCungCap"));
                this.txtDiaChi.setText(rs.getString("DiaChi"));
                this.txtDienThoai.setText(rs.getString("DienThoai"));
            }
        } catch (SQLException e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableLoaiSPMouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        String ml = txtMaLoai.getText().trim();
        String tl = txtTenLoai.getText().trim();
        String diaChi = txtDiaChi.getText().trim();
        int dienThoai = 0;
        try {
            dienThoai = Integer.parseInt(txtDienThoai.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Số điện thoại phải nhập định dạng số");
            txtDienThoai.setText("");
            txtDienThoai.requestFocus();
            return;
        }

        if (ml.length() == 0 || tl.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Vui long nhap Ma loai va ten loai", "Thong bao", 1);
        } else if (ml.length() > 20 || tl.length() > 200) {
            JOptionPane.showMessageDialog(null,
                    "Ma nhà cung cấp chi 20 ky tu, ten loai la 200", "Thong bao", 1);
        } else {
            try {
                NhaCCModel ncc = new NhaCCModel(ml, tl, diaChi, dienThoai);
                if (cothem == true) {    //Luu cho tthem moi{
                    if (lsp.ShowNhaCungCap(ml).next()) {
                        JOptionPane.showMessageDialog(null, "Mã nhà cung cấp trùng");
                        txtMaLoai.setText("");
                        txtMaLoai.requestFocus();
                        return;
                    } else {
                        lsp.InsertData(ncc);
                    }
                } else //Luu cho sua
                {
                    lsp.EditData(ncc);
                }
                ClearData(); //goi ham xoa du lieu tron tableModel
                ShowData(lsp.ShowNhaCungCap()); //Do lai du lieu vao Table Model
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

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String keySearch = txbTimKiem.getText();

        try {
            ClearData();
            ShowData(lsp.SearchNhaCC(keySearch));
        } catch (SQLException ex) {
            Logger.getLogger(frmHangHoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableLoaiSP;
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txbTimKiem;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
