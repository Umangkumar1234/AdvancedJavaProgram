package com.umang.ProjectWithMaven;
import java.io.*;
import java.net.*;
import java.util.*;
public class SumOfTwoNumberTcp
{
	public static void main(String args[]) throws Exception
	{
	Socket s=new Socket("10.80.6.176",777);
	PrintStream ps=new PrintStream(s.getOutputStream());
	int arr[]={10,20,30,40,50};
	for(int i=0;i<=4;i++)
	{
	ps.println(""+arr[i]);
	}
	InputStream is=s.getInputStream();
	BufferedReader br=new BufferedReader(new InputStreamReader(is));
	String str;
	while((str=br.readLine())!=null)
	{ System.out.println("The Sum is:"+str); }
	ps.close();
	s.close();
	}

}
