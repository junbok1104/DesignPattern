package Java.DesignPattern.Strategy;

public class CrossBow implements Weapon {
    @Override
    public void offensive() {
        System.out.println("화살을 발사하다.");
    }
}