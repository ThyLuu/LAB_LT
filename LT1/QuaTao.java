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
public class QuaTao extends HoaQua{
    private String mau;

    public QuaTao() {
        System.out.print("Qua Tao");
    }

    public QuaTao(String mau) {
        this.mau = mau;
    }

    public QuaTao(String mau, double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
        super(giaBan, nguonGoc, ngayNhap, soLuong);
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
 
    public void NhapTao(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = nhap.nextLine();
    }

}
