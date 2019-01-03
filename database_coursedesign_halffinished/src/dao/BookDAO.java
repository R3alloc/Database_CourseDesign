package dao;

import java.util.ArrayList;

import entity.Book;

public interface BookDAO extends DAO {
	public void createBook(Book book) throws DAOException;
	public void updateBook(Book book) throws DAOException;
	public void deleteBook(String userID) throws DAOException;
	
	
	//�����͸�������������ͺ����ѧ������
//	public void InsertBookType(Book book) throws DAOException;
//	public void updateBookType(String bookISBN,String topic,String type) throws DAOException;
	
	public Book getBook(String bookID) throws DAOException;
	
}
