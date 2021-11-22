package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static ArrayList<Book> BookList = new ArrayList<>();
    public static void main(String[] args) {

        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Book");
        System.out.println("2. Edit book by id");
        System.out.println("3. Delete book by id");
        System.out.println("4. Sort books by name (ascending)");
        System.out.println("5. Sort books by price (descending)");
        System.out.println("6. Show all books" );
        System.out.println("7.  Exit. ");
        int luaChon = 0;
        while(luaChon!=8){

            System.out.print("Nhập lựa chọn của bạn : ");
            luaChon = sc.nextInt();
            if(luaChon == 1) addBook(b);
            if(luaChon == 2) editById(BookList);
            if(luaChon == 3) deleteBook(BookList);
            if(luaChon == 4) sortByName( BookList);
            if(luaChon == 5) sortByPrice(BookList);
            if(luaChon == 6) showAll(BookList);
            if(luaChon == 7) break;
            else {
                System.out.println("Lựa chọn của bạn không hợp lệ ! Mời chọn lại !");
            }
        }
    }

    public static void addBook(Book b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID book : ");
        b.id = sc.nextLine();
        System.out.println("Nhập tên sách : ");
        b.name = sc.nextLine();
        System.out.println("Nhập nhà xuất bản : ");
        b.publisher = sc.nextLine();
        System.out.println("Nhập giá sách : ");
        b.price = sc.nextFloat();
        System.out.println("Nhập số trang : ");
        b.setSoTrang(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên tác giá : ");
        b.setTacGia(sc.nextLine());
        BookList.add(b);
    }

    public static void editById(ArrayList<Book> BookList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn ID sách muốn sửa : ");
        String idSua;
        idSua = sc.nextLine();
        for(int i = 0; i < BookList.size(); i++)
        {
            if(BookList.get(i).id.compareTo(idSua) == 0)
            {
                System.out.println("Chọn thuộc tính sách muốn sửa : ");
                System.out.println("1. Tên");
                System.out.println("2. Nhà XB");
                System.out.println("3. Giá");
                System.out.println("4. Số trang");
                System.out.println("5. Tác giả");
                int choose;
                System.out.println("Nhập thuộc tính muốn sửa : ");
                choose = sc.nextInt();
                do {
                    if(choose == 1 )
                    {
                        sc.nextLine();
                        System.out.println("Nhập tên thay thế : ");
                        String tenThay;
                        tenThay = sc.nextLine();
                        BookList.get(i).name = tenThay;
                    }
                    else if(choose == 2)
                    {
                        sc.nextLine();
                        System.out.println("Nhập tên NXB mới : ");
                        String newNXB;
                        newNXB = sc.nextLine();
                        BookList.get(i).publisher = newNXB;
                    }
                    else if(choose == 3)
                    {
                        sc.nextLine();
                        System.out.println("Nhập giá mới : ");
                        int newPrice;
                        newPrice = sc.nextInt();
                        BookList.get(i).price = newPrice;
                    }
                    else if(choose == 4)
                    {
                        sc.nextLine();
                        System.out.println("Nhập số trang mới : ");
                        int newNumber;
                        newNumber = sc.nextInt();
                        BookList.get(i).setSoTrang(newNumber);
                    }
                    else if(choose == 5 )
                    {
                        sc.nextLine();
                        System.out.println("Nhập tên tác giả mới : ");
                        String newTacGia;
                        newTacGia = sc.nextLine();
                        BookList.get(i).setTacGia(newTacGia);
                    }
                    else if(choose > 5 && choose < 1) System.out.println("Nhập sai nhập lại");
                }
                while (choose > 5 && choose < 1);
            }
        }

    }

    public static void deleteBook(ArrayList<Book> BookList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID đối tượng book cần xóa : ");
        String idNew;
        idNew = sc.nextLine();
        for(int i = 0; i < BookList.size(); i++)
        {
            if(BookList.get(i).id.compareTo(idNew) == 0)
                BookList.remove(i);
        }
    }

    public static void sortByName(ArrayList<Book> BookList)
    {

    }

    public static void sortByPrice(ArrayList<Book> BookList)
    {
        for(int i = 0; i < BookList.size(); i++)
        {
            for(int j = i + 1; j < BookList.size(); j++)
            {
                if(BookList.get(j).price > BookList.get(i).price )
                    Collections.swap(BookList, i, j);
            }
        }
    }

    public static void showAll(ArrayList<Book> BookList)
    {
        System.out.println(BookList);
    }


}
