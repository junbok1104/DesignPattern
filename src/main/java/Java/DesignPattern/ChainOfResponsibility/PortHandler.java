package Java.DesignPattern.ChainOfResponsibility;

public class PortHandler extends Handler{
    @Override
    protected void process(String url) {
        int index = url.lastIndexOf(":");

        if(index != -1) {
            String strProt = url.substring(index + 1);
            try {
                int port = Integer.parseInt(strProt);
                System.out.println("Port : " + port);
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}