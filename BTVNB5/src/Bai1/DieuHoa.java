package Bai1;

import java.util.Scanner;

public class DieuHoa  extends  SanPham {
    private float congSuat;
    private double giaBan;

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập Công Suất : ");
        congSuat = sc.nextFloat();
        System.out.print("Nhập giá bán : ");
        giaBan = sc.nextDouble();
    }

    public void xuat()
    {
        super.xuat();
        System.out.println("Công Suất : " + congSuat);
        System.out.println("Giá Bán : " + giaBan);
    }

    public double getGiaBan() {
        return giaBan;
    }
}
