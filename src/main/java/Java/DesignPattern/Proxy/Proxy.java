package Java.DesignPattern.Proxy;

public class Proxy implements IService {
    private Service service; // 대상 객체를 Composition

    Proxy(Service service) {
        this.service = service;
    }

    @Override
    public void runSomething() {
        service.runSomething(); // 위임
        System.out.println("프록시 객체 액션");
    }
}