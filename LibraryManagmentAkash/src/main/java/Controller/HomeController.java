package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")

public class HomeController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getSession()!=null) {
			String data=req.getParameter("btn1");
	
			switch(data) {
			case "NewStudent":
				resp.sendRedirect("NewStudent.jsp");
				break;
				
			case "NewBook":
				resp.sendRedirect("NewBook.jsp");
				break;
			case "BookIssue":
				resp.sendRedirect("IssueBook.jsp");
				break;
			case "ReturnBook":
				resp.sendRedirect("ReturnBook.jsp");
				break;
			case "logout":
				RequestDispatcher rd=req.getRequestDispatcher("logout1");
				rd.forward(req, resp);
				break;
			case "Stat":
				
				RequestDispatcher rs=req.getRequestDispatcher("stat1");
				rs.forward(req, resp);
				break;
			case "allStudent":
				RequestDispatcher rd1=req.getRequestDispatcher("stud");
				rd1.forward(req, resp);
				break;
			case "AllBooks":
				RequestDispatcher rd2=req.getRequestDispatcher("all");
				rd2.forward(req, resp);
				break;
				
			
			
			}
			
		}else {
			resp.sendRedirect("index.html");
		}
			
	}
		
		
	
}
