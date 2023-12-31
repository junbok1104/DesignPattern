package Java.DesignPattern.ChainOfResponsibility;

public class Middleware {
    private int limit = 3;
    private int count = 0;
    Server server;
    public Middleware(Server server) {
        this.server = server;
    }

    // 로그인 횟수 시도
    public boolean limitLoginAttempt() {
        if(count > limit) {
            System.out.println("로그인 요청 횟수 제한!");
            return false;
        }
        count++;
        return true;
    }

    // 아이디, 패스워드 인증
    public boolean authorize(String email, String password) {
        if(!server.hasEmail(email)) {
            System.out.println("가입된 이메일 계정이 없습니다.");
            return false;
        }

        if(!server.isValidPassword(email, password)) {
            System.out.println("패스워드가 다릅니다.");
            return false;
        }
        System.out.println("로그인 성공!");
        return true;
    }

    // 사용자가 관리자 계정인지, 일반 유저인지 검증
    public boolean authentication(String email) {
        if(email.equals("jb@naver.com")) {
            System.out.println("Hi, Admin!");
            return true;
        }else {
            System.out.println("Hi, User!");
            return false;
        }
    }
    // 관리자가 아닌 일반 유저일 경우, 유저의 요청에 대해선 모두 로깅
    public void logging() {
        System.out.println("요청을 로깅합니다.");
    }
}