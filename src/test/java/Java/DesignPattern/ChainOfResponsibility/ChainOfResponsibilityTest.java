package Java.DesignPattern.ChainOfResponsibility;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChainOfResponsibilityTest {
    @Test
    void test1() {
        String url1 = "http://www.youtube.com:80";
        System.out.println("Input : " + url1);
        UrlParser.run(url1);

        String url2 = "https://aroma-bok.tistory.com:443";
        System.out.println("Input : " + url2);
        UrlParser.run(url2);

        String url3 = "http://localhost:8080";
        System.out.println("Input : " + url2);
        UrlParser.run(url3);
    }

    @Test
    void test2() {
        // 핸들러 생성
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new DomainHandler();
        Handler handler3 = new PortHandler();

        // 핸들러 연결 설정 (handler1 -handler2 - handler3)
        handler1.setNext(handler2).setNext(handler3);

        // 요청 연쇄 실행
        String url1 = "http://www.youtube.com:80";
        System.out.println("Input : " + url1);
        handler1.run(url1);

        String url2 = "https://aroma-bok.tistory.com:443";
        System.out.println("Input : " + url2);
        handler1.run(url2);

        String url3 = "http://localhost:8080";
        System.out.println("Input : " + url2);
        handler1.run(url3);
    }

    @Test
    void test3() throws Exception{
        // 서버 생성 및 등록
        Server server = new Server();
        server.register("A@naver.com", "123");
        server.register("B@naver.com", "456");
        server.register("C@naver.com", "789");

        // 인증 로직을 처리하는 미들웨어 생성
        Middleware middleware = new Middleware(server);

        // 클라이언트로부터 로그인 시도
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\\nEmail : ");
            String email = reader.readLine();

            System.out.print("Password : ");
            String password =  reader.readLine();

            // 만일 로그인 횟수가 남아 있을 경우
            if(middleware.limitLoginAttempt()) {
                // 이메일 패스워드 인증
                if(middleware.authorize(email, password)) {
                    // 인증되었을 경우, 일반 유저 계정인지 관리자 계정인지 검증
                    if(middleware.authentication(email)) {

                    }else {
                        // 관리자가 아닌 일반 유저인 경우 로깅 처리
                        middleware.logging();
                    }
                    break;
                }else {
                    continue;
                }
            }else {
                throw new RuntimeException("로그인 시도횟수 초과호 프로그램을 종료합나다.");
            }
        }while (true);
    }
}