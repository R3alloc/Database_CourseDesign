package dao;
import entity.*;

public interface LocationDAO extends DAO {
	
	public boolean createLocation(Book_Location bk_loc)throws DAOException;
	public boolean deleteLocation(Book_Location bk_loc)throws DAOException;
	public boolean updateLocation(Book_Location bk_loc)throws DAOException;
	
	public Book_Location getBookLocation(String loc_barcode) throws DAOException;

	
}
