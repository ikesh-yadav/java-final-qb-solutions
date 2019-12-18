<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="second.jsp">
		Book no:<input name="Book_no" required /><br>
		Title:<input name="Title"  required/><br>
		Author:<input name="Author" required/><br>
		Publication:<input name="Publication"  required/><br>
		Price:<input name="Price" required />
		<button>Submit</button>
	</form>
	<hr>
	<form action="second.jsp">
		Enter title to search for:Title:<input name="title-search" required/><br>
		<button>Submit</button>
	</form>
</body>
</html>