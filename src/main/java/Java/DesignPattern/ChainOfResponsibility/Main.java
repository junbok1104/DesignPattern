package Java.DesignPattern.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
// 서버 생성 및 등록
        Server server = new Server();
        server.register("[A@naver.com](mailto:A@naver.com)", "123");
        server.register("[B@naver.com](mailto:B@naver.com)", "456");
        server.register("[C@naver.com](mailto:C@naver.com)", "789");

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
