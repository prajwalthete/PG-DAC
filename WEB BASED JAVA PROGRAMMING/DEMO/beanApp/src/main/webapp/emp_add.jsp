
<%@page import="com.prajwal.entity.Employee"%>
<%
	String p1 = request.getParameter("eid");
	int empId = Integer.parseInt(p1);
	String empName = request.getParameter("ename");
	String p2 = request.getParameter("sal");
	float salary = Float.parseFloat(p2);
	
	Employee emp = new Employee();
	
	emp.setEmpId(empId);
	emp.setEmpName(empName);
	emp.setSalary(salary);
	
	
	session.setAttribute("emp_data", emp);
	response.sendRedirect("emp_show.jsp");
	
%>