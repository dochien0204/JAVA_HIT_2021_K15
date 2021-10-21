package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        int a = sc.nextInt();
        System.out.print("Nhập b : ");
        int b = sc.nextInt();
        System.out.print("Nhập c : ");
        int c = sc.nextInt();
        System.out.print("Số lón nhất trong 3 số là : " + Max(a,b,c));
    }
    public static int Max(int a, int b , int c)
    {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
}
