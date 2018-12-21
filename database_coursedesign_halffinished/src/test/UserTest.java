package test;

import java.sql.Date;
import dao.*;
import entity.*;
public class UserTest {
	public static void main(String[] args)  {
		try {
			UserDAOSQLImpl userDAOSQLImpl=new UserDAOSQLImpl();			
			User_Type usertype1=new User_Type("本科生",20);
			User_Type usertype2=new User_Type("研究生",30);
			
//			User u1=new User("user1","123456","李二","男",java.sql.Date.valueOf("2018-08-10"),java.sql.Date.valueOf("2020-08-10"));
//			System.out.println(u1.getUser_id());
//			userDAOSQLImpl.createUser(u1);
			userDAOSQLImpl.createUsertype(usertype2);
			/*u1.setUser_type(usertype2);s
			userDAOSQLImpl.updateUser(u1);*/
			
			//userDAOSQLImpl.deleteUser("user1");
			}catch(Exception exception){
				System.out.println("error");
			}
		
		

	}
}
