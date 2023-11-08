package Java.DesignPattern.ChainOfResponsibility;

public abstract class Middleware2 {
    //다음 체인으로 연결될 핸들러
    protected Middleware2 nextMiddleware;

    // Setter 메서드를 통해 연결시킬 핸들러를 등록
    public Middleware2 setNext(Middleware2 middleware2) {
        this.nextMiddleware = middleware2;
        return middleware2;
    }
    // 핸들러가 요청에 대해 처리하는 메소드
    public short check(String email, String password) {
/**
 * flag는 클라이언트 실행부에서 while문을 빠져나가기 위한 조건값으로 사용
 * -2 : Excpetion 발생
 * -1 : break 동작 (루프문 종료)
 * 0 : continue 동작 (처음부터 콘솔 입력 받기)
 * 1 : 그대로 처리 진행
 */
        short flag = 1;

        if(nextMiddleware != null) {
            flag = nextMiddleware.check(email, password);
        }
        return flag;
    }

}