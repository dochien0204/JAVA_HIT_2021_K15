package Bai1;

public class Employee extends PerSon {

    private int salary;

    public Employee() {
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display()
    {
        System.out.println("Employee Name : " + getName());
        System.out.println("Employee Address : " + getAddress());
        System.out.println("Salary : " + salary);
    }
}
