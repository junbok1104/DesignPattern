package Java.DesignPattern.Mediator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

}
