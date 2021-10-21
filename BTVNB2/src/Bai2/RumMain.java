package Bai2;

import java.util.Scanner;
import java.lang.Math;
public class RumMain {
    static int n;
    static int[] a = new int[100];
    public static void main(String[] args) {
        System.out.println("1. Nhập mảng với n số nguyên");
        System.out.println("2. Hiển thị mảng vừa tạo");
        System.out.println("3. Thêm 1 phần tử vào vị trí k bất kì");
        System.out.println("4. Xóa một phần tử tại vị trí k bất kì");
        System.out.println("5. Đảo ngược mảng");
        System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1]" );
        System.out.println("7. Xuất ra màn hình tổng các số nguyên tố trong mảng");
        System.out.println("8. Thoát ");

        Scanner sc = new Scanner(System.in);
        int luaChon= 0;

        while(luaChon!=8){

            System.out.print("Nhập lựa chọn của bạn : ");
            luaChon = sc.nextInt();
            if(luaChon == 1) nhapMang();
            else if(luaChon == 2) inMang();
            else if(luaChon == 3) themPhanTu();
            else if(luaChon == 4) xoaPhanTu();
            else if(luaChon == 5) daoNguoc();
            else if(luaChon == 6) hienThia1();
            else if(luaChon == 7) tongSoNguyenTo();
            else if(luaChon == 8 )
            {
                System.out.println("Bạn chọn thoát chương trình ! ");
                break;
            }
            else {
                System.out.println("Lựa chọn của bạn không hợp lệ ! Mời chọn lại !");
            }
        }

    }

    //select 1
    public static void nhapMang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        n = sc.nextInt();
        System.out.println("Nhập các phần tử của mảng : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    //select 2
    public static void inMang()
    {
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    //select 3
    public static void  themPhanTu()
    {
        System.out.println("Bạn chọn thêm phần tử vào mảng : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn thêm : ");
        int k = sc.nextInt();
        if(k < 0 ) k = 0;
        else if(k > n ) k =n;
        System.out.print("Nhập phần tử cần thêm : ");
        int m = sc.nextInt();
        for(int i = n ; i > k; i--)
            a[i] = a[i - 1];
        a[k] = m;
        n++;
        inMang();
    }

    //select 4
    public static void xoaPhanTu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn chọn xóa 1 phần tử của mảng ");
        System.out.print("Nhập vị trí muốn xóa : ");
        int k = sc.nextInt();
        if(k > n ) k = n;
        else if( k < 0) k = 0;
        for(int i = k; i < n; i++)
            a[i] = a[i+1];
        --n;
        inMang();
    }

    //select 5
    public static void daoNguoc()
    {
        int[] b = new int[100];
        System.out.println("Bạn chọn lựa chọn 5 : ");
        for(int i = n - 1 ; i >= 0; i--)
        {
            for(int j = (n-1) - i;;){
                b[j] = a[i];
                break;
            }
        }
        for(int i = 0; i < n; i++)
        {
            a[i] = b[i];
        }
        inMang();
    }

    //select 6
    public static void hienThia1()
    {
        System.out.println("Bạn chọn lựa chọn 6 : ");
        System.out.println("Phần tử a[1] là : " + a[1] );
        System.out.print("Các phần tử chia hết cho a[1] là : ");
        int dem = 0;
        for(int i = 0; i < n; i++)
            if(a[i] % a[1] == 0 && i!= 1)
            {
                dem++;
                System.out.print(a[i] + " ");
            }
        if(dem == 0) System.out.println("Không có phần tử nào trong mảng chia hết cho a[1]");
        System.out.println();
    }

    //select 7
    public static void tongSoNguyenTo()
    {
        boolean kiemTra = false;
        int tong = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] < 2) kiemTra = false;
            else if(a[i] == 2 || a[i] == 3) kiemTra = true;
            else {
                for(int j = 2; j <= Math.sqrt(a[i]); j+=1){
                    if(a[i] % j == 0){
                        kiemTra = false;
                        break;
                    }
                   else {
                       kiemTra = true;
                    }
                }
            }
            if(kiemTra == true) tong+=a[i];
        }
        System.out.println("Tổng của các số nguyên tố là : " + tong );
    }
}
