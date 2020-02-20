package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");//Loading Driver class
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","akil","123456");
	CallableStatement stmt=con.prepareCall("{call hi(?,?)}");
	stmt.setInt(1, 101);
	stmt.setString(2, "mahesh");
	stmt.execute();
	System.out.println("success");
}
}
