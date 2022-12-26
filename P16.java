//write a program to implement chatserver using ServerSocket and Socket class
// Path: P17.java
//
import java.net.*;
import java.io.*;
import java.util.*;

public class P16
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String str = ""; 
        String str2 = "";
        while (!str.equals("stop"))
        {
            str = dis.readUTF();
            System.out.println("Client says: " + str);
            str2 = sc.nextLine();
            dos.writeUTF(str2);
            dos.flush();
        }
        dis.close();
        s.close();
        ss.close();
    }
}