package Bai3;

public class RunMain {
    public static void main(String[] args) {
        LopHoc a = new LopHoc();
        System.out.println("Nhập thông tin lớp học : ");
        a.nhap();
        a.xuat();

        System.out.println("Có " + a.demSV() + " sinh viên khóa 15");

        a.sapXep();
        System.out.println("------------Sau khi sắp xếp-------------------------");
        a.xuat();
    }
}
