package dao;
import java.util.ArrayList;

import entity.User;
public interface UserDAO extends DAO {
	public void createUser(User user) throws DAOException;
	public void updateUser(User user) throws DAOException;
	public void deleteUser(String userID) throws DAOException;
	public User getUser(String userID) throws DAOException;
	public ArrayList<User> searchByName(String userName) throws DAOException;
}
