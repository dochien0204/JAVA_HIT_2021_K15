package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    private static ArrayList<News> newsList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");

        do {
            System.out.print("Enter your selection : ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    firstSelection();
                    break;
                case 2:
                    secondSelection();
                    break;
                case 3:
                    thirdSelection();
                    break;
                case 4:
                    System.out.println("Exit menu !");
                    System.exit(1);
            }
            if(choose < 1 || choose > 4){
                System.out.println("Not find your selection ! Enter again");
            }
        }
        while(true);
    }

    //case 1
    public static void firstSelection()
    {
        News news = new News();
        sc.nextLine();
        System.out.print("Enter title : ");
        news.setTitle(sc.nextLine());
        System.out.print("Enter publish date : ");
        news.setPublishDate(sc.nextLine());
        System.out.print("Enter author : ");
        news.setAuthor(sc.nextLine());
        System.out.print("Enter content : ");
        news.setContent(sc.nextLine());
        System.out.println("Enter three votes : ");
        news.enterRate();
        newsList.add(news);
    }

    //case 2
    public static void secondSelection()
    {
        if(newsList.size() == 0)
        {
            System.out.println("No have News befor ! Back to menu and choose selection one to add News");
        }x`
        else {
            for (int i = 0; i < newsList.size(); i++) {
                newsList.get(i).display();
            }
        }
    }

    //case 3
    public static  void thirdSelection()
    {
        if(newsList.size() == 0)
        {
            System.out.println("No have News befor ! Back to menu and choose selection one to add News");
        }
        else {
            for (int i = 0; i < newsList.size(); i++) {
                System.out.println("Average Rate : " + newsList.get(i).caculate());
                newsList.get(i).display();
            }
        }
    }
}