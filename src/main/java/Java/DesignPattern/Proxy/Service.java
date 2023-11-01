package Java.DesignPattern.Proxy;

public class Service implements IService{
    @Override
    public void runSomething() {
        System.out.println("원본 객체 액션");
    }
}
