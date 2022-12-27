package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String unm = request.getParameter("uname");
		String pass = request.getParameter("upass");
		boolean flag = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Prajwal@123");
			PreparedStatement s = con.prepareStatement("select * from user where uname = ? and upass = ?");
			s.setString(1, unm);
			s.setString(2, pass);
			ResultSet rs = s.executeQuery();
			if (rs.next()) {
				flag = true;
			}
			rs.close();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if (flag) {
			response.sendRedirect("HomeServlet");
		} else {
			response.sendRedirect("login_form.html");
		}
	}

}
