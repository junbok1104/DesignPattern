package Java.DesignPattern.ChainOfResponsibility;

public class AuthorizeMiddleware extends Middleware2{
    private Server server;
    public AuthorizeMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public short check(String email, String password) {
        short flag = 1;

        if(!server.hasEmail(email)) {
            System.out.println("등록되지 않은 이메일입니다!");
            flag = 0; // continue 플래그
        }else if(!server.isValidPassword(email, password)) {
            System.out.println("잘못된 비밀번호입니다!");
            flag = 0 ; // continue 플래그
        }else {
            flag = super.check(email, password);
        }
        return flag;
    }
}
