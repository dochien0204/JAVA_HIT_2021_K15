package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> a = new Sum<Integer>(1,2);
        System.out.println("Tổng của 2 số kiểu int 1 và 2 là : " + (a.getSoA() + a.getSoB()) );

        Sum<Long> b = new Sum<Long>(1000000l,9999999l);
        System.out.println("Tổng của 2 số kiểu Long 1000000 và 9999999 là : " + (b.getSoB()+b.getSoA()));

        Sum<Float> c = new Sum<Float>(1.2f, 3.4f);
        System.out.println("Tổng 2 số kiểu float 1.2 và 3.4 là : " + (c.getSoA()+c.getSoB()));

        Sum<Double> d = new Sum<Double>(1.0, 2.1);
        System.out.println("Tổng của 2 số kiểu double 1.0 và 2.1 là : " + (d.getSoA()+d.getSoB()));
    }
}
