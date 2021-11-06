package Bai4;

import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);

    private String maQL;
    private String hoTen;

    public void nhap()
    {
        System.out.print("Nhập mã quản lý : ");
        maQL = sc.nextLine();
        System.out.print("Nhập họ tên quản lý : ");
        hoTen = sc.nextLine();
    }

    public void xuat()
    {
        System.out.println("Mã quản lý : " + maQL);
        System.out.println("Họ và Tên quản lý : " + hoTen);
    }
}
