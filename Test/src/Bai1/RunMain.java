package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int tich = 1;
        int dem = 0;
        int tong = 0;
        System.out.print("Nhập chuỗi : ");
        s = sc.nextLine();
        for(int i = 0; i < s.length(); i++)
        {
            char pos = s.charAt(i);
            if(pos >= '0' && pos <= '9')
            {
                dem++;
                tong += Character.getNumericValue(pos);
            }
        }
        for (int i = 0; i < s.length(); i++)
        {
            char pos = s.charAt(i);
            if(pos >= '0' && pos <= '9')
            if(tong % Character.getNumericValue(pos) == 0)
                tich *= Character.getNumericValue(pos);
        }
        if(dem == 0) System.out.println("Không có kí tự số nào");
        else {
            System.out.println("Có " + dem + " kí tự số ");
            System.out.println("Tích : " + tich );
        }

    }
}
