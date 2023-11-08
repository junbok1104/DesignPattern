package Java.DesignPattern.ChainOfResponsibility;

public class UrlParser {
    public static void run(String url) {
        // 프로토콜 파싱
        int index = url.indexOf("://");

        if(index != -1) {
            System.out.println("Protocol : " + url.substring(0,index));
        }else {
            System.out.println("No Protocol");
        }

        // 도메인 파싱
        int startIndex = url.indexOf("://");
        int lastIndex =url.lastIndexOf(":");

        System.out.print("Domain : ");
        if(startIndex == -1) {
            if(lastIndex == -1) {
                System.out.println(url);
            }else {
                System.out.println(url.substring(0, lastIndex));
            }
        }else if(startIndex != lastIndex) {
            System.out.println(url.substring(startIndex + 3, lastIndex));
        }else {
            System.out.println(url.substring(startIndex + 3));
        }

        int index2 = url.lastIndexOf(":");
        if(index2 != -1) {
            String strProt = url.substring(index2 + 1);
            try {
                int port = Integer.parseInt(strProt);
                System.out.println("Port : " + port);
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}