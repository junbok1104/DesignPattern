package Java.DesignPattern.State;

public class OffStateSingleton implements PowerStateSingleton {
    private OffStateSingleton() {};

    private static class SingletonOffState {
        private static final OffStateSingleton INSTANCE = new OffStateSingleton();
    }
    public static OffStateSingleton getInstance() {
        return SingletonOffState.INSTANCE;
    }
    @Override
    public void powerButtonPush(LaptopContextSingleton laptop) {
        System.out.println("노트북 전원 ON");
        laptop.changeState(OnStateSingleton.getInstance());
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