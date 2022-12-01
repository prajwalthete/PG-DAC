<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Add</title>
</head>
<body>
	<spr:form action="car_add.htm" method="post" commandName="car" >
		<div>
			<label>Model</label>
			<spr:input path="model"/>
		</div>
		<div>
			<label>Make</label>
			<spr:input path="make"/>
		</div>
		<div>
			<label>Price</label>
			<spr:input path="price"/>
		</div>
		<div>
			<label>Date</label>
			<spr:input path="mdate"/>
		</div>
		<button type="submit" >Add</button>
	</spr:form>
</body>
</html>