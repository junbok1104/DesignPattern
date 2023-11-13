package Java.DesignPattern.Observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void test1() {
        ChatServerBefore chatServer = new ChatServerBefore();

        UserBefore user1 = new UserBefore(chatServer);
        user1.sendMessage("테스트", "안녕안녕");
        user1.sendMessage("리얼", "화이팅!");

        // 주체가 주기적으로 요청해서 값을 가져온다
        UserBefore user2 = new UserBefore(chatServer);
        System.out.println(user2.getMessage("테스트"));

        // 주체가 주기적으로 요청해서 값을 가져온다
        user1.sendMessage("테스트", "반갑다");
        System.out.println(user2.getMessage("테스트"));
    }

    @Test
    void test2() {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("A");
        User user2 = new User("B");

        chatServer.register("테스트", user1);
        chatServer.register("테스트", user2);

        chatServer.register("리얼", user1);

        chatServer.sendMessage(user1, "테스트", "안녕안녕");

        System.out.println();

        chatServer.sendMessage(user2, "리얼", "재밌구만~~~" );
    }
}