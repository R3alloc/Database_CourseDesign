package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAOBase implements DAO {

	@Override
	public Connection getConnection() throws Exception {
		try {
		Connection conn=null;
    		
		
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
   
    	//��������
    	String dburl="jdbc:sqlserver://localhost:1433;databaseName=library";
    	
    	//Ĭ���û�
    	conn=DriverManager.getConnection(dburl,"sa","123");

    	return conn;
		}
    	catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
		
	}
}
