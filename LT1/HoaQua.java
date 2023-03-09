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
public class HoaQua {

    private double giaBan;
    private String nguonGoc;
    private String ngayNhap;
    private int soLuong;
    Scanner nhap = new Scanner(System.in);

    public HoaQua() {
    }

    public HoaQua(double giaBan, String nguonGoc, String ngayNhap, int soLuong) {
        this.giaBan = giaBan;
        this.nguonGoc = nguonGoc;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void Nhap(){
        System.out.print("Nhap gia ban: ");
        giaBan = nhap.nextDouble();
        System.out.print("Nhap nguon goc: ");
        nguonGoc = nhap.nextLine();
        
        System.out.print("Nhap ngay nhap: ");
        ngayNhap = nhap.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = nhap.nextInt();
    }
    
}
