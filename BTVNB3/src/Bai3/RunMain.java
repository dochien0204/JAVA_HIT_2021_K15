package Bai3;
import java.util.Random;
public class RunMain {
    public static void main(String[] args) {
        Random random = new Random();
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        DiepBeDe.setWeaponName("AKM");
        DiepBeDe.setAmmoNumber(100);
        System.out.println("Anh Điệp bê đê dùng " + DiepBeDe.getWeaponName() + " với " + DiepBeDe.getAmmoNumber() + " viên đạn");
        DoanXinhGai.setWeaponName("M416");
        DoanXinhGai.setAmmoNumber(100);
        System.out.println("Anh Doan xinh gái dùng " + DoanXinhGai.getWeaponName() + " với " + DoanXinhGai.getAmmoNumber() + " viên đạn");
        int i = 0;
        while(DiepBeDe.getAmmoNumber() != 0 && DoanXinhGai.getAmmoNumber() != 0)
        {
            i++;
            System.out.println("Lần bắn thứ " + i );
            int x = random.nextInt(10) + 1;
            int y = random.nextInt(10) + 1 ;
            if(DiepBeDe.getAmmoNumber() >= 10)
            {
                DiepBeDe.Shoot(x);
                System.out.print("Anh Điệp vừa bắn mất " + x + " viên đạn ");
            }
            else {
                x = random.nextInt(DiepBeDe.getAmmoNumber() + 1);
                DiepBeDe.Shoot(x);
                System.out.print("Anh Điệp vừa bắn mất " + x + " viên đạn ");
            }
            System.out.println("Số đạn còn " + DiepBeDe.getAmmoNumber());
            if(DoanXinhGai.getAmmoNumber() >= 10)
            {
                DoanXinhGai.Shoot(y);
                System.out.print("Anh Doan vừa bắn mất " + y + " viên đạn ");
            }
            else {
                y = random.nextInt(random.nextInt(DoanXinhGai.getAmmoNumber()) +1);
                DoanXinhGai.Shoot(y);
                System.out.print("Anh Doan vừa bắn mất " + y + " viên đạn ");
            }
            System.out.println("Số đạn còn " + DoanXinhGai.getAmmoNumber());
            if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0)
            {
                System.out.println("Cả hai đã hết đạn. Cả 2 nạp đạn");
                DiepBeDe.Load(random.nextInt(10) +1);
                DoanXinhGai.Load(random.nextInt(10) +1);
            }
            else {
                if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() != 0)
                {
                    System.out.println("Anh Điệp bê đê đã hết đạn. Anh Điệp bê đê thua !");
                    break;
                }
                if(DoanXinhGai.getAmmoNumber() == 0 && DiepBeDe.getAmmoNumber() != 0)
                {
                    System.out.println("Anh Doan xinh gái đã hết đạn. Anh Doan xinh gái thua");
                    break;
                }
            }
        }

    }
}
