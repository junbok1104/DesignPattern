package Java.DesignPattern.Flyweight;

public class Tree {
//    long objSize = 100; // 100MB
    long objSize = 10; // 10MB

// TreeModelFactory로 공유


        //    String type;
//    Object mesh; // 메쉬
//    Object texture; // 나무 껍질 + 잎사귀 텍스처

    // 위치변수
    double positionX;
    double positionY;

    // 나무모델
// 상속이 아닌 합성을 이용
    TreeModel treeModel;

    public Tree(TreeModel treeModel, double positionX, double positionY) {
        this.treeModel = treeModel;
        this.positionX = positionX;
        this.positionY = positionY;

        // 생성한 나무 객체의 메모리 사용량
        Memory.size += this.objSize;

    }
}