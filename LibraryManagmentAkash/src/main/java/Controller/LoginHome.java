package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginHome extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		if(req.getParameter("user").equals("admin")&& req.getParameter("pass").equals("admin123")) {
			HttpSession ses=req.getSession(true);
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('Login Successfully..');");
			pw.print("location='dash.jsp';");
			pw.print("</script>");
			
			resp.sendRedirect("dash.jsp");
		}else {
			pw.print("<script type=\"text/javascript\">");
			pw.print("alert('You are not validate!.');");
			pw.print("location='index.html';");
			pw.print("</script>");
		}
		
	}
	
	

}
