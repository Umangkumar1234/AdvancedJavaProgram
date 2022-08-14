
import java.sql.*;

public class Scroo_update_Rs {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cn=DriverManager.getConnection
					("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef191160107070","mef191160107070");
			
			Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select RNO,NAME,ADDRESS from student");
			rs.absolute(2);
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			System.out.println("Current position of rs is "+rs.getRow());
			
			rs.first();
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			
			rs.last();
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			
			rs.previous();
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			
//			rs.absolute(5);
//			int i=1;
//			while(i < 5) {
//				rs.deleteRow();
//				i++;
//				
//			}

			
			rs.updateString(2,"PC1 Sohan");
			rs.updateString(3,"MEFGI Gujrat");
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			
			rs.absolute(2);
     		rs.deleteRow();
     		System.out.println("Row is deleted successfully");
			
			rs.moveToInsertRow();
			rs.updateInt(1, 96);
			rs.updateString(2, "PC1 Suraj");
			rs.updateString(3, "MEFGI Sitamarhi");
			rs.insertRow();
			System.out.println("Row is inserted successfully");
			cn.close();		
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
}


