<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Upload</title>
</head>
<body>
	<%@ include file="menu_admin.jsp" %>
	
	<form action="UploadServlet" method="post" enctype="multipart/form-data" > 
		<input type="hidden" name="no" value="<%=request.getParameter("no")%>" > 
		<div>
			<label>Product Image</label>
			<input type="file" name="image" placeholder="Select product Image" >
		</div>		
		<button type="submit" >Upload</button>
	</form>
</body>
</html>