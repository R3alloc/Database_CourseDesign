package test;

import dao.LocationDAOSQLImpl;
import entity.Book_Location;
import entity.Book;
public class BookTest {
	public static void main(String[] args)  {
		try {
					
			LocationDAOSQLImpl limpl = new LocationDAOSQLImpl();
			Book_Location l1=new Book_Location("ABC-11","V122226","2012","301","≤ªø…ΩË","12≈≈1≤„",java.sql.Date.valueOf("2018-08-10"),java.sql.Date.valueOf("2020-08-10"));
			
			limpl.createLocation(l1);
			
			/*u1.setUser_type(usertype2);s
			userDAOSQLImpl.updateUser(u1);*/
			
			//userDAOSQLImpl.deleteUser("user1");
			
			Book book1 = new Book();
			
			
			
			}catch(Exception exception){
				System.out.println("error");
			}
		
		

	}
}
