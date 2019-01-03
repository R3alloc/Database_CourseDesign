package entity;
import java.sql.Date;
import entity.*;
import vo.User_Type;
public class User {
	String user_id;
	String user_pwd;
	String user_name;
	String user_sex;
	Date start_date;
	Date end_date;
	User_Type user_type;
	String type;
	String email;
	String tel;
	String address;
	public User() {
	}
	public User(String user_id,String user_pwd) {
		this.user_id=user_id;
		this.user_pwd=user_pwd;		
	}
	public User(String user_id,String user_pwd,String user_name,String user_sex,
			Date start_date,Date end_date) {
		this.user_id=user_id;
		this.user_pwd=user_pwd;
		this.user_name=user_name;
		this.user_sex=user_sex;
		this.start_date=start_date;
		this.end_date=end_date;
	}
	public User(String user_id,String user_pwd,String user_name,String user_sex,
			Date start_date,Date end_date,User_Type user_type) {
		this.user_id=user_id;
		this.user_pwd=user_pwd;
		this.user_name=user_name;
		this.user_type=user_type;
		this.start_date=start_date;
		this.end_date=end_date;
		this.user_sex=user_sex;
	}
	public User(String user_id,String user_pwd,String user_name,String user_sex,
			Date start_date,Date end_date,User_Type user_type,String email,String tel,String address) {
		this.user_id=user_id;
		this.user_pwd=user_pwd;
		this.user_name=user_name;
		this.user_sex=user_sex;
		this.start_date=start_date;
		this.end_date=end_date;
		this.user_type=user_type;
		this.email=email;
		this.tel=tel;
		this.address=address;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public User_Type getUser_type() {
		return user_type;
	}
	public void setUser_type(User_Type user_type) {
		this.user_type = user_type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
