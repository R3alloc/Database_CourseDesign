package test;

import java.sql.Date;
import dao.*;
import entity.*;
import vo.User_Type;
public class UserTest {
	public static void main(String[] args)  {
		try {
			//����һ��userDAOimpl
			UserDAOSQLImpl userDAOSQLImpl=new UserDAOSQLImpl();
			//����user_type vo����������
			User_Type usertype1=new User_Type("������1",20);
			User_Type usertype2=new User_Type("�о���",30);
			userDAOSQLImpl.createUsertype(usertype1);//����
			
			//����һ��������user��Ϣ
			User u1=new User("user1","123456","���","��",java.sql.Date.valueOf("2018-08-10"),java.sql.Date.valueOf("2020-08-10"));
			userDAOSQLImpl.createUser(u1);//����
			userDAOSQLImpl.deleteUser("user1");//ɾ��
			
			}catch(Exception exception){
				System.out.println("error");
			}
	}
}
