package Java.DesignPattern.Facade;

public class Facade {
    private DBMS dbms = new DBMS();
    private Cache cache = new Cache();

    public void insert() {
        dbms.put("A", new Row("A", "010-1234-5678", "A@nver.com"));
        dbms.put("B", new Row("B", "010-2345-5678", "B@nver.com"));
        dbms.put("C", new Row("C", "010-3678-5678", "C@nver.com"));
    }

    public void run(String name) {
        Row row = cache.get(name);

        // 캐시에서 확인
        if(row == null) {
            row = dbms.query(name); // DB에 해당 데이터를 조회해서 row에 저장
            if(row != null) { // 조호된 데이터가 있다면 캐시에 저장
                cache.put(row);
            }
        }

        // 조회된 row 값이 있으면 출력
        if(row != null) {
            Message message = new Message(row);

            System.out.println(message.nmakeName());
            System.out.println(message.makeAge());
            System.out.println(message.makeEmail());
        }else { // 조호된 내용이 없을 때
            System.out.println(name + " 가 DB에 존재하지 않습니다.");
        }
    }
}
