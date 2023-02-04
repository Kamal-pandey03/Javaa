/* Write a program to illustrate URL processing */

import java.net.*;

class URLProcessing{
    public static void main(String [] args){
        try{
            URL url=new URL("https://www.netflix.com/np/browse/genre/search?name=FAF");
            System.out.println("URL: "+url.toString());
            System.out.println("URL Protocol: "+url.getProtocol());
            System.out.println("DOmain/Host: "+url.getHost());
            System.out.println("Authority: "+url.getAuthority());
            System.out.println("Port: "+url.getPort());
            System.out.println("Default port: "+url.getDefaultPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
            System.out.println("Query string: "+url.getQuery());
            System.out.println("Reference: "+url.getRef());
            //System.out.println("URI: "+url.toURI());
        }catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
}