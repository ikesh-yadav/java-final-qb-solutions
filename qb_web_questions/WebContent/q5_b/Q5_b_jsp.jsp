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
	if(request.getParameter("name")!=null && request.getParameter("age")!=null){
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		if(age>62) out.print("Hello,"+name+" Your movie ticket is RS.50");
		else if(age<10) out.print("Hello,"+name+" Your movie ticket is RS.30");
		else out.print("Hello,"+name+" Your movie ticket is RS.80");
	}else{

%>
	<form>
		Name:<input name="name" required><br>
		Age:<input name="age" required><br>
		<button>submit</button>
	</form>
<%} %>
</body>
</html>