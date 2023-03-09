/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt1;

/**
 *
 * @author Administrator
 */
public class CamSanh extends QuaCam{

    private String tinhTrang;

    public CamSanh() {
    }

    public CamSanh(String tinhTrang, String mau) {
        super(mau);
        this.tinhTrang = tinhTrang;
    }

    public CamSanh(String tinhTrang, String mau, double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
        super(mau, giaBan, nguonGoc, ngayNhap, soLuong);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
