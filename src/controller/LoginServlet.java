package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginBO;
import model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username, password;

		// get username and password
		username = request.getParameter("username");
		password = request.getParameter("password");

		// authenticate the username and password
		LoginBO login = new LoginBO();
		boolean result = login.authenticateUser(username, password);

		// based on the result, redirect the user
		if (result) {

			User user = new User();
			user.setUsername(username);
			user.setPassword(password);

			request.setAttribute("user", user);

			RequestDispatcher success = request.getRequestDispatcher("view/success.jsp");
			success.forward(request, response);

		} else {
			RequestDispatcher failure = request.getRequestDispatcher("view/login.jsp");
			failure.forward(request, response);
		}
	}

}
