package Java.DesignPattern.FactoryMethod;

public class DefaultMethodExtend2 implements DefaultMethodEx, DefaultMethodEx2 {
    @Override
    public void printName() {

    }
    // 다이아몬드 문제 해결을 위해서, 직접 Override를 해준다.
    @Override
    public void printNameAdded(String name) {
        DefaultMethodEx.super.printNameAdded(name);
    }
    @Override
    public String getPringNameAdded(String name) {
        return null;
    }
}
