
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String unm = request.getParameter("uname");
	String pass = request.getParameter("upass");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","root");
	PreparedStatement s = con.prepareStatement("insert into user values(?,?)");
	s.setString(1, unm);
	s.setString(2, pass);
	int i = s.executeUpdate();
	con.close();
	response.sendRedirect("login_form.jsp");


%>