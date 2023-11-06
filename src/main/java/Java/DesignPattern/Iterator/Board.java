package Java.DesignPattern.Iterator;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class Board {
    private final List<Post> posts = new ArrayList<>();

    public void addPost(String title, LocalDate date) {
        posts.add(new Post(title, date));
    }

    public List<Post> getPosts() {
        return posts;
    }

    // ListPostIterator 이터레이터 객체 반환
    public Iterator<Post> getListPostIterator() {
        return new ListPostIterator(posts);
    }

    // DatePostIterator 이터레이터 객체 반환
    public Iterator<Post> getDatePostIterator() {
        return new DatePostIterator(posts);
    }

}
