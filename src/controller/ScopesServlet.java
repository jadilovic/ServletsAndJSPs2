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

/**
 * Servlet implementation class ScopesServlet
 */
@WebServlet("/scopes")
public class ScopesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		request.setAttribute("nameRequestScope", name);
		out.println("Hi from request scopme name: " + request.getAttribute("nameRequestScope"));
		
		HttpSession session = request.getSession();
		if(name != null && name != "") {
			session.setAttribute("nameSessionScope", name);
			out.println("Hi from session scope name: " + session.getAttribute("nameSessionScope"));
		}
		
		ServletContext application = request.getServletContext();
		if(name != null && name != "") {
			application.setAttribute("nameApplicationScope", name);
			out.println("Hi from application scope name: " + application.getAttribute("nameApplicationScope"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
