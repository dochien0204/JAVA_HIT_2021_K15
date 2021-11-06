package Bai4;

import java.util.Scanner;

public class PhongMay {
    Scanner sc = new Scanner(System.in);

    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May[] y;
    int n;

    public void nhap()
    {
        System.out.print("Nhập mã phòng : ");
        maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng : ");
        tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích : ");
        dienTich = sc.nextFloat();
        System.out.println("Nhập thông tin người quản lý ");
        x = new QuanLy();
        x.nhap();
        System.out.print("Nhập số máy : ");
        n = sc.nextInt();
        y = new May[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin máy thứ " + (i+1));
            y[i] = new May();
            y[i].nhap();
        }
    }

    public void xuat()
    {
        System.out.println("Mã Phòng : " + maPhong);
        System.out.println("Tên Phòng : " + tenPhong);
        System.out.println("Diện tích : " + dienTich);
        x.xuat();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Thông tin máy thứ " + (i+1));
            y[i].xuat();
        }
    }
}
