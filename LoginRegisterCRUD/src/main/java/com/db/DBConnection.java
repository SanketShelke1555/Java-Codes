package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

//    public static Connection getConnection() throws Exception {
//
//        // Load MySQL driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        // Create connection
//        Connection con = DriverManager.getConnection(
//            "jdbc:mysql://localhost:3306/servletlogin_db",
//            "root",
//            "password"
//        );
//
//        return con;
//    }

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create connection
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/servletlogin_db",
            "root",
            "password"
        );
		return con;
	}
}
