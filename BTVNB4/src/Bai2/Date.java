package Bai2;

import java.util.Scanner;

public class Date {

    Scanner sc = new Scanner(System.in);
    private int d;
    private int m;
    private int y;

    public void nhap()
    {
        System.out.print("Nhập ngày sinh : ");
        d = sc.nextInt();
        System.out.print("Nhập tháng sinh : ");
        m = sc.nextInt();
        System.out.print("Nhập năm sinh : ");
        y = sc.nextInt();
    }

    public void xuat()
    {
        System.out.println("Ngày sinh : " + d + "/" + m + "/" +y);
    }
}
