package serv;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("req_data", "Data in Request Object");

		HttpSession session = request.getSession(true);
		session.setAttribute("sess_data", "Data in Session Object");

		ServletContext sc = getServletContext();
		sc.setAttribute("context_data", "Data in ServletContext object");

//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);

		response.sendRedirect("SecondServlet");

	}

}
