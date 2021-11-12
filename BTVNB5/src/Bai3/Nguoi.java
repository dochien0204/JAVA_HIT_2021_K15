package Bai3;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và Tên : ");
        hoTen = sc.nextLine();
        System.out.print("Nhập Ngày Sinh : ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập Quê Quán : ");
        queQuan = sc.nextLine();
    }

    public void xuat()
    {
        System.out.printf("%20s %20s %25s", hoTen, ngaySinh, queQuan);
    }
}
