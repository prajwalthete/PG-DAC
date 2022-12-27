<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
	<form action="login.jsp" method="post" >
		<div>
			<label>User Name</label>
			<input type="text" name="uname" >
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="upass" >
		</div>
		
		<button type="submit" >Login</button>
	</form>
	<a href="reg_form.jsp" >Sign Up</a>
</body>
</html>