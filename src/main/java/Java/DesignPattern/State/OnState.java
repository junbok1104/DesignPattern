package Java.DesignPattern.State;

public class OnState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext laptop) {
        System.out.println("노트북 전원 OFF");
        laptop.changeState(new OffState());;
    }
    @Override
    public void typeButtonPush() {
        System.out.println("키 입력");
    }
    @Override
    public String toString() {
        return "노트북이 전원 ON인 상태입니다.";
    }
}