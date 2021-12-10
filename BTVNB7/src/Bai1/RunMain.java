package Bai1;

public class RunMain {
    public static void main(String[] args) {
        PerSon person1 = new Employee("Chien", "Ha Noi" , 5000);
        PerSon person2 = new Customer("Tung", "Ha Noi", 10000 );
        System.out.println("Employee's Information");
        person1.display();
        System.out.println();
        System.out.println("Customer's Information");
        person2.display();
    }
}
