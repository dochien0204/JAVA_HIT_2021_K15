package Bai3;

import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
public class RunMain {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi : ");
        String s = sc.nextLine();
        System.out.println("\nChuỗi đó là : " + s);
        int tong = 0;
        int dem = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char pos = s.charAt(i);
            if(pos >= '0' && pos <= '9')
            {
                dem++;
                tong+= Character.getNumericValue(pos);
            }
        }
        if(dem == 0 ) System.out.println("False");
        else {
            System.out.println("True");
            System.out.println("Trung bình cộng các chữ số có trong chuỗi : " + (float)tong/dem);
        }
    }
}
