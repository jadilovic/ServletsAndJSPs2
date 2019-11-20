package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/name")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request object scope
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<p> Hello " + name + ", request says Hi!</p>");

		// session object scope
		HttpSession session = request.getSession();
		if (name != "" && name != null) {
			session.setAttribute("sessionName", name);
		}
		out.println("<p> Hello " + session.getAttribute("sessionName") + ", session says Hi!</p>");

		// application object scope
		ServletContext application = request.getServletContext();
		if (name != "" && name != null) {
			application.setAttribute("applicationName", name);
		}
		out.println("<p> Hello " + application.getAttribute("applicationName") + ", application says Hi!</p>");

	}

}