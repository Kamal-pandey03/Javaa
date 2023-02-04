import java.net.*;
import java.io.*;
import java.util.Scanner;

class ClientPalindrome{
    public static void main(String [] args) throws IOException{
        Socket soc = new Socket("localhost",5000);
        DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any string to check for palindrome or not: ");
        String str=s.next();
        dos.writeUTF(str);
        DataInputStream dis=new DataInputStream(soc.getInputStream());
        String msg=dis.readUTF();
        System.out.println("Message from server: "+msg);
        dis.close();
        dos.close();
        soc.close();
        s.close();
    }
}