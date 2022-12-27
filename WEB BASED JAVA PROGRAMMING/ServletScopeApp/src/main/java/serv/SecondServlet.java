package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rdata = (String)request.getAttribute("req_data");
		
		HttpSession session = request.getSession(true);
		String sdata = (String)session.getAttribute("sess_data");
		
		ServletContext sc = getServletContext();
		String cdata = (String)sc.getAttribute("context_data");
		
		try(PrintWriter out = response.getWriter()){
			response.setContentType("text/html"); 
			out.print("<br>Request Object DAta : "+rdata);
			out.print("<br>Session Object DAta : "+sdata);
			out.print("<br>ServletContext Object DAta : "+cdata);
		}
	}

}
