package Java.DesignPattern.TemplateMethod;

public class LowerB extends Higher {
    @Override
    int calculate(int n1, int n2) {
        return n1 * n2;
    }
}
