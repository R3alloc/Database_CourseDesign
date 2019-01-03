package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.DAOException;
import entity.Book;

public class TestForNothing {
	private static final String UPDATE_BOOK_TYPE_SQL=
			"UPDATE book_typeinfo book_topic=?, book_type=? where book_ISBN=?";
//	@Override
//	public void updateBookType(String bookISBN,String topic,String type) throws DAOException {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		try {
//			conn=this.getConnection();
//			ps=conn.prepareStatement(UPDATE_BOOK_TYPE_SQL);
//			ps.setString(3, book.getBook_ISBN());
//			ps.setString(1, book.getBook_topic());
//			ps.setString(2, book.getBook_type());
//			
//			ps.execute();
//			ps.close();
//		}
//		catch(Exception e) {
//			throw new DAOException();
//		}
//		finally {
//			try {
//				conn.close();
//			}catch(SQLException se)
//			{	}
//		}
//		
//	}
	
	
	
	
	
	
	
//	private static final String INSERT_BOOK_TYPE_SQL=
//			"INSERT INTO book_typeinfo(book_ISBN,book_topic,book_type) "
//			+ "VALUES(?,?,?)";
//	public void InsertBookType(Book book) throws DAOException{
//		Connection conn = null;
//		PreparedStatement ps = null;
//		try {
//			conn=this.getConnection();
//			ps=conn.prepareStatement(INSERT_BOOK_SQL);
//			ps.setString(1, book.getBook_ISBN());
//			ps.setString(2, book.getBook_topic());
//			ps.setString(3, book.getBook_type());
//			
//			ps.execute();
//			ps.close();
//		}
//		catch(Exception e) {
//			throw new DAOException();
//		}
//		finally {
//			try {
//				conn.close();
//			}catch(SQLException se)
//			{	}
//		}
//	}
	
	
	
	
	
	
	
	
	
}
