
<%@ page errorPage="error.jsp" %>
<%!
	int res;
	void div(int a,int b){
		res = a/b;
	}

%>

<%
	String p1 = request.getParameter("num1");
	String p2 = request.getParameter("num2");
	int n1 = Integer.parseInt(p1);
	int n2 = Integer.parseInt(p2);
	div(n1,n2);
%>

<%=res%>