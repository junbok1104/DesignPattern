package Java.DesignPattern.ChainOfResponsibility;

public class AuthenticationMiddleware extends Middleware2{
    @Override
    public short check(String email, String password) {
        short flag = 1;

        if(email.equals("jb@naver.com")) {
            System.out.println("Hi, Admin!");
            flag = -1; // break 플래그
        }else {
            System.out.println("Hi, user!");
            flag = super.check(email, password);
        }
        return flag;
    }
}