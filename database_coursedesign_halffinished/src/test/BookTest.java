package test;

import dao.*;
import entity.*;
import vo.*;
public class BookTest {
	public static void main(String[] args)  {
		try {
			//创建bookDAOimpl
			BookDAOSQLImpl bookop = new BookDAOSQLImpl();
			
			//创建locationDAOimpl
			LocationDAOSQLImpl loc_op = new LocationDAOSQLImpl();
			Book_Location l1=new Book_Location("A111","2012","301","不可借","12排1层","L111");
			//创建location信息
			loc_op.createLocation(l1);
			l1.setLoc_callNo("L1111");
			//更新
			loc_op.updateLocation(l1);
			
			//新建一条借书记录
			BorrowInfo binfo = new BorrowInfo();
			binfo.setUser_id("user1");
			binfo.setLoc_barcode("A111");
			binfo.setLoc_borrTime(java.sql.Date.valueOf("2011-11-2"));
			binfo.setLoc_dueTime(java.sql.Date.valueOf("2011-12-2"));
			//插入borrow_table
			bookop.insertBorrowinfo(binfo);
			
			//创建新的一条书籍记录
			Book book1 = new Book();
			book1.setLoc_barcode("A888");
			book1.setBook_ISBN("ISBN8");
			book1.setLoc_callNo("L888");
			//创建索引
			bookop.InsertBook(book1);
			book1.setBook_name("SilentWind");
			book1.setBook_author("anonymous");
			book1.setBook_publisher("publisherA");
			book1.setBook_author_ps("psisnops");
			book1.setBook_CDServiceContact("15517");
			book1.setBook_meta_name("sw");
			book1.setBook_price((float)7.99);
			//录入关于书的详细信息
			bookop.createBook(book1);
			book1.setBook_douban_summarized("it is very disgusting");
			//更新
			bookop.updateBook(book1);
			
			
			
			}catch(Exception exception){
				System.out.println("error");
			}
		
		

	}
}
