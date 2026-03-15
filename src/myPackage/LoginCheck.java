package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginCheck {
	
	public void getLogin(String userName,String password) {
		try {
			//Connection establish
			Connection conn = DBConnection.getConnection();
			
			String loginQuery="SELECT * FROM Login WHERE username=? AND password=?";
			PreparedStatement pstm = conn.prepareStatement(loginQuery);
			pstm.setString(1,userName);
			pstm.setString(2,password);
			
			ResultSet rs = pstm.executeQuery();
			if(rs.next())
			{
				String role = rs.getString(1);
				if(role.equalsIgnoreCase("Admin"))
				{
					System.out.println("Admin Login Sucessfuly.");
					AdminMenu.Admin();
				}
				else
				{
					System.out.println("User Login Sucessfuly.");
					UserMenu.User();
				}
			}
			else {
				System.out.println("Invalid Username and Password!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
