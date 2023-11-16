package Java.DesignPattern.State;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void test1() {
        Laptop laptop = new Laptop();
        laptop.currentStatePrint();

        System.out.println();
        //노트북 켜기
        laptop.powerButtonPush();
        laptop.currentStatePrint();
        laptop.typebuttonPush();

        System.out.println();
        //노트북 절전하기
        laptop.setSavingState();
        laptop.currentStatePrint();

        System.out.println();
        //노트북 절전에서 다시 켜기
        laptop.powerButtonPush();
        laptop.currentStatePrint();

        System.out.println();
        //노트북 끄기
        laptop.powerButtonPush();
        laptop.currentStatePrint();
    }

    @Test
    void test2() {
        LaptopContext laptop = new LaptopContext();
        laptop.currentStatePrint();
        System.out.println("powerState: " + laptop.hashCode());

        // 노트북 켜기
        laptop.powerButtonPush();
        laptop.currentStatePrint();
        laptop.typeButtonPush();
        System.out.println("powerState: " + laptop.hashCode());
        // 노트북 절전
        laptop.setSavingState();
        laptop.currentStatePrint();
        System.out.println("powerState: " + laptop.hashCode());
        // 노트북 절전에서 다시 켜기
        laptop.powerButtonPush();
        laptop.currentStatePrint();
        System.out.println("powerState: " + laptop.hashCode());

        // 노트북 끄기
        laptop.powerButtonPush();
        laptop.currentStatePrint();
        System.out.println("powerState: " + laptop.hashCode());
    }
}
