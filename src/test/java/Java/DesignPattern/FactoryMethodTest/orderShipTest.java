package Java.DesignPattern.FactoryMethodTest;

import Java.DesignPattern.FactoryMethod.BlackShipFactory;
import Java.DesignPattern.FactoryMethod.Ship;
import Java.DesignPattern.FactoryMethod.ShipFactory;
import Java.DesignPattern.FactoryMethod.WhiteShipFactory;
import org.junit.jupiter.api.Test;

public class orderShipTest {
    @Test
    void orderShipTest() {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "abc@email.com");
        System.out.println(whiteShip);
        Ship blackShip = ShipFactory.orderShip("BlackShip", "def@email.com");
        System.out.println(blackShip);
    }

    @Test
    void orderShipInterfaceTest() {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip1", "abc@email.cmo");
        System.out.println(whiteShip);
        Ship blackShip = new BlackShipFactory().orderShip("BlackShip1", "def@email.cmo");
        System.out.println(blackShip);
    }
}
