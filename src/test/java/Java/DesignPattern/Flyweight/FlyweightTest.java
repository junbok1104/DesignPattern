package Java.DesignPattern.Flyweight;

import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    void client1() {
        // 플라이웨이트 패턴 적용 전 테스트 코드

//        Character c1 = new Character('H',"yellow", "Nanum", 12);
//        Character c2 = new Character('I',"white", "Nanum", 12);

        // 플라이웨이트 패턴 적용 후 테스트 코드
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('H',"white",fontFactory.getFont("Nan-um,12"));
        Character c2 = new Character('I',"white",fontFactory.getFont("Nan-um,12"));

        System.out.println(c1.getFont());
        System.out.println(c2.getFont());
        // 같은 인스턴스 사용
    }

    @Test
    void client2() {
        // 지형 생성
        Terrain terrain = new Terrain();

        // 지형에 Oak 나무 5그루 생성
        for(int i=0; i<5; i++) {
            terrain.render("Oak",
                    new Object(),
                    new Object(),
                    Math.random() * Terrain.CANVAS_SIZE,
                    Math.random() * Terrain.CANVAS_SIZE
            );
        }

        // 지형에 Acacia 나무 5그루 생성
        for(int i=0; i<5; i++) {
            terrain.render(
                    "Acacia",
                    new Object(),
                    new Object(),
                    Math.random() * Terrain.CANVAS_SIZE,
                    Math.random() * Terrain.CANVAS_SIZE
            );
        }

        // 지형에 Jungle 나무 5그루 생성
        for(int i=0; i<5; i++) {
            terrain.render(
                    "Jungle",
                    new Object(),
                    new Object(),
                    Math.random() * Terrain.CANVAS_SIZE,
                    Math.random() * Terrain.CANVAS_SIZE
            );
        }

        // 총 메모리 사용량
        Memory.print();
    }
}