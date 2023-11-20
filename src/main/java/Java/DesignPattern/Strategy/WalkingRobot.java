package Java.DesignPattern.Strategy;

public class WalkingRobot extends Robot {
    @Override
    public void display() {
        System.out.println("걷는 로봇");
    }

    @Override
    public void move() {
        System.out.println("걸어서 배달합니다.");
    }

    @Override
    public void translate() {
        System.out.println("한국어로 번역합니다.");
    }
}
