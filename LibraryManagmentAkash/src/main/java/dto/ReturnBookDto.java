package dto;

public class ReturnBookDto {
	private int sroll;
	private int sId;
	private String date;
	public ReturnBookDto(int sroll, int sId, String date) {
		super();
		this.sroll = sroll;
		this.sId = sId;
		this.date = date;
	}
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
