package Proccess;

import java.sql.*;
import Database.Connect;
import Model.NhaCCModel;

public class NhaCC extends CRUID<NhaCCModel> {

    public Connect cn = new Connect();
    //Truy van tat ca du lieu trong Table NhaCungCap

    public ResultSet ShowNhaCungCap() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM NhaCungCap";
        return cn.LoadData(sql);
    }
    
    public ResultSet SearchNhaCC(String keySearch) {
        String sql = "SELECT * FROM NhaCungCap WHERE MaNhaCungCap like '%' + '" + keySearch + "' + '%' OR TenNhaCungCap like '%' + '" + keySearch + "' + '%'";
        return cn.LoadData(sql);
    } 
    
    //Truy van cac dong du lieu trong Table NhaCungCap theo MaNhaCungCap

    public ResultSet ShowNhaCungCap(String maNCC) throws SQLException {
        String sql = "SELECT * FROM NhaCungCap where MaNhaCungCap='" + maNCC + "'";
        return cn.LoadData(sql);
    }
    //Theo moi 1 dong du lieu vao table NhaCungCap

    @Override
    public void InsertData(NhaCCModel ncc) {
        String sql = String.format("Insert into NhaCungCap values('%s',N'%s',N'%s',%d)", ncc.getMaNCC(), ncc.getTenNCC()
                , ncc.getDiaChi(), ncc.getDienThoai());
        //String sql = "INSERT INTO NhaCungCap values('" + maNCC +"',N'" + tenNCC +"')";        
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table NhaCungCap

    @Override
    public void EditData(NhaCCModel ncc){
        String sql = String.format("Update NhaCungCap set TenNhaCungCap=N'%s',DiaChi=N'%s',DienThoai=%d where MaNhaCungCap='%s'", ncc.getTenNCC()
                , ncc.getDiaChi(), ncc.getDienThoai(), ncc.getMaNCC());
        //String sql = "Update NhaCungCap set Tenloai=N'" + tenNCC +"' where MaNhaCungCap='" + maNCC +"'";        
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table NhaCungCap

    @Override
    public void DeleteData(String maNCC) {
        String sql = "Delete from NhaCungCap where MaNhaCungCap='" + maNCC + "'";
        cn.UpdateData(sql);
    }
}
