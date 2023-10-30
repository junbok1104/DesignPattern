package Java.DesignPattern.Flyweight;

public class TreeModel {
    // 메쉬, 텍스처 총 사이즈
    long objSize = 90; // 90MB
    String type; // 나무종류
    Object mesh; // 메쉬
    Object texture; // 나무 껍질 + 잎사귀 텍스쳐

    public TreeModel(String type, Object mesh, Object texture) {
        this.type = type;
        this.mesh = mesh;
        this.texture = texture;

        // 나무 객체를 생성한 메모리
        Memory.size += this.objSize;
    }
}
