package Java.DesignPattern.Memento;

import org.junit.jupiter.api.Test;

public class MementoTest {
    @Test
    void test1() {
        GameBefore game = new GameBefore();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        // 클라이언트가 점수 저장
        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        // 값이 변경됨
        game.setBlueTeamScore(15);
        game.setRedTeamScore(28);

        // 저장된 시점으로 복구
        GameBefore restoreGame = new GameBefore();
        restoreGame.setBlueTeamScore(blueTeamScore);
        restoreGame.setRedTeamScore(redTeamScore);
        System.out.println("블루팀 점수 : " + restoreGame.getBlueTeamScore());
        System.out.println("레드팀 점수 : " + restoreGame.getRedTeamScore());
    }

    @Test
    void test2() {
        Game game = new Game();
        // 값 세팅
        game.setBlueTeamScore(30);
        game.setRedTeamScore(15);

        // 저장
        GameSave save = game.save();
        // 변경
        game.setBlueTeamScore(18);
        game.setRedTeamScore(10);

        // 복원
        game.restore(save);
        System.out.println("블루팀 점수 : " + game.getBlueTeamScore());
        System.out.println("레드팀 점수 : " + game.getRedTeamScore());
    }
}
