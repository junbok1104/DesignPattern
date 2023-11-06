package Java.DesignPattern.Iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DatePostIterator implements Iterator<Post> {
    private Iterator<Post> itr;

    public DatePostIterator(List<Post> posts) {
        // 최신 글 목록이 먼저 오도록 정렬
        Collections.sort(posts, (p1, p2) -> p1.getCreatedDate().compareTo(p2.getCreatedDate()));
        this.itr = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.itr.hasNext(); // 자바 내부 이터레이터에 위임
    }

    @Override
    public Post next() {
        return this.itr.next(); // 자바 내부 이터레이터에 위임
    }
}
