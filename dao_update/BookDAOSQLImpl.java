package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import entity.Book;
import vo.BorrowInfo;
public class BookDAOSQLImpl extends DAOBase implements BookDAO {
	//插入索引表
	private static final String INSERT_BOOK_SQL="INSERT INTO book_table("
			+ "loc_barcode,"
			+ "book_ISBN,"
			+ "book_id) "
			+ "VALUES(?,?,?)";
	public void InsertBook(Book book) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BOOK_SQL);
			ps.setString(1, book.getLoc_barcode());
			ps.setString(2, book.getBook_ISBN());
			ps.setString(3, book.getBook_id());
			
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
	//插入详细信息表
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
	

	//更新索引表
	private static final String UPDATE_BOOK_SQL=
			"UPDATE book_table loc_barcode=? book_ISBN=? loc_callNo=? where book_id=?";
	@Override
	public void updateBook(Book book) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BOOK_SQL);
			ps.setString(1, book.getLoc_barcode());
			ps.setString(2, book.getBook_ISBN());
			ps.setString(3, book.getLoc_callNo());
			ps.setString(4,book.getBook_id());
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
	//更新详细信息表
	private static final String UPDATE_BOOK_ISBN_SQL=
			"update book_ISBN set"
			+ "book_name=?, "
			+ "book_meta_name=?, "
			+ "book_author=?, "
			+ "book_secondary_author=?, "
			+ "book_publisher=?, "
			+ "book_price=?, "
			+ "book_CDServiceContact=?, "
			+ "book_outline=?, "
			+ "book_menu=?, "
			+ "book_author_ps=?, "
			+ "book_abstract=?, "
			+ "book_target=?, "
			+ "book_douban_summarized=? where book_ISBN=?)  ";
	
	
	public void updateBook_ISBN(Book book) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(UPDATE_BOOK_ISBN_SQL);
			
			ps.setString(1, book.getBook_name());
			ps.setString(2, book.getBook_meta_name());
			ps.setString(3, book.getBook_author());
			ps.setString(4, book.getBook_secondary_author());
			ps.setString(5, book.getBook_publisher());	
			ps.setFloat(6, book.getBook_price());
			ps.setString(7, book.getBook_CDServiceContact());
			ps.setString(8, book.getBook_outline());
			ps.setString(9, book.getBook_menu());
			ps.setString(10, book.getBook_author_ps());
			ps.setString(11, book.getBook_abstract());
			ps.setString(12, book.getBook_target());
			ps.setString(13, book.getBook_douban_summarized());
			ps.setString(14, book.getBook_ISBN());
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
	
	//删除索引表
	private static final String DELETE_BOOK_SQL="delete from book_table where book_id=?";		
	@Override
	public void deleteBook(String book_id) throws DAOException {
		Connection conn=null;
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(DELETE_BOOK_SQL);
			ps.setString(1,book_id);
			try {
			ps.executeUpdate();
			}catch(Exception ee) {
				ee.printStackTrace();
			}
			ps.close();
			
		} catch (Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}
	}

	//删除详细信息表
	private static final String DELETE_BOOK_ISBN_SQL="delete from book_isbn where book_ISBN=?";
	public void deleteBook_ISBN(String book_ISBN) throws DAOException {
		Connection conn=null;
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(DELETE_BOOK_ISBN_SQL);
			ps.setString(1,book_ISBN);
			ps.executeUpdate();
			ps.close();
			
		} catch (Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}
	}
	
	//通过索书号查找书的信息
	private static final String SELECT_BOOK_SQL="select "
			+ "book_isbn.book_name, "
			+ "book_isbn.book_meta_name, "
			+ "book_isbn.book_author, "
			+ "book_isbn.book_secondary_author, "
			+ "book_isbn.book_publisher, "
			+ "book_isbn.book_price, "
			+ "book_isbn.book_CDServiceContact, "
			+ "book_isbn.book_outline, "
			+ "book_isbn.book_menu, "
			+ "book_isbn.book_author_ps, "
			+ "book_isbn.book_abstract, "
			+ "book_isbn.book_target, "
			+ "book_isbn.book_douban_summarized "
			+ " from book_isbn,book_table,book_info_mapp where "
			+ "book_isbn.book_ISBN=book_table.book_ISBN and book_info_mapp.book_id=book_table.book_id and "
			+ "book_table.loc_callNo=?";
	public void getBook(String bookID) throws DAOException {
		Connection conn=null;
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(SELECT_BOOK_SQL);
			ps.setString(1,bookID);
			//System.out.println(SELECT_BOOK_SQL);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			while (rs.next()) {
				int i = 1;
			    for (; i <= columns; i++) {
			        String columnValue = rs.getString(i);
			        System.out.println(rsmd.getColumnName(i)+": "+columnValue + " " );
			    }
			    System.out.println("");
			}
			
			ps.close();
			
		} catch (Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{	}
		}
	}
	
	
	
	
	
	
	private static final String INSERT_BORROW_SQL=
			"INSERT INTO book_borrow_table(user_id,book_id,loc_borrTime,loc_dueTime) VALUES(?,?,?,?)";
	
	public void insertBorrowinfo(BorrowInfo binfo) throws DAOException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(INSERT_BORROW_SQL);
			ps.setString(1, binfo.getUser_id());
			ps.setString(2, binfo.getBook_id());
			ps.setDate(3, binfo.getLoc_borrTime());
			ps.setDate(4, binfo.getLoc_dueTime());
		
			try {	
				ps.executeUpdate();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
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
	
	
	
	
	
	
	
	
	
	
	
	

}
