package dto;

public class BookDto {
	private String bookName;
	private String author;
	private int stock;
	public BookDto(String bookName, String author, int stock) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.stock = stock;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	

}
