package Java.DesignPattern.State;

public class OnStateSingleton implements PowerStateSingleton {
    private OnStateSingleton() {};
    private static class SingletonOnState {
        private static final OnStateSingleton INSTANCE = new OnStateSingleton();
    }

    public static OnStateSingleton getInstance() {
        return SingletonOnState.INSTANCE;
    }
    @Override
    public void powerButtonPush(LaptopContextSingleton laptop) {
        System.out.println("노트북 전원 OFF");
        laptop.changeState(OffStateSingleton.getInstance());
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
