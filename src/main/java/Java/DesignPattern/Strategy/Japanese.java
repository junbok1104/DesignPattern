package Java.DesignPattern.Strategy;

public class Japanese implements TranslateStrategy {
    @Override
    public void translate() {
        System.out.println("일본어로 번역합니다.");
    }
}
