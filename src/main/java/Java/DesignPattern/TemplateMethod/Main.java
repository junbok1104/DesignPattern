package Java.DesignPattern.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("커피를 만드는 중입니다.");
        coffee.prepareRecipe();

        System.out.println("\n---------------------------\n");

        CaffeineBeverage tea = new Tea();
        System.out.println("홍차를 만드는 중입니다.");
        tea.prepareRecipe();
    }
}
