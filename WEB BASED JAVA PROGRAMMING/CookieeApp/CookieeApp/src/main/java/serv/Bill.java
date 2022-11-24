package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Bill")
public class Bill extends HttpServlet {
	  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> items = new ArrayList<String>();
		// read the cookies from cookie file in the form array
		Cookie[] ar = request.getCookies();
		if(ar!=null) {
			// get the cookie values from cookie array
			for(Cookie c : ar) {
				items.add(c.getValue());
			}
		}
		
		
		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");
		
		if(itm1!=null) {
			items.add(itm1);
		}
		if(itm2!=null) {
			items.add(itm2);
		}
		
		
		try(PrintWriter out = response.getWriter()){
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Bill</title>");
			out.print("</head>");
			out.print("<body>");
			
			out.print("<h1>Items</h1>");
			
			items.forEach(ele -> out.print("<h3>"+ele+"</h3>") ); 
			
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
