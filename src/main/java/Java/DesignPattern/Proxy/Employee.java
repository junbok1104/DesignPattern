package Java.DesignPattern.Proxy;

public class Employee {
    private String name;
    private RESPONSIBILITY position;

    public Employee(String name, RESPONSIBILITY position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public RESPONSIBILITY getPosition() {
        return position;
    }

    public String getInfo(Employee viewer) {
        return "Display " + getPosition().name() + " '" + getName() + "' personnel information.";
    }
}
