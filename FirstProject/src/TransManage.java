import java.sql.*;
public class TransManage {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			cn.setAutoCommit(false);
			
			PreparedStatement ps=cn.prepareStatement("update bank set bal=bal+? where accno=?");
			ps.setInt(1, 5000);
			ps.setInt(2, 70);
			int i=ps.executeUpdate();
		
			ps.setInt(1, -5000);
			ps.setInt(2, 74);
			int j=ps.executeUpdate();
			
			if(i==1 && j==1) {
				cn.commit();
				System.out.print("Transaction transferred");
			}else {
				cn.rollback();
				System.out.print("Transaction can not transferred");
			}
		
			cn.close();		
		}catch(Exception e){
			System.out.println(e);

	}

   }
}
