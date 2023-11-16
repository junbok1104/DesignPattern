package Java.DesignPattern.TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }
    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    boolean customerWantsCondiments() {
        String answer = "";

        System.out.print("커피에 우유와 설탕을 넣을까요? (y/n) : ");

        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            answer = in.readLine();
        }catch (IOException e) {
            System.out.println("잘못 입력하셨습니다.");
        }

        if(answer.toLowerCase().equals("y")) {
            return true;
        }else {
            return false;
        }
    }
}