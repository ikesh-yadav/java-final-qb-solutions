<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
		Statement stmt=con.createStatement();
		if(request.getParameter("Book_no")!=null){
			String sql="INSERT INTO BOOKS VALUES("+request.getParameter("Book_no")+",'"+request.getParameter("Title")+"','"+request.getParameter("Author")+"','"+request.getParameter("Publication")+"',"+request.getParameter("Price")+")";
			stmt.executeUpdate(sql);
			out.print("Inserted succesfully<br>");
		}
		if(request.getParameter("title-search")!=null){
			String sql="Select * from BOOKS WHERE title like '%"+request.getParameter("title-search")+"%'";
		    ResultSet r=stmt.executeQuery(sql);
		    out.print("<table style='border:2px solid black'>");
		    while(r.next()){
		    	out.print("<tr><td>"+r.getInt(1)+"</td>");
		    	out.print("<td>"+r.getString(2)+"</td>");
		    	out.print("<td>"+r.getString(3)+"</td>");
		    	out.print("<td>"+r.getString(4)+"</td>");
		    	out.print("<td>"+r.getInt(5)+"</td></tr>");
		    }
		    out.print("</table>");
		}
	}catch(Exception e){e.printStackTrace();}
	
	%>
</body>
</html>