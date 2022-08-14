import java.sql.*;

public class DemoJDBC {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			
			PreparedStatement pst=cn.prepareStatement("select * from emp where empdept=?");
			pst.setString(1, "ce");
	
			ResultSet rs=pst.executeQuery();
			
				while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				
			}
				System.out.println("************************************");
				
				pst.setString(1,"mech");
				rs =pst.executeQuery();
				while(rs.next()) {
					
				System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
				}
				
			System.out.println("******************* after modifying all data*****************");
			
//			PreparedStatement pstInsert=cn.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
//			pstInsert.setInt(1, 5);
//			pstInsert.setString(2, "Mohan");
//			pstInsert.setInt(3,89000);
//			pstInsert.setString(4, "elect");
//			pstInsert.executeUpdate();
			
			pst=cn.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
			pst.setInt(1, 5);
			pst.setString(2, "Mohan");
			pst.setInt(3,89000);
			pst.setString(4, "elect");
			pst.executeUpdate();
			
//			pst=cn.prepareStatement("DELETE from emp where empid=5");
//			pst.executeUpdate();
			
			pst=cn.prepareStatement("select * from emp");
			rs=pst.executeQuery();
			
			while(rs.next()) {
			
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
