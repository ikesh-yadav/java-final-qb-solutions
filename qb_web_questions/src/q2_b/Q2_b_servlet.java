package q2_b;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q2_b_servlet
 */
@WebServlet("/Q2_b_servlet")
public class Q2_b_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q2_b_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		ResultSet rs;
		PrintWriter pw=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
			stmt=con.createStatement();
			String sql;
			if(request.getParameter("rg").equals("1")) {
				sql="SELECT * FROM `q2_b` where `area` like '%"+request.getParameter("a_or_p")+"%'";
			}else {
				sql="SELECT * FROM `q2_b` where `phno` like '%"+request.getParameter("a_or_p")+"%'";
			}
			rs=stmt.executeQuery(sql);
			response.setContentType("text/html");
			pw.println("<table><tr><th>AREA</th><th>PhoneNO</th>");
			while(rs.next()) {
				pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getInt(2)+"</td>");
			}
			pw.print("</table>");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(con!=null) con.close();
				if(con!=null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
