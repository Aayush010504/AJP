import java.util.*;
import java.net.*;

public class P14
{
	public static void main(String args[])
	{
		
		//System.out.println("Enter  host name");
		String host="www.google.com";
		System.out.println("Host = "+host);
		try
		{
			InetAddress ip=InetAddress.getByName(host);
			System.out.println("IP address of computer is- "+ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}