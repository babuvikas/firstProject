package com.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataFetch {
public static void main(String[] args) {
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from Employee");
	System.out.println("Table created successfully...");
	while (rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	con.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
}
