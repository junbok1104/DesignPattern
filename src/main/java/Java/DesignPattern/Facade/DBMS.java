package Java.DesignPattern.Facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
public class DBMS {
// DB역할을 하는 클래스

    private HashMap<String, Row> db = new HashMap<>();

    public void put(String name, Row row) {
        db.put(name, row);
    }

    public Row query(String name) {
        try {
            Thread.sleep(500); // 0.5초 대기 구현
        }catch (InterruptedException e) {
        }
        return db.get(name);
    }
}
