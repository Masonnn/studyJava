package Chapter4.NetWork;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ShowSocketClasses {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = null;
        Socket s;
        InetAddress address = InetAddress.getByName("www.geekbang.com");
        System.out.println(address);


        ss.getLocalSocketAddress();

    }
}
