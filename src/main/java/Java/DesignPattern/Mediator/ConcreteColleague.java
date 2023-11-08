package Java.DesignPattern.Mediator;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void send(String message) {
        System.out.println("발신 > " + this.getName() + " : " + message);
        getMediator().sendMessage(message, this);
    }
    @Override
    public void receive(String message) {
        System.out.println("수신 > " + this.getName() + " : " + message);
    }
}