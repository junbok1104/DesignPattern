package Java.DesignPattern.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // 서버 생성 및 등록
        Server server = new Server();
        server.register("A@naver.com", "123");
        server.register("B@naver.com", "456");
        server.register("C@naver.com", "789");
        server.register("jb@naver.com", "1");

        // 인증 로직을 처리하는 핸들러 생성
        LimitLoginAttemptMiddleware middleware1 = new LimitLoginAttemptMiddleware();
        AuthorizeMiddleware middleware2 = new AuthorizeMiddleware(server);
        AuthenticationMiddleware middleware3 = new AuthenticationMiddleware();
        LoggingMiddleware middleware4 = new LoggingMiddleware();

        // 핸들러 체인
        middleware1.setNext(middleware2).setNext(middleware3).setNext(middleware4);

        // 클라이언트로부터 로그인 시도
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\\nEmail : ");
            String email = reader.readLine();

            System.out.print("Password : ");
            String password =  reader.readLine();

            // 핸들러부터 정수 flag를 받아, 정수값에 따라 루프문 다음 동작 처리
            short result = middleware1.check(email, password);

            if(result == -2) {
                throw new RuntimeException("로그인 시도 횟수 초과로 프로그램을 종료합니다.");
            }else if(result == -1) {
                break;
            }else if(result == 0) {
                continue;
            }
        }while (true);
    }
}