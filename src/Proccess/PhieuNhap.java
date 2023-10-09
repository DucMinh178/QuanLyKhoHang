package Proccess;

import java.sql.*;
import Database.Connect;
import Model.CTPhieuNhapModel;

public class PhieuNhap extends CRUID<CTPhieuNhapModel>{

    public Connect cn = new Connect();

    public void connect() throws SQLException {
        cn.connectSQL();
    }
    //Truy van tat ca du lieu trong Table ChiTietPhieuNhap

    public ResultSet ShowChiTietPhieuNhap() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM ChiTietPhieuNhap order by Maphieu asc";
        return cn.LoadData(sql);
    }
    //Truy van cac dong du lieu trong Table ChiTietPhieuNhap theo MaPhieu

    public ResultSet ShowChiTietPhieuNhap(String MaPhieu) throws SQLException {
        String sql = "SELECT * FROM ChiTietPhieuNhap where MaPhieu='" + MaPhieu + "'";
        return cn.LoadData(sql);
    }

    public ResultSet ShowChiTietPhieuNhapTheoUser(String userID) throws SQLException {
        String sql = String.format("Select * from ChiTietPhieuNhap where userID='%s'order by Maphieu asc", userID);
// String sql = "SELECT * FROM ChiTietPhieuNhap where userID='" +userID+"'";        
        return cn.LoadData(sql);
    }
    //Theo moi 1 dong du lieu vao table ChiTietPhieuNhap

    @Override
    public void InsertData(CTPhieuNhapModel ct) {

        String sql = String.format("Insert into ChiTietPhieuNhap values (N'%s',N'%s',%d," + ct.getDonGia() + "," + ct.getThanhTien() + ",N'%s',N'%s')", ct.getMaPhieu(), 
                ct.getMaHang(), ct.getSoLuong(), ct .getNgayLap(), ct.getUserId());
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table ChiTietPhieuNhap

    @Override
    public void EditData(CTPhieuNhapModel ct) {
        String sql = String.format("Update ChiTietPhieuNhap set MaHang=N'%s',SoLuong=%d',DonGia=" + ct.getDonGia() + 
                ",ThanhTien=" + ct.getThanhTien() + " where MaPhieu=N'%s'", ct.getMaHang(), 
                ct.getSoLuong(), ct.getDonGia(), ct.getThanhTien(), ct.getMaPhieu());
        //String sql = "Update ChiTietPhieuNhap set Tenloai=N'" + tenHang +"' where MaPhieu='" + MaPhieu +"'";        
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table ChiTietPhieuNhap

    @Override
    public void DeleteData(String MaPhieu) {
        String sql = "Delete from ChiTietPhieuNhap where MaPhieu='" + MaPhieu + "'";
        cn.UpdateData(sql);
    }
}
