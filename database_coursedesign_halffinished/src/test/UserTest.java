package test;

import java.sql.Date;
import dao.*;
import entity.*;
import vo.User_Type;
public class UserTest {
	public static void main(String[] args)  {
		try {
			//声明一个userDAOimpl
			UserDAOSQLImpl userDAOSQLImpl=new UserDAOSQLImpl();
			//产生user_type vo类以作测试
			User_Type usertype1=new User_Type("本科生1",20);
			User_Type usertype2=new User_Type("研究生",30);
			userDAOSQLImpl.createUsertype(usertype1);//增加
			
			//产生一条完整的user信息
			User u1=new User("user1","123456","李二","男",java.sql.Date.valueOf("2018-08-10"),java.sql.Date.valueOf("2020-08-10"));
			userDAOSQLImpl.createUser(u1);//增加
			userDAOSQLImpl.deleteUser("user1");//删除
			
			}catch(Exception exception){
				System.out.println("error");
			}
	}
}
