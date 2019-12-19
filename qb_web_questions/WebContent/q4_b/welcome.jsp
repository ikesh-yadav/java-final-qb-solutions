<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String un=request.getParameter("un");
	String psw=request.getParameter("psw");
	if (un.equals("admin") && psw.equals("pass")){
		session.setAttribute("un",un);
		out.print("Hello, "+session.getAttribute("un"));
	}else{
		response.sendRedirect("register.html");
	}
%>
</body>
</html>