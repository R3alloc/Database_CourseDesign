package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DAOBase implements DAO {

	@Override
	public Connection getConnection() throws Exception {
		Connection conn=null;
    		
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
   
    	//��������
    	String dburl="jdbc:sqlserver://localhost:1433;databaseName=Librarydb";
    	
    	//Ĭ���û�
    	conn=DriverManager.getConnection(dburl,"test","123");

    	return conn;
    	
	}

}
