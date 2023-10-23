package Java.DesignPattern.AbstractMethod;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override    public Anchore createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
