package dto;

public class StatDTO {
	
	private int id;
	private String name;
	private String bookname;
	private String date;
	public StatDTO(int id, String name, String bookname, String date) {
		super();
		this.id = id;
		this.name = name;
		this.bookname = bookname;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
