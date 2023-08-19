package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Execute;
import dto.StatDTO;

@WebServlet("/stat1")

public class Stastitics extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  
	  Execute e=new Execute();
	ArrayList<StatDTO> is= e.issue();
	 ArrayList<StatDTO> reu= e.r1();
	 System.out.println(reu.get(0).getBookname());

	 req.setAttribute("is", is);
	 req.setAttribute("reu", reu);
	  RequestDispatcher rd=req.getRequestDispatcher("Stat.jsp");
	  
       rd.forward(req, resp);
	  
}
}
