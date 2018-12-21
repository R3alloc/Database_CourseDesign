package entity;
import java.sql.Date;

public class Borrow_table
{
    //条码号和用户id的组合 组成一条借书记录的主键
    private String loc_barcode;	//条码号
    private String user_id;	//用户id
    
    private String loc_room;
    private String book_name;
    private Date loc_borrTime;
    private Date loc_dueTime;

    public String getLoc_barcode() {
    	return loc_barcode;
    }
    
    public void setLoc_barcode(String loc_barcode) {
    	this.loc_barcode = loc_barcode;
    }

    public String getLoc_room() {
    	return loc_room;
    }
    
    public void setLoc_room(String loc_room) {
    	this.loc_room = loc_room;
    }   
    
    public Date getLoc_borrTime() {
    	return loc_borrTime;
    }
    
    public void setLoc_borrTime(Date loc_borrTime) {
    	this.loc_borrTime = loc_borrTime;
    }
    
    public Date getLoc_dueTime() {
    	return loc_dueTime;
    }
    
    public void setLoc_dueTime(Date loc_dueTime) {
    	this.loc_dueTime = loc_dueTime;
    }		
    
    public String getUser_id() {
    	return user_id;
    }
    
    public void setUser_id(String user_id) {
    	this.user_id = user_id;
    }

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
