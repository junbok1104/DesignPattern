package Java.DesignPattern.Bridge;

import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    void test1() {
        // Bridge 패턴을 적용하지 않을 시 사용되는 코드
//        Champion AskinAri = new AskinAri();
//        AskinAri.skillQ();
//        AskinAri.skillR();

        // Bridge 패턴을 적용한 코드
        // 스킨별 캐릭터 클래스를 만들필요없이 새로운 스킨만 생성장에 넣어주면 된다.
        Champion AskinAri = new Ari(new SkinA());
        AskinAri.move();
        AskinAri.skillQ();

        Champion BskinAkali = new Akali(new SkinB());
        BskinAkali.move();
        BskinAkali.skillR();
    }
}
