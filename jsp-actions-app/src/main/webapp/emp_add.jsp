
<jsp:useBean id="emp" class="com.prajwal.entity.Employee" scope="session" ></jsp:useBean>
<jsp:setProperty name="emp" property="empId" param="eid" ></jsp:setProperty>
<jsp:setProperty name="emp" property="empName" param="ename" ></jsp:setProperty>
<jsp:setProperty name="emp" property="salary" param="sal" ></jsp:setProperty>

<%
	response.sendRedirect("emp_show.jsp");
%>