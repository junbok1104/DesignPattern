package Java.DesignPattern.Visitor;

public interface ShapeAfter {
    // Visitor로 Dispatch하기 위한 기능
    void accept(DeviceAfter device);
}