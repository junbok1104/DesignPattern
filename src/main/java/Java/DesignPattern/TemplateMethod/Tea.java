package Java.DesignPattern.TemplateMethod;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("차를 우리는 중");
    }

    @Override
    void addCondiments() {
    }
}