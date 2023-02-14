import java.io.IOException;
import java.net.*;
import java.util.Enumeration;
import java.util.*;

public class MultiExample {
    public static void main(String [] args) throws IOException,UnknownHostException{
        System.out.println("1. Hostname and IP address of NCIT ");
        InetAddress local=InetAddress.getByName("www.ncit.edu.np");
        System.out.println("Hostname: "+local.getHostName());
        System.out.println("IP Address: "+local.getHostAddress());
        System.out.println("-----------------------------------------------");

        System.out.println("2. Name and Address of your localhost");
        InetAddress name=InetAddress.getLocalHost();
        System.out.println("Hostname: "+name.getHostName());
        System.out.println("Host IP Address: "+name.getHostAddress());
        System.out.println("-----------------------------------------------");

        System.out.println("3. Loopback Address");
        System.out.println("Loopback Address: "+InetAddress.getLoopbackAddress());
        System.out.println("-----------------------------------------------");

        System.out.println("4. Is 123.1.100 a loopback address, multicast address or global multicast address");
        byte[] b={127,0,0,1};
        InetAddress ip=InetAddress.getByAddress(b);
        System.out.println("Is loopback address? "+ip.isLoopbackAddress());
        System.out.println("Is multicast address? "+ip.isMulticastAddress());
        System.out.println("Is global multicast address? "+ip.isMCGlobal());
        System.out.println("-----------------------------------------------");

        System.out.println("5. Name and Address of all Network Interfaces");
        Enumeration<NetworkInterface> inface=NetworkInterface.getNetworkInterfaces();
        for(NetworkInterface nets:Collections.list(inface)){
            System.out.println("Display name: "+nets.getDisplayName());
            System.out.println("Name: "+nets.getName());
            System.out.println("-----------");
            Enumeration <InetAddress> inet = nets.getInetAddresses();
            for(InetAddress inp:Collections.list(inet)){
                System.out.println("Address: "+inp.getHostAddress());
            }
        }
    }

}
