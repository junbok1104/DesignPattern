package Java.DesignPattern.Facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void test1() {
        // DB 생성 등록
        DBMS dbms = new DBMS();
        dbms.put("A", new Row("A", "010-1234-5678", "A@nver.com"));
        dbms.put("B", new Row("B", "010-2345-5678", "B@nver.com"));
        dbms.put("C", new Row("C", "010-3678-5678", "C@nver.com"));

        //Cache생성
        Cache cache = new Cache();

        // DB를 조회하기 전, Cache 먼저 확인
        String name = "A";
        Row row = cache.get(name);

        // Cache 데이터 존재유무 확인
        if(row == null) {
            row = dbms.query(name);
            if(row != null) { // 조회된 데이터가 있으면 Cache에 저장
                cache.put(row);
            }
        }

        // dbms에 조회된 데이터 확인
        if(row != null) {
            Message message = new Message(row);

            System.out.println(message.nmakeName());
            System.out.println(message.makeAge());
            System.out.println(message.makeEmail());
        }else {
            System.out.println(name +  " 가 DB에 존재하지 않음.");
        }
    }

    @Test
    void test2() {
        // 퍼사드 (Facade) 객체 생성
        Facade facade = new Facade();

        // db에 insert
        facade.insert();

        // 퍼사드를 통해 캐시, DB 조회 그리고 출력을 한번에 실행
        String name = "A";
        facade.run(name);
    }
}
