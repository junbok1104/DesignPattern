package Java.DesignPattern.ChainOfResponsibility;

public abstract class Handler {
    // 체인으로 연결될 핸들러
    protected Handler nextHandler = null;

    // 생성자를 통해 연결시킬 핸들러 등록
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler; // 메서드 체이닝 구성을 위해 인자를 그대로 반환
    }

    // 자식 핸들러에서 구체화 하는 추상 메소드
    protected abstract void process(String url);

    // 핸들러가 요청에 대해 처리하는 메소드
    public void run(String url) {
        process(url);

        // 만일 핸들러가 연결된게 있다면 다음 핸들로 책임을 넘긴다.
        if (nextHandler != null) {
            nextHandler.run(url);
        }
    }
}