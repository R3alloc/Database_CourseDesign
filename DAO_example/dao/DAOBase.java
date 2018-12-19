package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAOBase implements DAO {

	@Override
	public Connection getConnection() throws Exception {
		Connection conn=null;
    		
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
   
    	//创建连接
    	String dburl="jdbc:sqlserver://localhost:1433;databaseName=Librarydb";
    	
    	//默认用户
    	conn=DriverManager.getConnection(dburl,"test","123");

    	return conn;
    	
	}

}
