package Bai4;

public class Sum<T> {
    private T soA;
    private T soB;

    public Sum() {
    }

    public Sum(T soA, T soB) {
        this.soA = soA;
        this.soB = soB;
    }

    public T getSoA() {
        return soA;
    }

    public T getSoB() {
        return soB;
    }

    public void setSoA(T soA) {
        this.soA = soA;
    }

    public void setSoB(T soB) {
        this.soB = soB;
    }
}
