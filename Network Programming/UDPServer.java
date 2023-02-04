/* Create a UDP server and client application */

import java.net.*;
import java.io.*;

class UDPClient{
    public static void main(String [] args) throws IOException{
        DatagramSocket server=new DatagramSocket(5000);
        while(true){
            byte[] rxBuffer=new byte[1024];
            DatagramPacket rxPacket=new DatagramPacket(rxBuffer, rxBuffer.length);
            server.receive(rxPacket);
            String msg=new String(rxPacket.getData());
            System.out.println("Client msg: "+msg);
            //Get Client Address
            InetAddress clientAdd=rxPacket.getAddress();
            int clientPort=rxPacket.getPort();
            System.out.println("Received packet from: "+clientAdd+" : "+clientPort);
        }
    } 
}
