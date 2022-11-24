<%@page import="com.prajwal.entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.prajwal.service.ProductServiceImpl"%>
<%@page import="com.prajwal.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ProductService productService = new ProductServiceImpl();
List<Product> plist = productService.getAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
				<th>Date</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Product p : plist) {
			%>
			<tr>
				<td><%=p.getName()%></td>
				<td><%=p.getPrice()%></td>
				<td><%=p.getCategory()%></td>
				<td><%=p.getMdate()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>