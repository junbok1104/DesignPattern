package Java.DesignPattern.TemplateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    // Hook 메소드
    boolean customerWantsCondiments() {
        return false;
    }

    public void boilWater(){
        System.out.println("물 끓이기");
    }

    public void pourIncup() {
        System.out.println("컵에 따르는 중");
    }
}