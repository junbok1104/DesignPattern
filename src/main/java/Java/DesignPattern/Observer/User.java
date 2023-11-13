package Java.DesignPattern.Observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User implements Subscriber{
    private String name;
    @Override
    public void notifyHandleMessage(String message) {
        System.out.println("받는사람 (" + name + ") " + message);
    }
}