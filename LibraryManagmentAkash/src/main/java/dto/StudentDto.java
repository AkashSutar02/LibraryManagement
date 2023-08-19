package dto;

public class StudentDto {
	
	private String sName;
	private int sRoll;
	private String email;
	
	private String course;
	private String pass;
	private String branch;
	public StudentDto(String sName, int sRoll, String email, String course, String pass, String branch) {
		super();
		this.sName = sName;
		this.sRoll = sRoll;
		this.email = email;
		this.course = course;
		this.pass = pass;
		this.branch = branch;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsRoll() {
		return sRoll;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
	

}
