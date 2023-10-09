package Proccess;

import java.sql.*;
import Database.Connect;
import Model.CTPhieuXuatModel;

public class PhieuXuat extends CRUID<CTPhieuXuatModel>{

    public Connect cn = new Connect();

    public void connect() throws SQLException {
        cn.connectSQL();
    }
    //Truy van tat ca du lieu trong Table ChiTietPhieuXuat

    public ResultSet ShowChiTietPhieuXuat() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM ChiTietPhieuXuat Order by MaPhieu asc";
        return cn.LoadData(sql);
    }
    //Truy van cac dong du lieu trong Table ChiTietPhieuXuat theo MaPhieu

    public ResultSet ShowChiTietPhieuXuat(String MaPhieu) throws SQLException {
        String sql = "SELECT * FROM ChiTietPhieuXuat where MaPhieu='" + MaPhieu + "'";
        return cn.LoadData(sql);
    }

    public ResultSet ShowChiTietPhieuXuatTheoUser(String userID) throws SQLException {
        String sql = String.format("Select * from ChiTietPhieuXuat where userID='%s'order by Maphieu asc", userID);
//String sql = "SELECT * FROM ChiTietPhieuXuat where userID='" + userID +"'";        
        return cn.LoadData(sql);
    }
    //Theo moi 1 dong du lieu vao table ChiTietPhieuXuat

    @Override
    public void InsertData(CTPhieuXuatModel ct) {

        String sql = String.format("Insert into ChiTietPhieuXuat values (N'%s',N'%s',%d," + ct.getDonGia() + "," + ct.getThanhTien() + ",N'%s',N'%s')", ct.getMaPhieu(),
                ct.getMaHang(), ct.getSoLuong(), ct.getNgayLap(), ct.getUserId());
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table ChiTietPhieuXuat

    @Override
    public void EditData(CTPhieuXuatModel ct) {
        String sql = String.format("Update ChiTietPhieuXuat set MaHang=N'%s',SoLuong=%d',DonGia=" + ct.getDonGia()
                + ",ThanhTien=" + ct.getThanhTien() + " where MaPhieu=N'%s'", ct.getMaHang(),
                ct.getSoLuong(), ct.getDonGia(), ct.getThanhTien(), ct.getMaPhieu());
        //String sql = "Update ChiTietPhieuXuat set Tenloai=N'" + tenHang +"' where MaPhieu='" + MaPhieu +"'";        
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table ChiTietPhieuXuat

    @Override
    public void DeleteData(String MaPhieu) {
        String sql = "Delete from ChiTietPhieuXuat where MaPhieu='" + MaPhieu + "'";
        cn.UpdateData(sql);
    }
}
