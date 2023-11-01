package Java.DesignPattern.Proxy;

public class Proxy2 implements IService2 {
    private Service service; // 대상 객체를 Composition

    Proxy2() {
    }

    @Override
    public void runSomething() {
        // 프록시 객체는 실제 요청이 들어왔을 때 실제 객체를 생성
        if(service == null) {
            service = new Service();
        }
        service.runSomething(); // 위임
        System.out.println("프록시 객체 액션");
    }
}