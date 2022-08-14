import java.io.*;
import java.net.*;
public class Address {

	public static void main(String[] args)throws IOException {
   try {
	  InetAddress ip=InetAddress.getLocalHost();
	  System.out.println("The host address is "+ip.getHostAddress());
	  System.out.println("The host name is "+ip.getHostName());
   
//	  InetAddress ip=InetAddress.getByName("www.google.com");
//	  System.out.println("The host address is "+ip.getHostAddress());
//	  System.out.println("The host name is "+ip.getHostName());
   
   
   }catch(UnknownHostException ue) {
	   System.out.println("website not found");
   }
	

}
}
