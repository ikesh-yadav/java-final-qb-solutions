package q6_b;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Q6_b
 */
@WebServlet("/Q6_b")
public class Q6_b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q6_b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
			Statement stmt=con.createStatement();
			stmt.execute("create table if not exists employee_Q6_b(EMP_ID int,Employee_Name varchar(30),Address varchar(30),DateofBirth Date)");
			PreparedStatement ps=con.prepareStatement("Insert into employee_Q6_b values(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(request.getParameter("id")));
			ps.setString(2, request.getParameter("name"));
			ps.setString(3, request.getParameter("address"));
			Date d= new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
			java.sql.Date sqld=new java.sql.Date(d.getTime());
			ps.setDate(4, sqld);
			ps.executeUpdate();
			ResultSet rs=stmt.executeQuery("Select * from employee_Q6_b");
			PrintWriter pw=response.getWriter();
			//response.setContentType("text/html");
			pw.print("<table>");
			while(rs.next()) {
				pw.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getDate(4)+"</td></tr>");
			}
			pw.print("</table>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
