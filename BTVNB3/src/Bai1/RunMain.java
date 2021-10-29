package Bai1;

public class RunMain {
    public static void main(String[] args) {
        PerSon p = new PerSon();
        p.setName("Đỗ Xuân Chiến");
        p.setAge(19);
        p.setGender("Nam");
        p.setHobby("Viết code, Chơi game, ...");
        System.out.println(p);
        PerSon a = new PerSon("Đỗ Xuân Chiến" , 19 , "Nam", "Chơi game, Nghe nhạc");
        System.out.println(a);
    }
}
