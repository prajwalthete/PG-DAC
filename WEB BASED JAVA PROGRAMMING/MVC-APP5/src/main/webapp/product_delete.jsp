<%@page import="com.prajwal.service.ProductServiceImpl"%>
<%@page import="com.prajwal.service.ProductService"%>
<%
	String p = request.getParameter("no");
	int no = Integer.parseInt(p);
	
	ProductService productService = new ProductServiceImpl();
	productService.remove(no);
	response.sendRedirect("product_list.jsp"); 
%>