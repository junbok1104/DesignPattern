package Java.DesignPattern.Proxy;

public class Service2 implements IService2{
    @Override
    public void runSomething() {
        System.out.println("원본 객체 액션");
    }
}
