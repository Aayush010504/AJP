//Write a program to demonstrate the use of URL and URLConnection class and its methods
// Path: P16.java

import java.net.*;
import java.io.*;

public class P15
{
    public static void main(String[] args)  
    {  
        try  
        {  
            URL u = new URL("http://google.com");  
            URLConnection ucon = u.openConnection();  
            InputStream s = ucon.getInputStream();  
            int i;  
            while ((i = s.read()) != -1)  
            {  
                System.out.print((char) i);  
            }  
        } catch (Exception ex)  
        {  
            System.out.println(ex);  
        }  
    }  
}