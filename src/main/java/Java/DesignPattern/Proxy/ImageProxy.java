package Java.DesignPattern.Proxy;

public class ImageProxy implements IImage2 {
    private IImage2 proxyImage;
    private String path;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void showImage() {
        // 고해상도 이미지 로딩
        proxyImage = new HighResolutionImage2(path);
        proxyImage.showImage();
    }
}
