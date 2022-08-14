import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
public class InOut_param {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			
			CallableStatement cs=cn.prepareCall("{call getbalance2(?)}");
		    cs.setInt(1,75);
		    cs.registerOutParameter(1, Types.INTEGER);
		    cs.execute();
		    int balance=cs.getInt(1);
		    System.out.println("Balance is : "+balance);
			cn.close();		
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
