package dao;

import java.util.ArrayList;

import entity.Book;

public interface BookDAO extends DAO {
	public void createBook(Book book) throws DAOException;
	public void updateBook(Book book) throws DAOException;
	public void deleteBook(String userID) throws DAOException;
	
	
	//创建和更新书的文献类型和书的学科领域
//	public void InsertBookType(Book book) throws DAOException;
//	public void updateBookType(String bookISBN,String topic,String type) throws DAOException;
	
	public Book getBook(String bookID) throws DAOException;
	
}
