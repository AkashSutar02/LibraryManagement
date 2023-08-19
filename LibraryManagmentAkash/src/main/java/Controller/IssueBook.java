package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import dao.Execute;
import dto.IssueBookDto;
@WebServlet("/issueBook")

public class IssueBook extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int roll=Integer.parseInt(req.getParameter("roll"));
		int bid=Integer.parseInt(req.getParameter("bid"));
		String s=req.getParameter("idate");
		IssueBookDto id=new IssueBookDto(roll, bid, s);
		Execute e=new Execute();
		PrintWriter pw=resp.getWriter();
		boolean b=e.issueInfo(id);

		if(b) {
			
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Issued Book Succesfully');");
			pw.print("location='dash.jsp'");
			pw.print("</script>");
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Information miss match please correct the fill deatils');");
			pw.print("location='IssueBook.jsp';");
			pw.print("</script>");

		}
		
		
	}

}
