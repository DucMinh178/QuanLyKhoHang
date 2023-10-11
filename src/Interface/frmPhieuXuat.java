package Interface;

import Model.CTPhieuXuatModel;
import Proccess.HangHoa;
import Proccess.PhieuNhap;
import Proccess.PhieuXuat;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class frmPhieuXuat extends javax.swing.JInternalFrame {

    private final PhieuXuat phieuXuat = new PhieuXuat();
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private boolean cothem = true;
    private final DefaultComboBoxModel comModel = new DefaultComboBoxModel();
    private final HangHoa Loai = new HangHoa();
    private String ID;

    /**
     * Creates new form NewJInternalFrame
     */
    public frmPhieuXuat(String id) throws SQLException {
        initComponents();
        this.ID = id;
        String[] colsName = {"Mã Phiếu", "Mã Hàng", "Số lượng", "Đơn Giá", "Thành Tiền", "Ngày Lập"};
        tableModel.setColumnIdentifiers(colsName);  // đặt tiêu đề cột cho tableModel
        cboMaHang.setModel(comModel);
        JTableLoaiSP.setModel(tableModel);    // kết nối jtable với tableModel  
        ShowData(); // gọi hàm ShowData để đưa dữ liệu vào tableModel và hiện 
        ResultSet rs2 = Loai.ShowHangHoa();
        while (rs2.next()) {
            comModel.addElement(rs2.getString(1));
        }
        setNull();
        setKhoa(true);
        setButton(true);
        JTableLoaiSP.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cboMaHang.addItemListener(new ItemChangeListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaPhieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
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
        txtThanhTien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboMaHang = new javax.swing.JComboBox();
        jSpinner2 = new javax.swing.JSpinner();
        txtDate = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();

        jLabel4.setText("Số Lượng");

        txtDonGia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonGiaFocusLost(evt);
            }
        });
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Mã Phiếu");

        jLabel3.setText("Mã Hàng");

        jLabel5.setText("Đơn Giá");

        jLabel7.setText("Thành Tiền");

        cboMaHang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaHangActionPerformed(evt);
            }
        });

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        jSpinner2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner2MouseClicked(evt);
            }
        });

        a1.setText("Ngày lập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLuu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btKLuu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btThoat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(a1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDate)
                            .addComponent(txtThanhTien)
                            .addComponent(txtMaPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(cboMaHang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jSpinner2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDonGia, txtMaPhieu, txtThanhTien});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btLuu)
                    .addComponent(btKLuu)
                    .addComponent(btThoat))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
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
        String ngay;
        this.txtMaPhieu.setText(null);
        this.txtDonGia.setText(null);
        txtThanhTien.setText(null);
        //this.txtDonGia.setText(null);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        ngay = String.valueOf(dateFormat.format(date));
        this.txtDate.setText(ngay);
        this.txtMaPhieu.requestFocus();
    }

    private void setKhoa(boolean a) {
        this.txtMaPhieu.setEnabled(!a);
        this.txtDonGia.setEnabled(!a);
        txtThanhTien.setEnabled(!a);
        txtDonGia.setEnabled(false);

        //cboMaHang.setEnabled(!a);
        //cboMaHang.setEnabled(!a);
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

    public void ShowData() throws SQLException {
        ResultSet result = phieuXuat.ShowChiTietPhieuXuat();

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
        String maPhieu = txtMaPhieu.getText();
        try {
            if (maPhieu.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + maPhieu + "nay hay khong?", "Thong bao", 2) == 0) {
                    phieuXuat.DeleteData(maPhieu);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
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
        String maPhieu = txtMaPhieu.getText();
        if (maPhieu.length() == 0) //Chua chon Ma loai
            JOptionPane.showMessageDialog(null, "Vui long chon loi can sua", "Thong bao", 1);
        else {
            setKhoa(false);//Mo khoa cac TextField
            this.txtMaPhieu.setEnabled(false);
            setButton(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void JTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableLoaiSPMouseClicked
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        try {
            int row = this.JTableLoaiSP.getSelectedRow();//Lay chi so dong dang chon
            String maPhieu = (this.JTableLoaiSP.getModel().getValueAt(row, 0)).toString();
            ResultSet rs = phieuXuat.ShowChiTietPhieuXuat(maPhieu);
            if (rs.next())//Neu co du lieu
            {
                this.txtMaPhieu.setText(rs.getString("MaPhieu"));
                this.txtDonGia.setText(rs.getString("DonGia"));
                this.txtThanhTien.setText(rs.getString("ThanhTien"));
                jSpinner2.setValue(rs.getString("SoLuong"));
            }
        } catch (SQLException e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableLoaiSPMouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        String maPhieu = txtMaPhieu.getText().trim();
        String maHang = cboMaHang.getSelectedItem().toString().trim();
        int soLuong = (int) jSpinner2.getValue();
        float donGia = Float.parseFloat(txtDonGia.getText().trim());
        float thanhTien = Float.parseFloat(txtThanhTien.getText().trim());
        String ngayLap = txtDate.getText().trim();
        String userID = this.ID;

        if (maPhieu.length() == 0 || maHang.length() == 0)
            JOptionPane.showMessageDialog(null,
                    "Vui long nhap Ma phiếu va mã loai", "Thong bao", 1);
        else if (maPhieu.length() > 20 || maHang.length() > 200)
            JOptionPane.showMessageDialog(null,
                    "Ma hàng chi 20 ky tu, ten hàng la 200", "Thong bao", 1);
        else {
            CTPhieuXuatModel ct = new CTPhieuXuatModel(maPhieu, maHang, soLuong, donGia, thanhTien, ngayLap, userID);
            try {
                if (cothem == true) {    //Luu cho tthem moi{
                    phieuXuat.InsertData(ct);
                    int soLuongTon = 0;
                    HangHoa hh = new HangHoa();
                    hh.conect();
                    ResultSet rs = hh.ShowHangHoa(maHang);
                    if (rs.next()) {
                        soLuongTon = Integer.parseInt(rs.getString("SoLuongTon")) - soLuong;
                    }
                    hh.EditSoLuongTon(maHang, soLuongTon);
                } else //Luu cho sua
                {
                    phieuXuat.EditData(ct);
                }

                ClearData(); //goi ham xoa du lieu tron tableModel
                setKhoa(true);
                ShowData(); //Do lai du lieu vao Table Model

                setButton(true);
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

    private void txtDonGiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonGiaFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDonGiaFocusLost

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void jSpinner2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jSpinner2MouseClicked

    private void cboMaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaHangActionPerformed
//     if()
//        try {
//         // TODO add your handling code here:
//         ResultSet rs= Loai.ShowHangHoa(cboMaHang.getSelectedItem().toString().trim());
//         if(rs.next()){
//             txtDonGia.setText(rs.getString("DonGia"));
//         }
//     } catch (SQLException ex) {
//         Logger.getLogger(frmPhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
//     }

    }//GEN-LAST:event_cboMaHangActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        System.out.println(jSpinner2.getValue().toString().trim());
        System.out.println(txtDonGia.getText().trim());
        int soLuong = 1;
        float donGia = 1;
        float sum;
        soLuong = Integer.parseInt(jSpinner2.getValue().toString().trim());
        donGia = Float.parseFloat(txtDonGia.getText().trim());
        System.out.println(soLuong);
        System.out.println(donGia);

        sum = soLuong * donGia;
        txtThanhTien.setText("" + sum);
    }//GEN-LAST:event_jSpinner2StateChanged

    class ItemChangeListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Object item = event.getItem();
                // do something with object
                try {
                    // TODO add your handling code here:
                    ResultSet rs = Loai.ShowHangHoa(item.toString());
                    if (rs.next()) {
                        txtDonGia.setText(rs.getString("DonGia"));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frmPhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableLoaiSP;
    private javax.swing.JLabel a1;
    private javax.swing.JButton btKLuu;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox cboMaHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
