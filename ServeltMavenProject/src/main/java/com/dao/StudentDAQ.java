package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.util.DBUtil;

public class StudentDAQ {

	public static void insert(String name, int marks) throws Exception
	{
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = 
				con.prepareStatement("insert into student(name,marks) values (?,?)");
		ps.setString(1, name);
		ps.setInt(2, marks);
		ps.executeUpdate();
		con.close();
	}
	
	public static ResultSet getAll() throws Exception
	{
		
		Connection con = DBUtil.getConnection();
		Statement st = con.prepareStatement(null);
		return null;
	}
}
