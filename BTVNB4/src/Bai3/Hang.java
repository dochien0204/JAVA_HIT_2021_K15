package Bai3;

import java.util.Scanner;

public class Hang {
    Scanner sc = new Scanner(System.in);

    private String maHang;
    private String tenHang;
    private float donGia;

    public void nhap()
    {
        System.out.print("Nhập mã hàng : ");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng : ");
        tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá : ");
        donGia = sc.nextFloat();
    }

    public void xuat()
    {
        System.out.println("Mã Hàng : " + maHang);
        System.out.println("Tên hàng : " + tenHang);
        System.out.println("Đơn giá : " + donGia);
    }

    public float getDonGia()
    {
        return donGia;
    }
}
