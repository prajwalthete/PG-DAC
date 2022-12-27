<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<form action="reg.jsp" method="post">
		<div>
			<label>User Name</label> <input type="text" name="uname">
		</div>
		<div>
			<label>Password</label> <input type="password" name="upass">
		</div>

		<button type="submit">Register</button>
	</form>
	<a href="login_form.jsp">Back</a>
</body>
</html>