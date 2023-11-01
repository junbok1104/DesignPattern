package Java.DesignPattern.Proxy;

public class Proxy3 implements IService3 {
    private Service service; // 대상 객체를 Composition
    boolean access; // 접근권한

    Proxy3(Service service, boolean access) {
        this.service = service;
        this.access = access;
    }

    @Override
    public void runSomething() {
        //권한이 있는지 확인
        if(access) {
            service.runSomething(); // 위임
            System.out.println("프록시 객체 액션");
        }
    }
}