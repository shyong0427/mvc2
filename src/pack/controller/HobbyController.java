package pack.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack.model.HobbyModel;

@WebServlet({"/hobby.do", "/hobby2.do", "*.do"})
public class HobbyController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("성공");
		String hobby = request.getParameter("hobby");
		
		HobbyModel model = HobbyModel.getInstance();
		ArrayList<String> list = model.getHobby(hobby);
		request.setAttribute("data", list);
		
		String viewName = "/views/list.jsp";
		
		request.getRequestDispatcher(viewName).forward(request, response);
	}
}