import java.io.InputStream;
import java.net.*;

public class URl_URL_Connection {

	public static void main(String[] args) throws Exception { 
		URL obj=new URL("https://www.google.com/");
		URLConnection conn=obj.openConnection();
		int l=conn.getContentLength();
		System.out.println("Length of content: "+l);
		if(l==0) {
			System.out.println("Content not available");
			return;
		}
		else {
			int ch;
			InputStream in=conn.getInputStream();
			while((ch=in.read())!=-1) {
				System.out.print((char)ch);
			}
			
		}
	}

}
