package Bai2;

import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    private int [] a;
    private int n;
    public void inputData() {
        System.out.print("Nhập số phần tử của mảng : ");
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n ; i++)
        {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println();
    }

    public void Show()
    {
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public int Sum()
    {
        int sum = 0;
        for(int i= 0 ; i < n ; i++)
            sum += a[i];
        return sum;
    }

    public void Filter(Boolean flag)
    {
       if(flag == true)
       {
           for(int i = 0; i < n; i++)
           {
               if(a[i] % 2 == 0)
                   System.out.print(a[i] + " ");
           }
       }
       else {
           for(int i = 0; i < n; i++)
               if(a[i] % 2 != 0)
                   System.out.print(a[i] + " ");
       }
    }

    public Array()
    {
        n = 0;
        a = null;
    }

    public Array(int[] a, int n)
    {
        this.n = n;
        this.a = a;
    }

    public void setN( int n)
    {
        this.n = n;
    }
    public int getN()
    {
        return n;
    }
    public void setA(int [] a)
    {
        this.a = a;
    }
    public int[] getA()
    {
        return a;
    }
}
