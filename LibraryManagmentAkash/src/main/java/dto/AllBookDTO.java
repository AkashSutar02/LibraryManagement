package dto;

public class AllBookDTO {
	
	private String bookname;
	private String authorename;
	private int bookId;
	public AllBookDTO(String bookname, String authorename, int bookId) {
		super();
		this.bookname = bookname;
		this.authorename = authorename;
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorename() {
		return authorename;
	}
	public void setAuthorename(String authorename) {
		this.authorename = authorename;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	

}
