package Java.DesignPattern.Decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void test1() {
        Client client = new Client(new CommentService());
        client.writeComment("디자인패턴 공부");
        client.writeComment("디자인패턴 어렵다");
        client.writeComment("디자인패턴 그래도 공부해야지");
        client.writeComment("디자인패턴 잘하고싶다면 >>>> <http://커몬커몬.com>");
    }
    private static boolean spamYn = true;
    private static boolean trimYn = true;

    @Test
    void test2() {

        CommentService commentService = new CommentService();

        if(spamYn) {
            commentService = new SpamFilteringCommentService();
        }

        if(trimYn) {
            commentService = new TrimmingCommentService();
        }

        Client client = new Client(commentService);
        client.writeComment("디자인패턴 공부!!!");
        client.writeComment("디자인패턴 어렵다!!");
        client.writeComment("디자인패턴 그래도 공부해야지!!!!!!");
        client.writeComment("디자인패턴 잘하고싶다면 >>>> <http://커몬커몬.com>");

    }

    @Test
    void test3() {
        CommentServiceForDecorator commentService = new DefaultCommentService();

        if(spamYn) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(trimYn) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        System.out.println(commentService);
        //  new TrimmingCommentDecorator(new SpamFilteringCommentDecorator(new DefaultCommentService()));
        // 이 순서로 생성자가 실행되면서 해당 메소드를 차례차례 실행시키는 원리

        ClientForDecorator client = new ClientForDecorator(commentService);
        client.writeComment("디자인패턴 공부!!!!!!");
        client.writeComment("디자인패턴 어렵다!!!!!!!");
        client.writeComment("디자인패턴 그래도 공부해야지");
        client.writeComment("디자인패턴 잘하고싶다면 >>>> <http://커몬커몬.com>");
        // 이렇게 함으로써 기능이 결합되어 새로운 구현체를 만들지 않고도 trim 기능과 spam filter 기능을 조합할 수 있다.
    }
}
