<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="emp" class="com.prajwal.entity.Employee" scope="session" ></jsp:useBean>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<jsp:getProperty name="emp" property="empId" /><br>
	<jsp:getProperty name="emp" property="empName" /><br>
	<jsp:getProperty name="emp" property="salary" /><br>
</body>
</html>