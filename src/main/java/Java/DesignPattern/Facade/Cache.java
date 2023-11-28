package Java.DesignPattern.Facade;

import java.util.HashMap;

public class Cache {
    //DB에서 조회된 데이터를 임시 저장해주는 Cache
    private HashMap<String, Row> cache = new HashMap<>();

    public void put(Row row) {
        cache.put(row.getName(), row);
    }

    public Row get(String name) {
        return cache.get(name);
    }
}
