package Proccess;

import java.sql.*;
import Database.Connect;
import Model.LoaiSPModel;

public class LoaiSP extends CRUID<LoaiSPModel> {

    public Connect cn = new Connect();
    //Truy van tat ca du lieu trong Table LoaiHang

    public ResultSet ShowLoaiHang() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM LoaiHang";
        return cn.LoadData(sql);
    }

    public ResultSet SearchLoaiHang(String keySearch) {
        String sql = "SELECT * FROM LoaiHang WHERE MaLoai like '%' + '" + keySearch + "' + '%' OR TenLoai like '%' + '" + keySearch + "' + '%'";
        return cn.LoadData(sql);
    }
    //Truy van cac dong du lieu trong Table LoaiHang theo Maloai

    public ResultSet ShowLoaiHang(String ml) throws SQLException {
        String sql = "SELECT * FROM LoaiHang where Maloai='" + ml + "'";
        return cn.LoadData(sql);
    }
    //Theo moi 1 dong du lieu vao table LoaiHang

    @Override
    public void InsertData(LoaiSPModel lsp) {
        String sql = "INSERT INTO LoaiHang values('" + lsp.getMaLoai() + "',N'" + lsp.getTenLoai() + "','" + lsp.getMaNCC() + "')";
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table LoaiHang

    @Override
    public void EditData(LoaiSPModel lsp) {
        String sql = "Update LoaiHang set Tenloai=N'" + lsp.getTenLoai() + "',MaNhaCungCap='" + lsp.getMaNCC() + "' where Maloai='" + lsp.getMaLoai() + "'";
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table LoaiHang

    @Override
    public void DeleteData(String ml) {
        String sql = "Delete from LoaiHang where Maloai='" + ml + "'";
        cn.UpdateData(sql);
    }
}
