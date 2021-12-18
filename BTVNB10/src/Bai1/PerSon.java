package Bai1;


import java.util.Comparator;
import java.util.Scanner;

public class PerSon implements Comparable<PerSon>, Comparator<PerSon>{
    public int id;
    public String name;
    public String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public PerSon() {
    }

    public PerSon(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(PerSon o) {
        return getId() - o.getId();
    }

    @Override
    public int compare(PerSon o1, PerSon o2) {
        if(o1.name.compareTo(o2.name) == 0)
            return o1.address.compareTo(o2.address);
        return o1.name.compareTo(o2.name);
    }


    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter address : ");
        address = sc.nextLine();
    }

    public void output()
    {
        System.out.println("ID : " + this.getId() + ", Name : " + this.getName() + ", Address : " + this.getAddress());
    }
}
