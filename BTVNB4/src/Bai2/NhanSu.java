package Bai2;

import java.util.Scanner;

public class NhanSu {
    Scanner sc = new Scanner(System.in);

    private String maNS;
    private String hoTen;
    Date ns;

    public void nhap()
    {
        System.out.print("Nhập mã nhân sự : ");
        maNS = sc.nextLine();
        System.out.print("Nhập họ và tên : ");
        hoTen = sc.nextLine();
        ns = new Date();
        ns.nhap();
    }

    public void xuat()
    {
        System.out.println("Mã Nhân Sự  : " + maNS);
        System.out.println("Họ và Tên : " + hoTen);
        ns.xuat();
    }
}
