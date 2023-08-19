package dto;

public class IssueBookDto {
	private int sRoll;
	private int bookid;
	private String date;
	public IssueBookDto(int sRoll, int bookid, String date) {
		super();
		this.sRoll = sRoll;
		this.bookid = bookid;
		this.date = date;
	}
	public int getsRoll() {
		return sRoll;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
