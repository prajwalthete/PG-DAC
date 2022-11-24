package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Electric")
public class Electric extends HttpServlet {
	
   
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");
		
		if(itm1!=null) {
			// create the cookie object to store the item
			Cookie cookie = new Cookie("pc", itm1);
			// attache cookie with response to send it to the client
			response.addCookie(cookie);
		}
		
		if(itm2!=null) {
			Cookie cookie = new Cookie("mobile", itm2);
			response.addCookie(cookie);
		}
		
		
		try(PrintWriter out = response.getWriter()){
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
