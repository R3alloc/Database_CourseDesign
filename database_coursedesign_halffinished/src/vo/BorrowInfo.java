package vo;

import java.sql.Date;

public class BorrowInfo {
	private String user_id;//�����û�
	private String loc_barcode;	//�����
	private Date loc_borrTime;	//���ʱ��
	private Date loc_dueTime;	//����ʱ��
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLoc_barcode() {
		return loc_barcode;
	}
	public void setLoc_barcode(String loc_barcode) {
		this.loc_barcode = loc_barcode;
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
	
	
	
	
	
}
