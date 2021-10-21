package Bai4;

import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
public class RunMain
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi : ");
        String s = sc.nextLine();
        s = s.trim(); //cắt khoảng cách ở 2 đầu
        s = s.replaceAll("\\s{2,}", " "); // thay thế nhiều khoảng trắng bằng 1 khoảng trắng
        s = s.replaceAll("[0-9]", ""); // xóa các kí tự là số
        String a = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(i == 0) a+= Character.toUpperCase(s.charAt(i));
            else {
                if(Character.isWhitespace(s.charAt(i)) == false){
                    if(count == 1){
                        a+= Character.toUpperCase(s.charAt(i));
                        count = 0;
                    }
                    else{
                        a+= s.charAt(i);
                    }
                }
                else {
                    a+= s.charAt(i);
                    count = 1;
                }
            }
        }
        System.out.println(a);
    }
}
