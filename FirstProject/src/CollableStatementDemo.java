import java.sql.*;
public class CollableStatementDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			
			CallableStatement cs=cn.prepareCall("{call insertdata(?,?,?)}");
			
			cs.setInt(1, 960);
			cs.setString(2,"LalanKumar");
			cs.setString(3, "Muzaffarpur");
			cs.execute();
			
			cs.setInt(1, 5564);
			cs.setString(2,"Bahubali");
			cs.setString(3, "Seoher");
			cs.execute();
			
			cn.close();
			System.out.println("Data is inserted successfully.");
				
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
