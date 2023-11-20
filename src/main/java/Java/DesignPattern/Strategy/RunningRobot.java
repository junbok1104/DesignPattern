package Java.DesignPattern.Strategy;

public class RunningRobot extends Robot {
    @Override
    public void display() {
        System.out.println("달리는 로봇");
    }

    @Override
    public void move() {
        System.out.println("달려서 배달합니다.");
    }

    @Override
    public void translate() {
        System.out.println("한국어로 번역합니다.");
    }
}