<%@page import="com.prajwal.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<%
	Employee e = (Employee) session.getAttribute("emp_data");
	%>
	<%=e.getEmpId()%><br>
	<%=e.getEmpName()%><br>
	<%=e.getSalary()%>
</body>
</html>