package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        ArrayList<DieuHoa> DieuHoaList = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin điều hóa thứ " + (i+1));
            DieuHoa dieuHoa = new DieuHoa();
            dieuHoa.nhap();
            DieuHoaList.add(dieuHoa);
        }

        System.out.println("Danh sách các điều hòa có hãng SX là Electrolux : ");
        int dem = 0;
        for(int i = 0; i < n; i++)
        {
            if(DieuHoaList.get(i).getTenHangSX().compareTo("Electrolux") == 0 )
            {
                DieuHoaList.get(i).xuat();
                dem++;
            }
        }
        if(dem == 0) System.out.println("Không có điều hòa nào có hãng Electrolux");
        double min = DieuHoaList.get(0).getGiaBan();
        System.out.println("Danh sách các điều hòa có giá nhỏ nhất : ");
        for(int i = 0; i < n; i++)
            if(DieuHoaList.get(i).getGiaBan() < min ) min = DieuHoaList.get(i).getGiaBan();
        for(int i = 0; i < n; i++)
            if(DieuHoaList.get(i).getGiaBan() == min)
                DieuHoaList.get(i).xuat();

    }
}
