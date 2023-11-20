package Java.DesignPattern.Strategy;

public class Run implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("달려서 배달합니다.");
    }
}
