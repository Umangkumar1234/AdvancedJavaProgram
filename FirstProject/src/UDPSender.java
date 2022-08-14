import java.net.*;
import java.util.*;

public class UDPSender 
{
  public static void main(String[] args) throws Exception
  {
    DatagramSocket mySocket= new DatagramSocket(8881);
    byte myBuffer[];
    
    while(true)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter some text here");
      String msg=sc.nextLine();
      myBuffer = msg.getBytes();
      DatagramPacket mypack=new DatagramPacket(myBuffer,myBuffer.length,InetAddress.getByName("192.168.225.188"),7778);
      mySocket.send(mypack);
      
      if(msg.equals("exit"))
        break;
      
    }
  }

} 