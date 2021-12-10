package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class News implements INews {

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private List<Integer> rateList = new ArrayList<>(3);

    public List<Integer> getRateList() {
        return rateList;
    }

    public void setRateList(List<Integer> rateList) {
        this.rateList = rateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display()
    {
        System.out.println("Title : " + title
        + ", Publish Date : " + publishDate
        + ", Author : " + author
        + ", Content : " + content
        );
        System.out.println("The Votes : ");
        for(int i = 0; i < 3; i++)
        {
            System.out.println("    Vote " + (i+1) + " : " + rateList.get(i));
        }
    }

    public double caculate()
    {
        float average = 0;
        for(int i = 0; i < rateList.size(); i++)
            average += rateList.get(i);
        this.averageRate = average;
        return averageRate/3;
    }

    public void enterRate()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.print("  Enter vote " + i + " : ");
            int vote = sc.nextInt();
            rateList.add(vote);
        }
    }
}
