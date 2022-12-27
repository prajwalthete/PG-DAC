package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig sc = getServletConfig();
		String driverName = sc.getInitParameter("driver_class");

		ServletContext cntx = getServletContext();
		String dname = cntx.getInitParameter("drv_class");

		try (PrintWriter out = response.getWriter();) {
			response.setContentType("text/html");

			out.print(driverName);
			out.print(dname);
		}

	}

}
