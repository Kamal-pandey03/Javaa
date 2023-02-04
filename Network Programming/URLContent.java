/* Write a program to print the content of any given URL. Also save the
content in an index.html file */

import java.net.*;
import java.io.*;

class URLContent{
    public static void main(String [] args) throws IOException{
            URL url=new URL("https://www.netflix.com/np/browse/genre/34399");
            URLConnection cn=url.openConnection();
            InputStream in=cn.getInputStream();
            FileOutputStream fis=new FileOutputStream("index.html");
            DataOutputStream dos=new DataOutputStream(fis);
            int content;
            while((content=in.read())!=-1){
                dos.write(content);
            }
            dos.close();
    }
}