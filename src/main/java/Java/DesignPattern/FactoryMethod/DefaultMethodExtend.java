package Java.DesignPattern.FactoryMethod;

public interface DefaultMethodExtend extends DefaultMethodEx {
    // DefaultMethodEx의 printNameAdded() 메소드를 defaulut로 두고 싶지 않을 때, 다시 추상 메서드로 변경할 수 있다.
    void printNameAdded();
}
