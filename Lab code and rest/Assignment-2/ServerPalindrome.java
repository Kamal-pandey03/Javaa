import java.net.*;
import java.io.*;

class ServerPalindrome{
    public static void main(String [] args) throws IOException{
        ServerSocket ss= new ServerSocket(5000);
        System.out.println("Server running at 4390");
        Socket soc = ss.accept();
        System.out.println("Client accepted");
        DataInputStream dis=new DataInputStream(soc.getInputStream());
        String in=dis.readUTF();
        System.out.println(in);
        String s="";
        char ch;
        for(int i=0;i<in.length();i++){
            ch=in.charAt(i);
            s=ch+s;
        }
        System.out.println(s);
        DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
        if(in.equals(s)){
            dos.writeUTF("Palindrome");
        }
        else{
            dos.writeUTF("Not a palindrome");
        }
        dos.close();
        dis.close();
        soc.close();
        ss.close();
    }
}
