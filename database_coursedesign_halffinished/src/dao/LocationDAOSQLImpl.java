package dao;
import java.sql.*;

import vo.Book_Location;

public class LocationDAOSQLImpl extends DAOBase implements LocationDAO {
	
	private String loc_table_name="book_storeinfo";
	public boolean createLocation(Book_Location bk_loc)throws DAOException
	{
		String create_loc_sql="insert into book_storeinfo (loc_barcode,loc_voliss,loc_room,loc_status,loc_location,loc_callNo) "
							+" values(?,?,?,?,?,?) ";
		Connection conn = null;
		PreparedStatement ps =null;
		try{
			conn = this.getConnection();	//使用继承自DAOBase的方法
			
			ps  = conn.prepareStatement(create_loc_sql);
			
			ps.setString(1, bk_loc.getLoc_barcode());
			ps.setString(2, bk_loc.getLoc_voliss());
			ps.setString(3, bk_loc.getLoc_room());
			ps.setString(4, bk_loc.getLoc_status());
			ps.setString(5, bk_loc.getLoc_location());
			ps.setString(6, bk_loc.getLoc_callNo());

			
			int rs = ps.executeUpdate();
			
			if(rs > 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			throw new DAOException();
		}
		finally
		{
			try{
				ps.close();
				conn.close();
			}
			catch(SQLException e)
			{
				
			}
		}
	}
	public boolean deleteLocation(Book_Location bk_loc)throws DAOException
	{
		String delete_loc_sql = "delete from "+loc_table_name+" where loc_barcode=?";
		Connection conn;
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(delete_loc_sql);
			ps.setString(1,bk_loc.getLoc_barcode());
			int rs = ps.executeUpdate();
			if(rs>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateLocation(Book_Location bk_loc) throws DAOException
	{
		String update_loc_sql="update book_storeinfo  set loc_voliss=?, loc_room=?, loc_status=?, loc_location=?,loc_callNo=? where loc_barcode=?";
		
		try{
			
			Connection conn = this.getConnection();
			
			PreparedStatement ps =conn.prepareStatement(update_loc_sql);
			
			ps.setString(1, bk_loc.getLoc_voliss());
			ps.setString(2, bk_loc.getLoc_room());
			ps.setString(3, bk_loc.getLoc_status());
			ps.setString(4, bk_loc.getLoc_location());
			ps.setString(5, bk_loc.getLoc_callNo());
			
			ps.setString(6, bk_loc.getLoc_barcode());
			System.out.println(update_loc_sql);
			try {
				
			int rs = ps.executeUpdate();
			return true;
			}catch(Exception ex) {
				
				ex.printStackTrace();
			}
			
			ps.close();
			conn.close();
		return true;
//			if(rs>0)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
			
		}catch(Exception e)
		{
			throw new DAOException();
		}
		
		
	}
	
	public Book_Location getBookLocation(String loc_barcode) throws DAOException
	{
		String get_loc_sql = "select * from "+loc_table_name+" where loc_barcode=?";
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = this.getConnection();
			ps = conn.prepareStatement(get_loc_sql);
			ps.setString(1, loc_barcode);
			rs = ps.executeQuery();
			
			rs.close();
			ps.close();
			conn.close();
			
			Book_Location bk_loc = new Book_Location();
			if(rs.next())
			{
				bk_loc.setLoc_barcode(rs.getString("loc_barcode"));
				bk_loc.setLoc_location(rs.getString("loc_location"));
				bk_loc.setLoc_room(rs.getString("loc_room"));
				bk_loc.setLoc_status(rs.getString("loc_status"));
				bk_loc.setLoc_voliss(rs.getString("loc_voliss"));
				return bk_loc;
			}
			else
			{
				return null;
			}
		}catch(Exception e)
		{
			
		}
		return null;
	}

	
}
