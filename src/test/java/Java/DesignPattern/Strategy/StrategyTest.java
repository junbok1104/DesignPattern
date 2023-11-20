package Java.DesignPattern.Strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void test1() {

        //무기 착용 전략 설정
        TakeWeapon hand = new TakeWeapon();

        // 검을 들도록 전략 설정
        hand.setWeapon(TakeWeapon.SWORD);
        hand.attack();

        // 방패를 들도록 전략 설정
        hand.setWeapon(TakeWeapon.SHIELD);
        hand.attack();
    }

    @Test
    void test2() {
        // 무기착용 전략
        TakeWeaponStrategy hand = new TakeWeaponStrategy();

        // 검을 들도록 전략 설정
        hand.setWeapon(new Sword());
        hand.attack();

        // 방패를 들도록 전략 설정
        hand.setWeapon(new Shield());
        hand.attack();

        // 화살을 들도록 전략 설정
        hand.setWeapon(new CrossBow());
        hand.attack();
    }

    @Test
    void test3() {
        Robot robot1 = new WalkingRobot();
        robot1.display();
        robot1.move();

        Robot robot2 = new RunningRobot();
        robot2.display();
        robot2.move();
    }

    @Test
    void test4() {
        RobotContext robot = new RobotContext(new Walk(), new Korean());
        robot.move();
        robot.translate();

        robot.setMoveStrategy(new Run());
        robot.setTranslateStrategy(new Japanese());

        robot.move();
        robot.translate();
    }

    @Test
    void test5() {
        // 쇼핑카트 전략 Context
        ShoppingCart cart = new ShoppingCart();

        // 쇼핑 물품
        Item a = new Item("맥북", 100000);
        Item b = new Item("핸드폰", 300000);
        cart.addItem(a);
        cart.addItem(b);

        // Luna 카드 결제 전략
        cart.pay(new LUNACardStrategy("jb@abc.com", "1234"));

        // Kakao 카드 결제 전략
        cart.pay(new KAKAOCardStrategy("jb", "123456", "123","01/12"));
    }
}
