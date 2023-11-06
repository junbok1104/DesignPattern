package Java.DesignPattern.Iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Post {
    private String title;
    private LocalDate createdDate;
}
