package Java.DesignPattern.Visitor;

public class Rectangle implements Shape {
    // Device의 구현체가 추가되더라도 여기 코드가 변경됨
    @Override
    public void printTo(Device device) {
        if(device instanceof Phone) {
            System.out.println("print Rectangle to Phone");
        }
        if(device instanceof Watch) {
            System.out.println("print Rectangle to Watch");
        }
    }
}
