package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HomeAppliances")
public class HomeAppliances extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");

		if (itm1 != null) {
			Cookie cookie = new Cookie("fan", itm1);
			response.addCookie(cookie);
		}

		if (itm2 != null) {
			Cookie cookie = new Cookie("ac", itm2);

			response.addCookie(cookie);
		}

		try (PrintWriter out = response.getWriter()) {
			out.print("<html>");
			out.print("<head>");
			out.print("<title>HomeAppliances</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<form action='Bill' >");
			out.print("<input type='checkbox' name='item1' value='iron' >IRON<br>");
			out.print("<input type='checkbox' name='item2' value='mixer' >MIXER<br>");
			out.print("<input type='submit' value='Bill' ><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
