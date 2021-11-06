package Bai3;

import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);

    private String maPhieu;
    private Hang[] x;
    private int n;

    public void nhap()
    {
        System.out.print("Nhập mã phiếu : ");
        maPhieu = sc.nextLine();
        System.out.print("Nhập số mặt hàng : ");
        n = sc.nextInt();
        x = new Hang [n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin mặt hàng thứ " + (i+1));
            x[i] = new Hang();
            x[i].nhap();
        }
    }

    public void xuat()
    {
        float tong = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Thông tin mặt hàng thứ " + (i+1));
            x[i].xuat();
            tong += x[i].getDonGia();
        }

        System.out.println("Tổng tiền của phiếu : " + tong);
    }
}
