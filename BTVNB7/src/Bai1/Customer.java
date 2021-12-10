package Bai1;

public class Customer extends PerSon {

    private int balance;

    public Customer() {
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display()
    {
        System.out.println("Customer Name : " + getName());
        System.out.println("Customer Address : " + getAddress());
        System.out.println("Customer balance : " + balance);
    }
}
