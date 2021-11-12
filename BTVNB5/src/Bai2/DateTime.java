package Bai2;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;

    public void inputDate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày : ");
        ngay = sc.nextInt();
        System.out.print("Nhập tháng : ");
        thang = sc.nextInt();
        System.out.print("Nhập năm : ");
        nam = sc.nextInt();
    }

    public void outputDate()
    {
        System.out.println("Ngày nhập : " + ngay + "/" + thang + "/" + nam);
    }
}
