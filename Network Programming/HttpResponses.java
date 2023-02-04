//Write a program to display all the http responses.
import java.net.*;
import java.io.*;

class HttpResponses {
    public static void main(String [] args) throws IOException{
            URL url=new URL("https://pu.edu.np");
            HttpURLConnection cn=(HttpURLConnection)url.openConnection();
            if(cn.getResponseCode()==HttpURLConnection.HTTP_OK){
                System.out.println("For response code: "+cn.getResponseCode());
                System.out.println("For response message: "+cn.getResponseMessage());
                System.out.println("For connection timeout: "+cn.getConnectTimeout());
                System.out.println("For Encoding: "+cn.getContentEncoding());
                System.out.println("For Length of content: "+cn.getContentLength());
                System.out.println("For content type: "+cn.getContentType());
                System.out.println("For Request type: "+cn.getRequestMethod());
                System.out.println("For date: "+cn.getDate());
            }
    }
}
