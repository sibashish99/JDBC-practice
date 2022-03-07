package com.practice.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnecton {
	static Connection con;
    public static Connection createConnection() {
    	//load driver
    	try {
			//Class.forName("com.mysql.jdbc.Driver");
    		Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="root";
			String url= "jdbc:mysql:///localhost:3306/student_manage";
				
			con= DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return con;
    }
}
