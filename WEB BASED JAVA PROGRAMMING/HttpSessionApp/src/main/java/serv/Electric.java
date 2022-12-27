package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Electric")
public class Electric extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");
		// get session object in servlet
		HttpSession session = request.getSession(true);

		if (itm1 != null) {
			session.setAttribute("pc", itm1);
		}

		if (itm2 != null) {
			session.setAttribute("mobile", itm2);
		}

		try (PrintWriter out = response.getWriter()) {
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Electric</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='HomeAppliances' >");
			out.print("<input type='checkbox' name='item1' value='fan' >FAN<br>");
			out.print("<input type='checkbox' name='item2' value='ac' >AC<br>");
			out.print("<input type='submit' value='Next' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
