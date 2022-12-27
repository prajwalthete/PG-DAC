package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Bill")
public class Bill extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> items = new ArrayList<String>();

		HttpSession session = request.getSession(false);

		String it1 = (String) session.getAttribute("pc");
		if (it1 != null) {
			items.add(it1);
		}

		String it2 = (String) session.getAttribute("mobile");
		if (it2 != null) {
			items.add(it2);
		}
		String it3 = (String) session.getAttribute("fan");
		if (it3 != null) {
			items.add(it3);
		}
		String it4 = (String) session.getAttribute("ac");
		if (it4 != null) {
			items.add(it4);
		}

		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");

		if (itm1 != null) {
			items.add(itm1);
		}
		if (itm2 != null) {
			items.add(itm2);
		}

		try (PrintWriter out = response.getWriter()) {
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Bill</title>");
			out.print("</head>");
			out.print("<body>");

			out.print("<h1>Items</h1>");

			items.forEach(ele -> out.print("<h3>" + ele + "</h3>"));

			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
