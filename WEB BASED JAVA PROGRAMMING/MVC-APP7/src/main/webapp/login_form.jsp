<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>	
	<form action="login.jsp" method="post" >
		<div>
			<label>User Name</label>
			<input type="text" name="uname" placeholder="Enter user name" >
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="upass" placeholder="Enter password" >
		</div>
		
		<button type="submit" >Login</button>
	</form>
</body>
</html>