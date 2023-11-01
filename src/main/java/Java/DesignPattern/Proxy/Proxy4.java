package Java.DesignPattern.Proxy;

public class Proxy4 implements IService4 {
    private Service service; // 대상 객체를 Composition

    Proxy4(Service service) {
        this.service = service;
    }

    @Override
    public void runSomething() {
        System.out.println("Logging");
        service.runSomething();
        System.out.println("프록시 객체 액션");
        System.out.println("Logging");
    }
}