package Java.DesignPattern.AbstractMethod;

public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchore createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
