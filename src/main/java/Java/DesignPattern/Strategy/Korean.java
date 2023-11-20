package Java.DesignPattern.Strategy;

public class Korean implements TranslateStrategy {
    @Override
    public void translate() {
        System.out.println("한국어로 번역합니다.");
    }
}