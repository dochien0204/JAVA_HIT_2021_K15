package Bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXB;
    private int soTrang;
    private float giaTien;

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã Sách : ");
        maSach = sc.nextLine();
        System.out.print("Nhập tên sách : ");
        tenSach = sc.nextLine();
        System.out.print("Nhập nhà xuất bản : ");
        nhaXB = sc.nextLine();
        System.out.print("Nhập số trang : ");
        soTrang = sc.nextInt();
        System.out.print("Nhập giá tiền : ");
        giaTien = sc.nextFloat();
    }

    public void xuat()
    {
        System.out.println("Mã Sách : " + maSach);
        System.out.println("Tên Sách : " + tenSach);
        System.out.println("Nhà Xuất Bản : " + nhaXB);
        System.out.println("Số trang : " + soTrang);
        System.out.println("Giá tiền : " + giaTien);
    }
}
