package Interface;

import Proccess.PhieuNhap;
import Proccess.PhieuXuat;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class frmLichSu extends javax.swing.JInternalFrame {

    private final DefaultTableModel tableModel1 = new DefaultTableModel();
    private final DefaultTableModel tableModel2 = new DefaultTableModel();
    private final PhieuNhap pn = new PhieuNhap();
    private final PhieuXuat px = new PhieuXuat();
    private String userID;

    /**
     * Creates new form frmLichSu
     */
    public frmLichSu(String user) throws SQLException {
        initComponents();
        this.userID = user;
        System.out.println(userID);
        pn.connect();
        px.connect();
        String[] colsName = {"Mã Phiếu", "Mã Hàng", "Số lượng", "Đơn Giá", "Thành Tiền", "Ngày Lập"};
        tableModel1.setColumnIdentifiers(colsName);
        tableModel2.setColumnIdentifiers(colsName);
        ResultSet rs1 = pn.ShowChiTietPhieuNhapTheoUser(userID.trim());
        ResultSet rs2 = px.ShowChiTietPhieuXuatTheoUser(userID.trim());
        while (rs1.next()) {
            String rows[] = new String[6];
            rows[0] = rs1.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
            rows[1] = rs1.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
            rows[2] = rs1.getString(3);
            rows[3] = rs1.getString(4);
            rows[4] = rs1.getString(5);
            rows[5] = rs1.getString(6);
            tableModel1.addRow(rows);
        }
        while (rs2.next()) {
            String rows[] = new String[6];
            rows[0] = rs2.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
            rows[1] = rs2.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng
            rows[2] = rs2.getString(3);
            rows[3] = rs2.getString(4);
            rows[4] = rs2.getString(5);
            rows[5] = rs2.getString(6);
            tableModel2.addRow(rows);
        }
        jTable1.setModel(tableModel1);
        jTable2.setModel(tableModel2);
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nhập :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Xuất:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1237, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
