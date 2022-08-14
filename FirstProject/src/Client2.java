import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws Exception{
		Socket s=new Socket("192.168.137.94",8888)  ;
		PrintStream printSocket=new PrintStream(s.getOutputStream());
		Scanner kbScanner=new Scanner(System.in);
		
		Scanner socketScanner=new Scanner(s.getInputStream());
		
		String serverStr,kbstr;
		while(true) {
			kbstr=kbScanner.nextLine();
			printSocket.println(kbstr);
			if(kbstr.equals("exit"))
				break;
			serverStr=socketScanner.nextLine();
			System.out.println("Message from server-- "+serverStr);
			
		}

	}

}
