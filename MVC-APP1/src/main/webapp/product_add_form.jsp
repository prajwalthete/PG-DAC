<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Add</title>
</head>
<body>
	<form action="product_add.jsp" method="post" >
		<div>
			<label>Product Name</label>
			<input type="text" name="name" placeholder="Enter product name" >
		</div>
		<div>
			<label>Product Price</label>
			<input type="text" name="price" placeholder="Enter product price" >
		</div>
		<div>
			<label>Product Category</label>
			<select name="category" >
				<option value="electric" >Electric</option>
				<option value="electronic" >Electronic</option>
				<option value="home appliances" >Home Appliances</option>
			</select>
		</div>
		<div>
			<label>Date</label>
			<input name="mdate" type="text" placeholder="Date YYYY-MM-DD">
		</div>
		<button type="submit" >Add</button>
	</form>
</body>
</html>