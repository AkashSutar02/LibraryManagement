package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Execute;
import dto.BookDto;
import dto.StudentDto;
@WebServlet("/newBook")

public class NewBook extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String bookName=req.getParameter("bname");
	String author=req.getParameter("author");
	int stock=Integer.parseInt(req.getParameter("stock"));
	
	BookDto bd=new BookDto(bookName, author, stock);
	Execute e=new Execute();
	boolean b=e.addBook(bd);
	
	
	 PrintWriter pw=resp.getWriter();
		
		if(b) {
			
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Book added');");
			pw.print("location='dash.jsp'");
			pw.print("</script>");
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('unsuccesfully');");
			pw.print("location='NewBook.jsp';");
			pw.print("</script>");

		}
	
	
	}

}
