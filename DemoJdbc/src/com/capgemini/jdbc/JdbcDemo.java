package com.capgemini.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");//Loading Driver class
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","akil","123456");
		Statement st=con.createStatement();
		boolean b=st.execute("create table anurag3(aid number(3), aname varchar2(20))");
		System.out.println("table is created");
		int n=st.executeUpdate("insert into anurag3 values(102,'akil')");
		System.out.println(n+ "record is inserted");
		con.close();
	}

}
