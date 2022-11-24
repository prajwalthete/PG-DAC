package serv;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String unm = request.getParameter("uname");
		String upass = request.getParameter("upass");

		if (unm.equals("ram") && upass.equals("abc")) {
			// to redirect the request to specified url
			response.sendRedirect("HomeServlet");
		} else {
			response.sendRedirect("login_form.html");
		}

	}

}
