package Bai2;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Nhập mảng arr1 : ");
        arr1.inputData();
        System.out.println("Nhập mảng arr2 : " );
        arr2.inputData();
        System.out.println("Mảng có TBC lớn hơn là : ");
        if(arr1.Sum()/arr1.getN() > arr2.Sum()/ arr2.getN())
            arr1.Show();
        else if(arr1.Sum()/arr1.getN() < arr2.Sum()/ arr2.getN())
            arr2.Show();
        else {
            System.out.println("Bye");
        }

    }
}
