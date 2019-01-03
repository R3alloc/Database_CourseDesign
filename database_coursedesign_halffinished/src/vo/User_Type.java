package vo;

public class User_Type {
	String user_type;
	int max_borrow;
	public User_Type(String user_type,int max_borrow) {
		this.max_borrow=max_borrow;
		this.user_type=user_type;
	}
	public void setUser_type(String user_type){
		this.user_type=user_type;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setMaxborrow(int max_borrow){
		this.max_borrow=max_borrow;
	}
	public int getMax_borrow() {
		return max_borrow;
	}
	
}
