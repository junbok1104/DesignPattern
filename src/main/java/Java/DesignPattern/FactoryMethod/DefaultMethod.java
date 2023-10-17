package Java.DesignPattern.FactoryMethod;

public class DefaultMethod implements DefaultMethodEx {
    @Override
    public void printName() {
        System.out.println("default Method 개념");
    }

    @Override
    public String getPringNameAdded(String name) {
        return name;
    }
}
