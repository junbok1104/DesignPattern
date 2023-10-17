package Java.DesignPattern.FactoryMethod;

public interface DefaultMethodEx {
    // 추상 메소드(Abstract Method)
    void printName();
    /**
     * @implSpec
     * 이 구현체는 getPringNameAdded() 으로 가져온 문자열을 소문자로 바꿔 출력한다.
     *
     * */
    default void printNameAdded(String name) {
        System.out.println(getPringNameAdded(name).toLowerCase() + " : this is default method");
    }
    String getPringNameAdded(String name);
}
