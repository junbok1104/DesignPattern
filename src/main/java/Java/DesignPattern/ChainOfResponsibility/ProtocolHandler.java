package Java.DesignPattern.ChainOfResponsibility;

public class ProtocolHandler extends Handler{
    @Override
    protected void process(String url) {
        int index = url.indexOf("://");
        if(index != -1) {
            System.out.println("Protocol : " + url.substring(0, index));
        }else {
            System.out.println("No Protocol");
        }
    }
}