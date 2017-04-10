package TestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testdb 
{
	public static Connection connection;
	public static Statement statement;
	public static ResultSet resultSet;
	public static void main(String[] args) throws Exception
	{
		//connection, statement, resultSet
		
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(
"jdbc:sqlserver://give servername;instance=SQLEXPRESS;databaseName=//give database name;","giveUsername", "givePassword");
			 statement = connection.createStatement();
             resultSet = statement.executeQuery("select * from emp where empname=mallik");
			String str=resultSet.toString();
			System.out.println(str);
	}

}
