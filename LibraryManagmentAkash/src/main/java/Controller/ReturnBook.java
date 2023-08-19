package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Execute;
import dto.ReturnBookDto;
@WebServlet("/returnBook")

public class ReturnBook extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int roll=Integer.parseInt(req.getParameter("roll"));
		int bid=Integer.parseInt(req.getParameter("bid"));
		String s=req.getParameter("idate");
		
		ReturnBookDto rd=new ReturnBookDto(roll, bid, s);
		Execute e=new Execute();
		PrintWriter pw=resp.getWriter();
		boolean b=e.returnBook(rd);
		
		

		if(b) {
			
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Due Book Succesfully');");
			pw.print("location='dash.jsp'");
			pw.print("</script>");
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Information miss match please correct the fill deatils');");
			pw.print("location='ReturnBook.jsp';");
			pw.print("</script>");

		}
		
		
	}

}
