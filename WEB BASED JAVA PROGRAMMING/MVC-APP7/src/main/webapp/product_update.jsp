<%@page import="com.prajwal.service.ProductServiceImpl"%>
<%@page import="com.prajwal.service.ProductService"%>
<jsp:useBean id="product" class="com.prajwal.entity.Product"></jsp:useBean>
<jsp:setProperty property="*" name="product" />

<%
ProductService productService = new ProductServiceImpl();
productService.modify(product);
response.sendRedirect("product_list.jsp");
%>