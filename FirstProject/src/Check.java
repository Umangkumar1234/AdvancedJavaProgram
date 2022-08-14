import java.sql.*;
public class Check {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			
			Statement st = cn.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+ "  "+rs.getString(3));
					
			}
			
//			st.executeUpdate("DELETE FROM student");
			
			st.executeUpdate("UPDATE student SET name='Sohan Kumar' WHERE RNO=1");
			st.executeUpdate("INSERT INTO student VALUES(55,'Rishik Kumar','Kolkata')");
			st.executeUpdate("DELETE FROM student WHERE RNO=50");
			
			System.out.println("************Updated table after performing I/U/D**********");
		
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			
			}
			
			st.close();
			cn.close();
				
		}catch(Exception e){
			System.out.println(e);
			
		}	

	}
}
