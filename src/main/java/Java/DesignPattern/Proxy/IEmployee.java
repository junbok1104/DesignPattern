package Java.DesignPattern.Proxy;

public interface IEmployee { // 구성원 인터페이스
    String getName(); // 구성원의 이름
    RESPONSIBILITY getPosition(); // 구성원의 직책
    String getInfo(IEmployee viewer); // 구성원의 인사정보
}
