package com.prajwal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prajwal.dao.EmployeeDao;
import com.prajwal.entity.Employee;

/**
 * Servlet implementation class AddEmployeeServlet
 */
public class AddEmployeeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee emp = new Employee();
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setName(request.getParameter("name"));
		emp.setSalary(Double.parseDouble(request.getParameter("salary")));
		emp.setDateOfJoining(LocalDate.parse(request.getParameter("doj")));

		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);

		PrintWriter out = response.getWriter();
		out.write("<h1>Record added!</h1>");

	}

}
