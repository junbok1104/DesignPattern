package Java.DesignPattern.Visitor;

public class TriangleAfter implements ShapeAfter {
    @Override
    public void accept(DeviceAfter device) {
        device.print(this);
    }
}