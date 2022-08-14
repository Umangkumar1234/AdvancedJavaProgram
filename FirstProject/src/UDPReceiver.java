import java.net.*;
import java.util.*;

public class UDPReceiver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("You need to press CTRL +C in order to ");
		DatagramSocket mySocket=new DatagramSocket(7778);
		byte myBuffer[]=new byte[2000];
		while(true) {
			DatagramPacket dataPacket=new 
					DatagramPacket(myBuffer,myBuffer.length);
			mySocket.receive(dataPacket);
			String msg=new
			String (dataPacket.getData(),0,dataPacket.getLength());
			System.out.println("Message Recieved :"+msg);
			if(msg.equals("exit"))
				break;
		}

	}

}
