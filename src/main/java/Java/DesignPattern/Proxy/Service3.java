package Java.DesignPattern.Proxy;

public class Service3 implements IService3 {
    @Override
    public void runSomething() {
        System.out.println("원본 객체 액션");
    }
}