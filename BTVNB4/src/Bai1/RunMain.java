package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng cuốn sách : ");
        int n = sc.nextInt();
        Sach[] a = new Sach[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin cuốn sách thứ " + (i + 1) );
            a[i] = new Sach();
            a[i].nhap();
        }

        System.out.println("Thông tin cuốn sách ");
        for(int i = 0 ; i < n; i++)
        {
            System.out.println("Thông tin cuốn sách " + (i+1));
            a[i].xuat();
        }
    }
}
