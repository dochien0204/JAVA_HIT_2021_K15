package Bai1;

import java.util.Scanner;

public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected String tenHangSX;
    protected String ngayNhap;

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm : ");
        maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm : ");
        tenSP = sc.nextLine();
        System.out.print("Nhập tên Hãng sản xuất : ");
        tenHangSX = sc.nextLine();
        System.out.print("Nhập ngày nhập : ");
        ngayNhap = sc.nextLine();
    }

    public void xuat()
    {
        System.out.println("Mã Sản Phẩm : " + maSP);
        System.out.println("Tên Sản Phẩm : " + tenSP);
        System.out.println("Tên Hãng Sản Xuất : " + tenHangSX);
        System.out.println("Ngày nhập : " + ngayNhap);
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }
}
