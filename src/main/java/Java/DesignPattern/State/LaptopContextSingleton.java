package Java.DesignPattern.State;

public class LaptopContextSingleton {
    PowerStateSingleton powerState;

    LaptopContextSingleton() {
        this.powerState = OffStateSingleton.getInstance();
    }

    void changeState(PowerStateSingleton state) {
        this.powerState = state;
    }

    void setSavingState() {
        System.out.println("노트북 절전 모드");
        changeState(new SavingStateSingleton());
    }

    void powerButtonPush() {
        powerState.powerButtonPush(this);
    }
    void typeButtonPush() {
        powerState.typeButtonPush();
    }

    void currentStatePrint() {
        System.out.println(powerState.toString());
    }
}