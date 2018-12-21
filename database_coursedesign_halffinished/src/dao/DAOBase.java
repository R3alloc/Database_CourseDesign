package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAOBase implements DAO {

	@Override
	public Connection getConnection() throws Exception {
		try {
		Connection conn=null;
    		
		
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
   
    	//创建连接
    	String dburl="jdbc:sqlserver://localhost:1433;databaseName=library";
    	
    	//默认用户
    	conn=DriverManager.getConnection(dburl,"sa","123");

    	return conn;
		}
    	catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
		
	}
}
