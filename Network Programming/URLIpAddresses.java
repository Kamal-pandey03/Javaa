/* Write a program that prints all the ip addresses associated with
‘google.com’. */

import java.net.*;

class URLIpAddresses{
    public static void main(String [] args) throws UnknownHostException{
        InetAddress[] local=InetAddress.getAllByName("www.google.com");
        for(InetAddress add:local){
            System.out.println(add.getHostAddress());
        }
    }
}