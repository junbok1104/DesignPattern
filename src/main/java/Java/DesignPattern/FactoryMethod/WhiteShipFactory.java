package Java.DesignPattern.FactoryMethod;

public class WhiteShipFactory implements ShipFactoryInterface {

    @Override
    public Ship createShip(String name, String email) {
        return new WhiteShip(name, email);
    }

}
