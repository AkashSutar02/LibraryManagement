package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Execute;
import dto.StudentDto;
@WebServlet("/newStudent")

public class NewStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String user=req.getParameter("user");
	String pass=req.getParameter("pass");
	int roll=Integer.parseInt(req.getParameter("roll"));
	String name=req.getParameter("name");
	String course=req.getParameter("course");
	String branch=req.getParameter("branch");
	Execute e=new Execute();
	StudentDto sd=new StudentDto(name,roll,user,course,pass,branch);
	boolean b=e.addStudent(sd);
	 PrintWriter pw=resp.getWriter();
	
		if(b) {
			
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('student added');");
			pw.print("location='dash.jsp'");
			pw.print("</script>");
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('unsuccesfully');");
			pw.print("location='NewStudent.jsp';");
			pw.print("</script>");

		}
		
	}

}
