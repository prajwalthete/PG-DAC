package serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = { "/PostServlet" })
public class PostServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// specify the response content type
		resp.setContentType("text/plain");
		// get PrintWriter object of the Response to write the response text
		PrintWriter out = resp.getWriter();
		// write the response
		out.print("Hello from doPost");
		// flush the content / empty the buffer
		out.flush();
		// close the resource PrintWriter
		out.close();
	}

}
