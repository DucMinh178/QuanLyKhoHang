package Model;

import java.util.Date;

public class PhieuNhapModel {

    private String maPhieu;
    private Date ngayLap;

    public PhieuNhapModel() {
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

}
