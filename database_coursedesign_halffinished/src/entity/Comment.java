package entity;

import java.sql.Date;

public class Comment {
	String user_id;
	String book_ISBN;
	String comment_content;
	Date comment_date;
	int comment_up;
	int comment_down;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBook_ISBN() {
		return book_ISBN;
	}
	public void setBook_ISBN(String book_ISBN) {
		this.book_ISBN = book_ISBN;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public Date getComment_date() {
		return comment_date;
	}
	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	public int getComment_up() {
		return comment_up;
	}
	public void setComment_up(int comment_up) {
		this.comment_up = comment_up;
	}
	public int getComment_down() {
		return comment_down;
	}
	public void setComment_down(int comment_down) {
		this.comment_down = comment_down;
	}
}
