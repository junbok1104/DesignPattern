package Java.DesignPattern.Visitor;

public class RectangleAfter implements ShapeAfter {
    @Override
    public void accept(DeviceAfter device) {
        device.print(this);
    }
}