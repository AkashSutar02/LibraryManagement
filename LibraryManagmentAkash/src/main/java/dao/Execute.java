package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

import dto.AllBookDTO;
import dto.AllStudentDTO;
import dto.BookDto;
import dto.IssueBookDto;
import dto.ReturnBookDto;
import dto.StatDTO;
import dto.StudentDto;

public class Execute {
	
public 	 ArrayList<StatDTO> rbok=new ArrayList<StatDTO>();
public 	 ArrayList<StatDTO> isue=new ArrayList<StatDTO>();
public 	 ArrayList<AllStudentDTO> fetchStudent= new ArrayList<AllStudentDTO>();
public ArrayList<AllBookDTO> fetchBook1=new ArrayList<AllBookDTO>();

	static Connection con;
	
	static {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","Akash@02");
		
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean addStudent(StudentDto sd) {
	try {
		PreparedStatement pstmt=con.prepareStatement("insert into studentinfo values(?,?,?,?,?,?)");
		pstmt.setString(1, sd.getsName());
		pstmt.setInt(2, sd.getsRoll());
		pstmt.setString(3, sd.getEmail());
		pstmt.setString(4, sd.getCourse());
		pstmt.setString(5,sd.getPass());
		pstmt.setString(6, sd.getBranch());
		pstmt.execute();
		return true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;

	
		
	}

	public boolean addBook(BookDto bd) {
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into bookinfo values(?,?,?,?)");
			pstmt.setString(1, bd.getBookName());
			pstmt.setString(2, bd.getAuthor());
			pstmt.setInt(3,bd.getStock());
			pstmt.setInt(4,0);
			pstmt.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
		
		
		
	}

	public boolean issueInfo(IssueBookDto e) {
		
		ArrayList<Integer> sroll=new ArrayList<Integer>();
		ArrayList<Integer> bookid=new ArrayList<Integer>();
		
		java.sql.Statement stmt;
		
		
		try {
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from studentinfo");
			while(rs.next()) {
				if(rs.getInt(2)==e.getsRoll()) {
				 java.sql.Statement stmt1=con.createStatement();
				ResultSet rs1= stmt1.executeQuery("select * from bookinfo");
				
				while(rs1.next()) {
					if(rs1.getInt(4)==e.getBookid()) {
						PreparedStatement pstm=con.prepareStatement("insert into issuebook values(?,?,?)");
						pstm.setInt(1, e.getsRoll());
						pstm.setInt(2, e.getBookid());
						pstm.setString(3, e.getDate());
						pstm.execute();
						
						
						PreparedStatement p=con.prepareStatement("update bookinfo set stock=? where bookId=?");
						p.setInt(1, rs1.getInt(3)-1);
						p.setInt(2, e.getBookid());
						return true;
						
						
						
					}
				}
				 
				}
			
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
		
		
		
	}

	public boolean returnBook(ReturnBookDto rd) {
		try {
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from  issuebook");
			while(rs.next()) {
				if(rs.getInt(1)==rd.getSroll()&&rs.getInt(2)==rd.getsId()) {
					
					PreparedStatement pstmt=con.prepareStatement("delete from issueBook where sroll=? and bookid=?");
					pstmt.setInt(1, rd.getSroll());
					pstmt.setInt(2, rd.getsId());
					pstmt.executeUpdate();
					
					PreparedStatement  p1=con.prepareStatement("insert into returnbook values(?,?,?)");
					p1.setInt(1, rd.getSroll());
					p1.setInt(2, rd.getsId());
					p1.setString(3, rd.getDate());
					p1.execute();
					
					
					return true;
				}
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}

	public ArrayList<StatDTO> issue() {
		
		
		try {
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from issuebook");
			
			while (rs.next()) {
				
			PreparedStatement p1=con.prepareStatement("select * from studentinfo where std_rollNo=?");
			PreparedStatement p2=con.prepareStatement("select * from bookinfo where bookid=?");	
			
			p1.setInt(1, rs.getInt(1));
			p2.setInt(1, rs.getInt(2));
			ResultSet r=p1.executeQuery();
			ResultSet r2=p2.executeQuery();
			
			while (r.next()&& r2.next()) {
				
				StatDTO s=new StatDTO(r.getInt(2), r.getString(1),r2.getString(1) , rs.getString(3));
				isue.add(s);
			}
			
			
				
			}
			
		 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return isue;
		
		
		
		
	}
	
	
	public ArrayList<StatDTO> r1(){
		
		
		try {
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from returnbook");
			
			while (rs.next()) {
				System.out.println("e1");
				
			PreparedStatement p1=con.prepareStatement("select * from studentinfo where std_rollNo=?");
			PreparedStatement p2=con.prepareStatement("select * from bookinfo where bookid=?");	
			
			p1.setInt(1, rs.getInt(1));
			p2.setInt(1, rs.getInt(2));
			ResultSet r=p1.executeQuery();
			ResultSet r2=p2.executeQuery();
			
			while (r.next()&& r2.next()) {
				
	
				StatDTO s=new StatDTO(r.getInt(2), r.getString(1),r2.getString(1) , rs.getString(3));
				rbok.add(s);
			}
			
			
				
			}
			
		 
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
		
		
		
		
		
		return rbok;
		
	}

	public ArrayList<AllStudentDTO> fetchStudent() {
		
		try {
			java.sql.Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from studentinfo");
			while(rs.next()) {
				AllStudentDTO d=new AllStudentDTO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				fetchStudent.add(d);
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fetchStudent;
		
	}

	public ArrayList<AllBookDTO> fetchBook() {
		
		try {
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from bookinfo");
			while (rs.next()) {
				
				AllBookDTO a=new AllBookDTO(rs.getString(1), rs.getString(2), rs.getInt(4));
				fetchBook1.add(a);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return fetchBook1;
		
		
	}
	
	
	
	
	
	}
	

	
	
	

