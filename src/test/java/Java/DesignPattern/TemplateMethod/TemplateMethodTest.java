package Java.DesignPattern.TemplateMethod;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    void test1() {
        PlusFileProcessor plusFileProcessor = new PlusFileProcessor("D:\\A.txt");
        int result1 = plusFileProcessor.process();
        System.out.println(result1);

        MultiplyFileProcessor fileProcessor = new MultiplyFileProcessor("D:\\\\A.txt");
        int result2 = fileProcessor.process();
        System.out.println(result2);
    }

    @Test
    void test2() {
        // 업캐스팅 (고수준 모듈 타입으로 인스턴스화)
        Higher a = new LowerA();
        System.out.println(a.calculate(100,300));

        a = new LowerB();
        System.out.println(a.calculate(100, 300));
    }

    @Test
    void test3() {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("커피를 만드는 중입니다.");
        coffee.prepareRecipe();

        System.out.println("\\n---------------------------\\n");

        CaffeineBeverage tea = new Tea();
        System.out.println("홍차를 만드는 중입니다.");
        tea.prepareRecipe();
    }
}
