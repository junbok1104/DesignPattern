package Java.DesignPattern.Visitor;

public class CircleAfter implements ShapeAfter {
    @Override
    public void accept(DeviceAfter device) {
        device.print(this);
    }
}
