package net.login.register;

import java.sql.*;
import net.login.model.*;

public class register {
	public  int registeruser(UserBase userbase)throws ClassNotFoundException{
		String sql="INSERT INTO users (username,password) VALUES(?,?)";
		int status=0;

			Class.forName("com.mysql.jdbc.Driver");
				String URL = "jdbc:mysql://localhost:3306/login";
			    String Username = "root";
			    String Password = "rootpass@123";
			    System.out.println("Connecting to database...."+URL);
		try(Connection con=DriverManager.getConnection(URL,Username,Password);
        		PreparedStatement ps = con
    	        .prepareStatement(sql)){
			ps.setString(1, userbase.getUsername());
			ps.setString(2, userbase.getPassword());
			System.out.println(ps);
			status=ps.executeUpdate();	
			con.close();
			}
	catch(SQLException e) {
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
		return status;
}
	
}
