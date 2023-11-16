package Java.DesignPattern.TemplateMethod;

public abstract class Higher {
    final void print(int num) {
        System.out.println(num);
    }
    abstract int calculate(int n1, int n2);
}
