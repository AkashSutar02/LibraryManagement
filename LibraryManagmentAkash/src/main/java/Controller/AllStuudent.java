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
import dto.AllStudentDTO;

@WebServlet("/stud")

public class AllStuudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Execute e=new Execute();
		System.out.println("stude");
		ArrayList<AllStudentDTO> d=e.fetchStudent();
		req.setAttribute("data", d);
		RequestDispatcher rd=req.getRequestDispatcher("AllStudent.jsp");
		rd.forward(req, resp);
	}

}
