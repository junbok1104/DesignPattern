package Java.DesignPattern.Proxy;

public class Employee2 implements IEmployee{
    private String name;
    private RESPONSIBILITY position;

    public Employee2(String name, RESPONSIBILITY position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public RESPONSIBILITY getPosition() {
        return position;
    }

    @Override
    public String getInfo(IEmployee viewer) {
        return "Display " + getPosition().name() + " '" + getName() + "' personnel information.";
    }
}
