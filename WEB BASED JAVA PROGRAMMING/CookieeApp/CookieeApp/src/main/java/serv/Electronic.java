package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Electronic")
public class Electronic extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Electronic</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='Electric' >");
			out.print("<input type='checkbox' name='item1' value='pc' >PC<br>");
			out.print("<input type='checkbox' name='item2' value='mobile' >MOBILE<br>");
			out.print("<input type='submit' value='Next' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
