package Model;

public class CTPhieuXuatModel {

    private String maPhieu;
    private String maHang;
    private int soLuong;
    private float donGia;
    private float thanhTien;
    private String ngayLap;
    private String userId;

    public CTPhieuXuatModel() {
    }

    public CTPhieuXuatModel(String maPhieu, String maHang, int soLuong, float donGia, float thanhTien, String ngayLap, String userId) {
        this.maPhieu = maPhieu;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.ngayLap = ngayLap;
        this.userId = userId;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
