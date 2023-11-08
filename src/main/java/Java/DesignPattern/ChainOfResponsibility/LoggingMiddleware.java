package Java.DesignPattern.ChainOfResponsibility;

public class LoggingMiddleware extends Middleware2{
    @Override
    public short check(String email, String password) {
        System.out.println("요청을 로깅합니다.");
        return -1; // break 플래그
    }
}