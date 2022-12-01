<%@page import="com.prajwal.entity.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<Car> lst = (List<Car>)request.getAttribute("cars"); %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car List</title>
</head>
<body>
	<table>
		<% for(Car car : lst){ %>
		
		<tr>
			<td><%=car.getModel()%></td>
			<td><%=car.getMake()%></td>
			<td><%=car.getPrice()%></td>
			<td><%=car.getMdate()%></td>
			<td><a href="car_delete.htm?id=<%=car.getId()%>" >delete</a></td>
			<td><a href="car_update_form.htm?id=<%=car.getId()%>" >update</a></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>