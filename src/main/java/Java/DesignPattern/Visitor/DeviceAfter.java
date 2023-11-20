package Java.DesignPattern.Visitor;

public interface DeviceAfter {
    void print(CircleAfter circle);
    void print(TriangleAfter triangle);
    void print(RectangleAfter rectangle);
}
