package Java.DesignPattern.Visitor;

public class PhoneAfter implements DeviceAfter{
    @Override
    public void print(CircleAfter circle) {
        System.out.println("print Circle to Phone");
    }

    @Override
    public void print(TriangleAfter triangle) {
        System.out.println("print Triangle to Phone");
    }

    @Override
    public void print(RectangleAfter rectangle) {
        System.out.println("print Rectangle to Phone");
    }
}
