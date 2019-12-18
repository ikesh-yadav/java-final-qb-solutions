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
	if(request.getParameter("m")!=null){
		int m=Integer.parseInt(request.getParameter("m"));
		if(m>90) out.print("<h2>Grade:A</h2>");
		else if(m>79) out.print("<h2>Grade:B</h2>");
		else if(m>69) out.print("<h2>Grade:C</h2>");
		else out.print("<h2>Grade:Fail</h2>");
	}else{
%>
<form>
	Enter marks:<input type="number" name="m"><br>
	<button>calculate</button>
</form>
<%  } %>
</body>
</html>