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
	if(session.isNew()){
		session.setAttribute("count",1);
	}else{
		int c=(Integer)session.getAttribute("count");
		session.setAttribute("count",c+1);
	}
	String name=request.getParameter("username");
	int marks=Integer.parseInt(request.getParameter("marks"));
	if(marks>40) out.print("<h2>"+name+",You are eligible</h2>");
	else out.print("<h2>"+name+",You are not eligible</h2>");
	out.print("<h3>Visit count:"+session.getAttribute("count")+"</h3>");
%>

</body>
</html>