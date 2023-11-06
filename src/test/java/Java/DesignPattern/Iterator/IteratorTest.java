package Java.DesignPattern.Iterator;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    void test1() {
        Board board = new Board();
        board.addPost("디자인 패턴", LocalDate.of(2023,11,04));
        board.addPost("디자인 패턴을 공부해요",LocalDate.of(2023,11,03));
        board.addPost("디자인 패턴을 공부시러요",LocalDate.of(2023,11,01));

        // TODO 등록된 순서로 순회하기 -> 클라이언트가 게시판이 list의 구조라는 것을 알고 있어야 하는 순회
        // -> list 타입이 아닌 다른 무엇인가로 변경된다면 클라이언트 코드도 수정되어야 함
        List<Post> posts = board.getPosts();
        for(int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle() + " " + post.getCreatedDate() + "");
        }

        System.out.println();

        //TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p1.getCreatedDate().compareTo(p2.getCreatedDate()));
        for(int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle() + " " + post.getCreatedDate());
        }
    }

    @Test
    void test2() {
        //게시판 생성
        Board board = new Board();

        // 게시판 글 포스팅
        board.addPost("디자인 패턴?", LocalDate.of(2023, 11, 03));
        board.addPost("디자인 패턴은 어렵다", LocalDate.of(2023, 11, 01));
        board.addPost("디자인 패턴은 쉽다", LocalDate.of(2023, 11, 06));
        board.addPost("디자인 패턴 공부는 재밌다", LocalDate.of(2023, 10, 01));

        // 게시글 발행 순서대로 조회
        Iterator<Post> listPostIterator = board.getListPostIterator();
        while (listPostIterator.hasNext()) {
            System.out.println(listPostIterator.next().getTitle());
        }

        // 게시글 날짜별로 조회
        Iterator<Post> datePostIterator = board.getDatePostIterator();
        while (datePostIterator.hasNext()) {
            System.out.println(datePostIterator.next().getTitle());
        }
    }
}
