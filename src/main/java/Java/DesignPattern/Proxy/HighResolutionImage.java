package Java.DesignPattern.Proxy;

public class HighResolutionImage implements IImage{
    String img;

    public HighResolutionImage(String img) {
        loadImage(img);
    }

    private void loadImage(String path) {
        // 이미지를 디스크에서 불러와 메모리에 적재
        // 작업 자체가 무겁고 많은 자원을 필요로함
        try {
            Thread.sleep(1000);
            img = path;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s 에 있는 이미지 로딩 완료\\n", path);
    }

    @Override
    public void showImage() {
        // 이미지를 화면에 렌더링
        System.out.printf("%s 이미지 출력\\n", img);
    }
}
