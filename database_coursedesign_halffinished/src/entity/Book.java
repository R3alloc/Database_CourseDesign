package entity;

public class Book {
	String loc_barcode;//条形码
	String book_name;//书名
	String book_author;//作者
	String book_author_ps;//作者批注
	String book_type;//文献类型
	String book_ISBN;//ISBN
	float book_price=0;//价格
	String book_outline;//简介
	String book_publisher;//出版商
	String book_menu;//目录
	String book_meta_name;//书名2
	String book_secondary_author;//第二责任者
	String book_CDServiceContact;//cd服务联系方式
	String book_topic;//学科主题
	String loc_callNo;//索书号
	String book_abstract;//摘要
	String book_target;//面向人群
	String book_douban_summarized;//豆瓣
	
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	public String getBook_author_ps() {
		return book_author_ps;
	}
	public void setBook_author_ps(String book_author_ps) {
		this.book_author_ps = book_author_ps;
	}
	public String getLoc_barcode() {
		return loc_barcode;
	}
	public void setLoc_barcode(String barcode) {
		this.loc_barcode = barcode;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_ISBN() {
		return book_ISBN;
	}
	public void setBook_ISBN(String book_ISBN) {
		this.book_ISBN = book_ISBN;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
	public String getBook_outline() {
		return book_outline;
	}
	public void setBook_outline(String book_outline) {
		this.book_outline = book_outline;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public String getBook_menu() {
		return book_menu;
	}
	public void setBook_menu(String book_menu) {
		this.book_menu = book_menu;
	}
	public String getBook_meta_name() {
		return book_meta_name;
	}
	public void setBook_meta_name(String book_meta_name) {
		this.book_meta_name = book_meta_name;
	}
	public String getBook_secondary_author() {
		return book_secondary_author;
	}
	public void setBook_secondary_author(String book_secondary_author) {
		this.book_secondary_author = book_secondary_author;
	}
	public String getBook_CDServiceContact() {
		return book_CDServiceContact;
	}
	public void setBook_CDServiceContact(String book_CDServiceContact) {
		this.book_CDServiceContact = book_CDServiceContact;
	}
	public String getBook_topic() {
		return book_topic;
	}
	public void setBook_topic(String book_topic) {
		this.book_topic = book_topic;
	}
	
	public String getLoc_callNo() {
		return loc_callNo;
	}
	public void setLoc_callNo(String loc_callNo) {
		this.loc_callNo = loc_callNo;
	}
	public String getBook_abstract() {
		return book_abstract;
	}
	public void setBook_abstract(String book_abstract) {
		this.book_abstract = book_abstract;
	}
	public String getBook_target() {
		return book_target;
	}
	public void setBook_target(String book_target) {
		this.book_target = book_target;
	}
	public String getBook_douban_summarized() {
		return book_douban_summarized;
	}
	public void setBook_douban_summarized(String book_douban_summarized) {
		this.book_douban_summarized = book_douban_summarized;
	}
	
}
