/**
 * @autor Дмитрий Евтушенко
 */
package ua.zp.brain.labs.oop.basics.network;
import java.io.InputStream;
import java.net.URL;
import java.net.*;
import java.util.Date;

public class IpInfo {
    public static void main(String[] args) throws Exception{
        int c;
        URL url = new URL("http://witest.ru/remoting/get_local_ip_address/");
        URLConnection urlConn = url.openConnection();
        System.out.println("Date: " + urlConn.getDate());
        System.out.println("Type: " + urlConn.getContentType());
        System.out.println("Exp: " + urlConn.getExpiration());
        System.out.println("Last Modify: " + new Date(urlConn.getLastModified()));
        System.out.println("Length: " + urlConn.getContentLength());
        if (urlConn.getContentLength() > 0) {
            System.out.println("=== Content ===");
            try(InputStream input = urlConn.getInputStream()) {
                int i = urlConn.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");
        }
    }
}
