package Java.DesignPattern.Visitor;

public class WatchAfter implements DeviceAfter {
    @Override
    public void print(CircleAfter circle) {
        System.out.println("print Circle to Watch");
    }

    @Override
    public void print(TriangleAfter triangle) {
        System.out.println("print Triangle to Watch");
    }

    @Override
    public void print(RectangleAfter rectangle) {
        System.out.println("print Rectangle to Watch");
    }
}
