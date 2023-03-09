/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lt1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuaCam extends HoaQua {
    private String mau;

    public QuaCam() {
    }

    public QuaCam(String mau) {
        this.mau = mau;
    }

    public QuaCam(String mau, double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
        super(giaBan, nguonGoc, ngayNhap, soLuong);
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
   public void NhapCam(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = nhap.nextLine();
    }
}
