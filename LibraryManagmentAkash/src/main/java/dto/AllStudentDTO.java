package dto;

public class AllStudentDTO {
	
	
	private String name;
	private int roll;
	private String email;
	private String course;
	private String password;
	private String branch;
	public AllStudentDTO(String name, int roll, String email, String course, String password, String branch) {
		super();
		this.name = name;
		this.roll = roll;
		this.email = email;
		this.course = course;
		this.password = password;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
	

}
