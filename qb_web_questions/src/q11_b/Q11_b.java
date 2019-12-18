package q11_b;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Q10_b
 */
@WebServlet("/Q11_b")
public class Q11_b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q11_b() {
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
			PrintWriter pw=response.getWriter();
			String sql;
			ResultSet r;
			if(request.getParameter("faculty_id") != null) {
				sql="Select * from subjects where faculty_id='"+request.getParameter("faculty_id")+"'";
				r=stmt.executeQuery(sql);
				pw.print("<table>");
				pw.print("<tr colspan=3>Subjects handled by</tr>");
				pw.print("<tr><th>sub_id</th><th>sub_name</th><th>faculty_id</th></tr>");
				while(r.next()) {
					pw.print("<tr><td>"+r.getInt(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td></tr>");
				}
				pw.print("</table>");
				sql="Update subjects set sub_id=10 where faculty_id='"+request.getParameter("faculty_id")+"'";
				int up=stmt.executeUpdate(sql);
				pw.print("No of rows updated:"+up);
			}else {
				sql="Select * from subjects";
				r=stmt.executeQuery(sql);
				pw.print("<table>");
				pw.print("<tr><th>sub_id</th><th>sub_name</th><th>faculty_id</th></tr>");
				while(r.next()) {
					pw.print("<tr><td>"+r.getInt(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td></tr>");
				}
				pw.print("</table>");
			}
		}catch(Exception e) {e.printStackTrace();}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
