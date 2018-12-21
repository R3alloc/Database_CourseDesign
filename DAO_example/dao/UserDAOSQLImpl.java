package dao;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import entity.User;

public class UserDAOSQLImpl extends DAOBase implements UserDAO {
	private static final String CREATE_USER_SQL=
			"INSERT INTO user_table(user_id,user_pwd,user_name,user_sex,start_date,end_date,user_type,email,tel,address)"
			+ " VALUES(?,?,?,?,?,?,?,?,?,?)";
	
	private static final String DELETE_USER_SQL="DELETE FROM user_table WHERE user_id=?";
	
	private static final String UPDATE_USER_SQL="UPDATE user_table  SET user_pwd=?,user_name=?,user_sex=?,start_date=?,end_date=?,"
			+ "user_type=?,email=?,tel=?,address=? WHERE user_id=?";
	
	@Override
	public void createUser(User user) throws DAOException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(CREATE_USER_SQL);
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getUser_pwd());
			ps.setString(3, user.getUser_name());
			ps.setString(4, user.getUser_sex());
			ps.setDate(5, user.getStart_date());
			ps.setDate(6, user.getEnd_date());
			ps.setString(7, user.getUser_type().getUser_type());
			ps.setString(8, user.getEmail());
			ps.setString(9, user.getTel());
			ps.setString(10, user.getAddress());
			ps.executeUpdate();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{
				
			}
		}
		
	}

	@Override
	public void updateUser(User user) throws DAOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(UPDATE_USER_SQL);
			ps.setString(10, user.getUser_id());
			ps.setString(1, user.getUser_pwd());
			ps.setString(2, user.getUser_name());
			ps.setString(3, user.getUser_sex());
			ps.setDate(4, user.getStart_date());
			ps.setDate(5, user.getEnd_date());
			ps.setString(6, user.getUser_type().getUser_type());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getTel());
			ps.setString(9, user.getAddress());
			ps.executeUpdate();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{
				
			}
		}
	}

	@Override
	public void deleteUser(String userID) throws DAOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn=this.getConnection();
			ps=conn.prepareStatement(DELETE_USER_SQL);
			ps.setString(1, userID);
			ps.executeUpdate();
			ps.close();
		}
		catch(Exception e) {
			throw new DAOException();
		}
		finally {
			try {
				conn.close();
			}catch(SQLException se)
			{
				
			}
		}
	}

	@Override
	public User getUser(String userID) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> searchByName(String userName) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
