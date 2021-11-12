package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    ArrayList<SinhVien> SinhVienList = new ArrayList<>();
    private int n;
    private String giaoVien;

    public LopHoc(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> sinhVienList, int n, String giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        SinhVienList = sinhVienList;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public LopHoc() {
    }

    public String getMaLH() {
        return maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public ArrayList<SinhVien> getSinhVienList() {
        return SinhVienList;
    }

    public int getN() {
        return n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public void setSinhVienList(ArrayList<SinhVien> sinhVienList) {
        SinhVienList = sinhVienList;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học : ");
        maLH = sc.nextLine();
        System.out.print("Nhập tên lớp học : ");
        tenLH = sc.nextLine();
        System.out.print("Nhập ngày mở : ");
        ngayMo = sc.nextLine();
        System.out.print("Nhập số sinh viên : ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên Giáo Viên : ");
        giaoVien = sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            SinhVien sv = new SinhVien();
            sv.nhap();
            SinhVienList.add(sv);
        }
    }

    public void xuat()
    {
        System.out.println();
        System.out.println("Mã Lớp Học : " + maLH);
        System.out.println("Tên Lớp Học : " + tenLH);
        System.out.println("Ngày mở : " + ngayMo);
        System.out.println("Giáo Viên : " + giaoVien);
        System.out.println("Thông tin các sinh viên ");
        System.out.printf("%20s %20s %25s %15s %15s %10s", "Họ và Tên", "Ngày Sinh", "Quê quán", "Mã Sinh Viên", "Ngành", "Khóa");
        System.out.println();
        for(int i = 0 ; i < n; i++)
        {
            SinhVienList.get(i).xuat();
            System.out.println();
        }
    }

    public int demSV()
    {
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(SinhVienList.get(i).getKhoa() == 15)
                dem++;
        }
        return dem;
    }

    public void sapXep()
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(SinhVienList.get(i).getKhoa() > SinhVienList.get(j).getKhoa())
                    Collections.swap(SinhVienList, i , j);
            }
        }
    }
}
