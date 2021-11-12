package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a = new DateTime();
    private ArrayList<SanPham> SanPhamList = new ArrayList<>();
    private int n;

    public void inputPhieu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu : ");
        maPhieu = sc.nextLine();
        System.out.print("Nhập tên phiếu : ");
        tenPhieu = sc.nextLine();
        System.out.println("Nhập ngày nhập : ");
        a.inputDate();
        System.out.println("Nhập số sản phẩm : ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i+1));
            SanPham sp = new SanPham();
            sp.inputSP();
            SanPhamList.add(sp);
        }
    }

    public void outputPhieu()
    {
        System.out.println("Mã Phiếu : " + maPhieu);
        System.out.println("Tên Phiếu : " + tenPhieu);
        a.outputDate();
        System.out.printf("%15s %20s %15s %15s %20s" , "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá" , "Thành tiền");
        System.out.println();
        for(int i = 0; i < n; i++)
        {
           SanPhamList.get(i).outputSP();
           System.out.println();
        }
    }
}
