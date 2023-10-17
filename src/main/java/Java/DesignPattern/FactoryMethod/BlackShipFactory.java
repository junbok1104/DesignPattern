package Java.DesignPattern.FactoryMethod;

public class BlackShipFactory implements ShipFactoryInterface {
    @Override
    public Ship createShip(String name, String email) {
        return new BlackShip(name, email);
    }
}
