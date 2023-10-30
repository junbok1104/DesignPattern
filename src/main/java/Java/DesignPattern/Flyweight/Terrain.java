package Java.DesignPattern.Flyweight;

public class Terrain {
    //지형 타일 크기
    static final int CANVAS_SIZE = 10000;

    // 나무를 렌더링
    public void render(String type, Object mesh, Object texture, double positionX, double positionY) {

        // 플라이웨이트 패턴 적용 전
        // 나무를 지형에 생성


//        Tree tree = new Tree(type, mesh, texture, Math.random() * CANVAS_SIZE, Math.random() * CANVAS_SIZE ) ;

        // 플라이웨이트 패턴 적용 후
        // 캐시 되어있는 나무 모델 객체 가져오기
        TreeModel model = TreeModelFactory.getInstance(type);

        // 재사용한 나무 모델 객체와 변화하는 속성인 좌표값으로 나무 생성
        Tree tree = new Tree(model, positionX, positionY);

        System.out.println("x: " + tree.positionX + " y: " + tree.positionY + "위치에 " + type + " 나무 생성 완료");
    }
}
