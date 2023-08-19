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
import dto.AllBookDTO;
@WebServlet("/all")

public class AllBooks extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Execute e=new Execute();
		ArrayList<AllBookDTO> d=e.fetchBook();
		req.setAttribute("data", d);
		RequestDispatcher rd=req.getRequestDispatcher("Ab.jsp");
		rd.forward(req, resp);
		
	}

}
