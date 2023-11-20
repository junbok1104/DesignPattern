package Java.DesignPattern.Visitor;

import org.junit.jupiter.api.Test;

public class VisitorTest {
    @Test
    void test1() {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Device phone = new Phone();
        Device watch = new Watch();

        rectangle.printTo(watch);
        rectangle.printTo(phone);

        triangle.printTo(watch);
        triangle.printTo(phone);
    }

    @Test
    void test2() {
        ShapeAfter rectangle = new RectangleAfter();
        ShapeAfter circle = new CircleAfter();
        ShapeAfter triangle = new TriangleAfter();

        DeviceAfter phone = new PhoneAfter();
        DeviceAfter watch = new WatchAfter();

        // 상위 타입인 device가 지원이 되지 않음
        rectangle.accept(phone);
        rectangle.accept(watch);

        circle.accept(phone);
        circle.accept(watch);

        triangle.accept(phone);
        triangle.accept(watch);
    }
}