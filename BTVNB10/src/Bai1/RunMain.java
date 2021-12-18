package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static ArrayList<PerSon> persons = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        try {
            System.out.print("Enter n : ");
            n = sc.nextInt();
            for (int i = 0 ;i < n; i++)
            {
                PerSon person = new PerSon();
                person.input();
                persons.add(person);
            }
        } catch(Exception ex)
        {
            System.out.println("Error ! " + ex.getMessage());
        }


        System.out.println("Sort by id : ");
        Collections.sort(persons);
        for(PerSon person : persons)
            person.output();

        System.out.println("Sort by name : ");
        Collections.sort(persons, new Comparator<PerSon>() {
            @Override
            public int compare(PerSon o1, PerSon o2) {
                if(o1.name.compareTo(o2.name) == 0)
                    return o1.address.compareTo(o2.address);
                return o1.name.compareTo(o2.name);
            }
        });
        for(PerSon person : persons)
            person.output();
    }
}
