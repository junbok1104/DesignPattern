package Java.DesignPattern.State;

public class OffState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext laptop) {
        System.out.println("노트북 전원 ON");
        laptop.changeState(new OnState());
    }

    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("노트북이 OFF 인 상태");
    }

    @Override
    public String toString() {
        return "노트북이 전원 OFF인 상태 입니다.";
    }
}
