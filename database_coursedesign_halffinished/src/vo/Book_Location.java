package vo;

import java.sql.Date;

public class Book_Location {
	
    private String loc_barcode;	//�����
    private String loc_voliss;	//�����
    private String loc_room;	//�ݲص�
    private String loc_status;	//�鿯״̬���֣� �ɽ� ��� ���� ���ɽ�
    private String loc_location;//��λ
    private String loc_callNo; //�����


	public String getLoc_callNo() {
		return loc_callNo;
	}





	public void setLoc_callNo(String loc_callNo) {
		this.loc_callNo = loc_callNo;
	}





	public Book_Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	public Book_Location(String loc_barcode, String loc_voliss, String loc_room, String loc_status, String loc_location
			,String loc_callNo) {
		super();
		this.loc_barcode = loc_barcode;
		this.loc_voliss = loc_voliss;
		this.loc_room = loc_room;
		this.loc_status = loc_status;
		this.loc_location = loc_location;
		this.loc_callNo =loc_callNo;
	}

	public String getLoc_barcode() {
		return loc_barcode;
	}

	public void setLoc_barcode(String loc_barcode) {
		this.loc_barcode = loc_barcode;
	}

	public String getLoc_voliss() {
		return loc_voliss;
	}

	public void setLoc_voliss(String loc_voliss) {
		this.loc_voliss = loc_voliss;
	}

	public String getLoc_room() {
		return loc_room;
	}

	public void setLoc_room(String loc_room) {
		this.loc_room = loc_room;
	}

	public String getLoc_status() {
		return loc_status;
	}

	public void setLoc_status(String loc_status) {
		this.loc_status = loc_status;
	}

	public String getLoc_location() {
		return loc_location;
	}

	public void setLoc_location(String loc_location) {
		this.loc_location = loc_location;
	}
	

}
