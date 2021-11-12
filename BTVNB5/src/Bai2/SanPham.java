package Bai2;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;

    public void inputSP()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SP : ");
        maSP = sc.nextLine();
        System.out.print("Nhập tên SP : ");
        tenSP = sc.nextLine();
        System.out.print("Nhập sô lượng : ");
        soLuong = sc.nextInt();
        System.out.print("Nhập dơn giá : ");
        donGia = sc.nextFloat();
    }

    public void outputSP()
    {
        System.out.printf("%15s %20s %15s %15s %20s" , maSP, tenSP, soLuong, donGia , getDonGia()*getSoLuong());
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }
}
