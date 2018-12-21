package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Book;

public class BookDAOSQLImpl extends DAOBase implements BookDAO {
	
	private static final String INSERT_BOOK_SQL="INSERT INTO book_table("
			+ "loc_barcode,"
			+ "book_ISBN,"
			+ "loc_callNo) "
			+ "VALUES(?,?,?)";
	public void InsertBook(Book book) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BOOK_SQL);
			ps.setString(1, book.getLoc_barcode());
			ps.setString(2, book.getBook_ISBN());
			ps.setString(3, book.getLoc_callNo());
			
			ps.execute();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}

	}
	
	private static final String INSERT_BOOK_ISBN_SQL=
			"INSERT INTO book_isbn("
			+ "book_ISBN,"
			+ "book_name,"
			+ "book_meta_name,"
			+ "book_author,"
			+ "book_secondary_author,"
			+ "book_publisher,"
			+ "book_price,"
			+ "book_CDServiceContact,"
			+ "book_outline,"
			+ "book_menu,"
			+ "book_author_ps,"
			+ "book_abstract,"
			+ "book_target,"
			+ "book_douban_summarized)  "
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
	@Override
	public void createBook(Book book) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BOOK_ISBN_SQL);
			
			ps.setString(1, book.getBook_ISBN());
			ps.setString(2, book.getBook_name());
			ps.setString(3, book.getBook_meta_name());
			ps.setString(4, book.getBook_author());
			ps.setString(5, book.getBook_secondary_author());
			ps.setString(6, book.getBook_publisher());	
			ps.setFloat(7, book.getBook_price());
			ps.setString(8, book.getBook_CDServiceContact());
			ps.setString(9, book.getBook_outline());
			ps.setString(10, book.getBook_menu());
			ps.setString(11, book.getBook_author_ps());
			ps.setString(12, book.getBook_abstract());
			ps.setString(13, book.getBook_target());
			ps.setString(14, book.getBook_douban_summarized());
				
			
			ps.execute();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}

	}
	
	private static final String INSERT_BOOK_TYPE_SQL=
			"INSERT INTO book_typeinfo(book_ISBN,book_topic,book_type) "
			+ "VALUES(?,?,?)";
	public void InsertBookType(Book book) throws DAOException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BOOK_SQL);
			ps.setString(1, book.getBook_ISBN());
			ps.setString(2, book.getBook_topic());
			ps.setString(3, book.getBook_type());
			
			ps.execute();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}
	}
	
	private static final String UPDATE_BOOK_SQL=
			"";
	@Override
	public void updateBook(Book book) throws DAOException {
		// TODO Auto-generated method stub

	}
	private static final String UPDATE_BOOK_ISBN_SQL=
			"";
	@Override
	public void deleteBook(String userID) throws DAOException {
		// TODO Auto-generated method stub

	}
	private static final String UPDATE_BOOK_TYPE_SQL=
			"";
	@Override
	public Book getBook(String bookID) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
