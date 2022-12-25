import java.util.*;
import java.net.*;

public class P14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  host name");
		String host=sc.nextLine();
		try
		{
			InetAddress ip=InetAddress.getByName(host);
			System.out.println("IP address of computer is- "+ip.getHostAddress());
		}
		catch(UnknownHostException e)
		{
			System.out.println(e);
		}
	}
}