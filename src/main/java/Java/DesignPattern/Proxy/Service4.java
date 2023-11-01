package Java.DesignPattern.Proxy;

public class Service4 implements IService4 {
    @Override
    public void runSomething() {
        System.out.println("원본 객체 액션");
    }
}
