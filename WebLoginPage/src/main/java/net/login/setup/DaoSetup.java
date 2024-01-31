package net.login.setup;

import java.sql.*;
import net.login.model.*;
import java.io.*;

public class DaoSetup {
	public boolean validate(UserBase UserBase) throws ClassNotFoundException,IOException{
		boolean status=false;
		Class.forName("com.mysql.jdbc.Driver");
//		try {
			String URL = "jdbc:mysql://localhost:3306/login";
		    String Username = "root";
		    String Password = "rootpass@123";
//		    System.out.println("Connecting to database...."+URL);
//	        Connection con=DriverManager.getConnection(URL, Username, Password);
//	        System.out.println("Connection is successful !");
//	        Statement stmt=con.createStatement();
//	        String sql;
//	        sql="use login";
//	        stmt.executeUpdate(sql);
//		    sql="CREATE TABLE login(username VARCHAR(25),password VARCHAR(25))";
//	        stmt.executeUpdate(sql);
//	        sql="SELECT * FROM users";
//	        ResultSet rs=stmt.executeQuery(sql);
//	        status=rs.next();
//	        con.close();}
	        try(
	        		Connection con=DriverManager.getConnection(URL,Username,Password);
	        		PreparedStatement ps = con
	                .prepareStatement("SELECT * FROM users WHERE username = ? and password = ? ")) {
	                ps.setString(1, UserBase.getUsername());
	                ps.setString(2, UserBase.getPassword());

	                System.out.println(ps);
	                ResultSet rs = ps.executeQuery();
	                status = rs.next();
	                con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	    catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
}
