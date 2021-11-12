package Bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoa;

    public SinhVien() {
    }
    public SinhVien(String maSV, String nganh, int khoa) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoa = khoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập mã sinh viên : ");
        maSV = sc.nextLine();
        System.out.print("Nhập ngành : ");
        nganh = sc.nextLine();
        System.out.print("Nhập khóa : ");
        khoa = sc.nextInt();
    }

    public void xuat()
    {
        super.xuat();
        System.out.printf("%15s %15s %10s", maSV, nganh, khoa);
    }
}
