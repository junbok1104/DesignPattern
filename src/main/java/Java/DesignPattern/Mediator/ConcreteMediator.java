package Java.DesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator  implements Mediator {
    private final List<Colleague> users;
    public ConcreteMediator() {
        this.users = new ArrayList<>();
    }
    @Override
    public void addUser(Colleague user) {
        this.users.add(user);
        sendMessage("System > " + user.getName() + "님께서 입장하셨습니다.", null);
    }
    @Override
    public void deleteUser(Colleague user) {
        this.users.remove(user);
        sendMessage("System > " + user.getName() + "님께서 퇴장하셨습니다.", null);
    }
    @Override
    public void sendMessage(String message, Colleague user) {
        for(Colleague _user : this.users) {
            if(_user != user) _user.receive(message);
        }
    }
}