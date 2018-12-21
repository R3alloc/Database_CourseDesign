package dao;
import java.sql.*;

import entity.Book_Location;

public class LocationDAOSQLImpl extends DAOBase implements LocationDAO {
	
	private String loc_table_name="book_storeinfo";
	public boolean createLocation(Book_Location bk_loc)throws DAOException
	{
		String create_loc_sql="insert into book_storeinfo (loc_callNo,loc_barcode,loc_voliss,loc_room,loc_status,loc_location) "
							+" values(?,?,?,?,?,?) ";
		Connection conn = null;
		PreparedStatement ps =null;
		try{
			conn = this.getConnection();	//使用继承自DAOBase的方法
			System.out.println("zzzzzzzzzzzzz"+   create_loc_sql);
			ps  = conn.prepareStatement(create_loc_sql);
			ps.setString(1, bk_loc.getLoc_callNo());
			ps.setString(2, bk_loc.getLoc_barcode());
			ps.setString(3, bk_loc.getLoc_voliss());
			ps.setString(4, bk_loc.getLoc_room());
			ps.setString(5, bk_loc.getLoc_status());
			ps.setString(6, bk_loc.getLoc_location());
//			ps.setDate(7, bk_loc.getLoc_borrTime());
//			ps.setDate(8, bk_loc.getLoc_dueTime());
			
			
	
			int rs = 		ps.executeUpdate();
				
		
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
	public boolean updateLocation(Book_Location bk_loc)throws DAOException
	{
		String update_loc_sql="update "+loc_table_name+" set loc_status=? , loc_borrTime=? , loc_dueTime=? where loc_barcode=?";
		
		try{
			
			Connection conn = this.getConnection();
			PreparedStatement ps =conn.prepareStatement(update_loc_sql);
			ps.setString(1, bk_loc.getLoc_status());
			ps.setDate(2,bk_loc.getLoc_borrTime());
			ps.setDate(3,bk_loc.getLoc_dueTime());
			ps.setString(4, bk_loc.getLoc_barcode());
			int rs = ps.executeUpdate(update_loc_sql);
			ps.close();
			conn.close();
			if(rs>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
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
				bk_loc.setLoc_borrTime(rs.getDate("loc_borrTime"));
				bk_loc.setLoc_callNo(rs.getString("loc_callNo"));
				bk_loc.setLoc_dueTime(rs.getDate("loc_dueTime"));
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
