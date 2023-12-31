package Model;

public class LoaiSPModel {

    private String maLoai;
    private String tenLoai;
    private String maNCC;

    public LoaiSPModel() {
    }

    public LoaiSPModel(String maLoai, String tenLoai, String maNCC) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maNCC = maNCC;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

}
