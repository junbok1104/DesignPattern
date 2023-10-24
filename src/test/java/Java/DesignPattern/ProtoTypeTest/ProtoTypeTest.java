package Java.DesignPattern.ProtoTypeTest;

import Java.DesignPattern.ProtoType.Player;
import Java.DesignPattern.ProtoType.Team;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class ProtoTypeTest {
    @Test
    void test1() {
        Player player = new Player();
        player.loadPlayerDataFromDB();

        Team realMadrid = new Team("realMadrid", player);
        System.out.println(realMadrid);

        Player player2 = new Player();
        player2.loadPlayerDataFromDB();

        Team psg = new Team("psg", player2);
        System.out.println(psg);
    }

    @Test
    void test2() throws CloneNotSupportedException {
            Player player = new Player();
            player.loadPlayerDataFromDB();

            Team realMadrid = new Team("realMadrid", player);
            Team copyRealMadrid = ReflectionTestUtils.invokeMethod(realMadrid,"clone");

            System.out.println("같은 인스턴스인가? " + (realMadrid == copyRealMadrid));
            System.out.println("같은 player 인스턴스를 가지고 있는가? " + (realMadrid.getPlayer() == copyRealMadrid.getPlayer()));
            System.out.println("같은 값을 가지고 있는가? " + realMadrid.getPlayer().equals(copyRealMadrid.getPlayer()));

            assertThat(realMadrid).isEqualTo(copyRealMadrid);
    }

    @Test
    void test3() throws CloneNotSupportedException {
            Player player = new Player();
            player.loadPlayerDataFromDB();

            Team realMadrid = new Team("realMadrid", player);
            Team copyRealMadrid = ReflectionTestUtils.invokeMethod(realMadrid,"clone");

            System.out.println(realMadrid);
            System.out.println(realMadrid.hashCode());
            System.out.println(copyRealMadrid);
            System.out.println(copyRealMadrid.hashCode());
            System.out.println(realMadrid == copyRealMadrid);
            assertThat(realMadrid).isSameAs(copyRealMadrid);
    }
}
