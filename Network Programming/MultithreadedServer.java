//Create a multithreaded multiuser TCP client server application.

import java.net.*;
import java.io.*;

class MultithreadedServer{
    public static void main(String [] args) throws IOException{
        ServerSocket listener=new ServerSocket(5000);
        System.out.println("System running at 5000");
        while(true){
            Socket soc=listener.accept();
            ClientHandler thread=new ClientHandler(soc);
            thread.start();
        }
    }
}
class ClientHandler extends Thread{
    private Socket socket;
    public ClientHandler(Socket soc){
        this.socket=soc;
    }
    public void run(){
        try{
            System.out.println("System connected");
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
            while(true){
                String in=dis.readUTF();
                dos.writeUTF(checkPalindrome(in));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static String checkPalindrome(String str){
        String s="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            s=ch+s;
        }
        System.out.println(s);
        if(str.equalsIgnoreCase(s))
            return ("Palindrome");
        else
            return ("Not a palindrome");
    }
}