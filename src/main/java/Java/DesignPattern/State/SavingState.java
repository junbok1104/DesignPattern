package Java.DesignPattern.State;

public class SavingState implements PowerState {
    @Override
    public void powerButtonPush(LaptopContext laptop) {
        System.out.println("노트북 전원 ON");
        laptop.changeState(new OnState());
    }
    @Override
    public void typeButtonPush() {
        throw new IllegalStateException("노트북이 절전모드인 상태");
    }

    @Override
    public String toString() {
        return "노트북이 절전모드인 상태입니다.";
    }
}
