package Java.DesignPattern.Mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {
    @Test
    void test1() {
        Mediator mediator = new ConcreteMediator();

        Colleague user1 = new ConcreteColleague(mediator, "A");
        Colleague user2 = new ConcreteColleague(mediator, "B");
        Colleague user3 = new ConcreteColleague(mediator, "C");
        Colleague user4 = new ConcreteColleague(mediator, "D");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("안녕하세요");

        mediator.deleteUser(user3);
    }
}