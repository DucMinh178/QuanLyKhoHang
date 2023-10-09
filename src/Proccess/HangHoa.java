package Proccess;

import java.sql.*;
import Database.Connect;
import Model.HangHoaModel;

public class HangHoa extends CRUID<HangHoaModel> {

    public Connect cn = new Connect();

    public void conect() throws SQLException {
        cn.connectSQL();
    }
    //Truy van tat ca du lieu trong Table HangHoa
    public ResultSet ShowHangHoa() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM HangHoa";
        return cn.LoadData(sql);
    }
    
    //Truy van cac dong du lieu trong Table HangHoa theo MaHang
    public ResultSet ShowHangHoa(String MaHang) throws SQLException {
        String sql = "SELECT * FROM HangHoa where MaHang=N'" + MaHang + "'";
        return cn.LoadData(sql);
    }
    
    public ResultSet SearchHangHoa(String keySearch) {
        String sql = "SELECT * FROM HangHoa WHERE MaHang like '%' + '" + keySearch + "' + '%' OR TenHang like '%' + '" + keySearch + "' + '%'";
        return cn.LoadData(sql);
    }
    
    //Theo moi 1 dong du lieu vao table HangHoa

    /**
     *
     * @param hh
     * @throws SQLException
     */
    @Override
    public void InsertData(HangHoaModel hh){

        String sql = "INSERT INTO HangHoa values('" + hh.getMaHang() + "','" + hh.getMaLoai() + 
                "',N'" + hh.getTenHang() + "',N'" + hh.getDonViTinh() + "'," + hh.getDonGia() + "," + hh.getSoLuongTon() + ")";
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table HangHoa

    @Override
    public void EditData(HangHoaModel hh) {
        String sql = String.format("Update HangHoa set MaLoai=N'%s',TenHang=N'%s',DonViTinh=N'%s',SoLuongTon=%d,DonGia=" + hh.getDonGia() + 
                " where MaHang=N'%s'", hh.getMaLoai(), hh.getTenHang(), hh.getDonViTinh(), hh.getSoLuongTon(), hh.getMaHang());
        //String sql = "Update HangHoa set Tenloai=N'" + tenHang +"' where MaHang='" + MaHang +"'";        
        cn.UpdateData(sql);
    }

    public void EditSoLuongTon(String MaHang, int soLuongTon) throws SQLException {
        String sql = String.format("Update HangHoa set SoLuongTon=%d where MaHang=N'%s'", soLuongTon, MaHang);
        //String sql = "Update HangHoa set Tenloai=N'" + tenHang +"' where MaHang='" + MaHang +"'";        
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table HangHoa

    
    @Override
    public void DeleteData(String MaHang){
        String sql = "Delete from HangHoa where MaHang='" + MaHang + "'";
        cn.UpdateData(sql);
    }
    
}
