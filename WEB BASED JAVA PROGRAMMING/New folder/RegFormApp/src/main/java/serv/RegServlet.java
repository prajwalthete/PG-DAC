package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// to get request parameter value 
				String fnm = request.getParameter("fname");
				String ps = request.getParameter("pass");
				String gen = request.getParameter("gender");
				String [] langs = request.getParameterValues("languages");
				String addr = request.getParameter("address");
				String city = request.getParameter("city");
				
				
				try(PrintWriter out = response.getWriter()){
					response.setContentType("text/html");
					out.print("<html>");
					out.print("<head>");
					out.print("<title>Reg Info</title>");
					out.print("</head>");
					out.print("<body>");
					out.println("<h1>"+fnm+"</h1>");
					out.println("<h1>"+ps+"</h1>");
					out.println("<h1>"+gen+"</h1>");
					for(String s : langs) {
						out.println("<h1>"+s+"</h1>");
					}
					out.println("<h1>"+addr+"</h1>");
					out.println("<h1>"+city+"</h1>");
					out.print("</body>");
					out.print("</html>");
				}
		//doGet(request, response);
	}

}