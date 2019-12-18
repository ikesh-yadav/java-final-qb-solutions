package q10_b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Q10_b
 */
@WebServlet("/Q10_b")
public class Q10_b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q10_b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] c_list=request.getCookies();
		String old_pan_value=null;
		PrintWriter pw=response.getWriter();
		for(int i=0;i<c_list.length;i++) {
			if(c_list[i].getName().equals("Pan_ID")) {
				old_pan_value=c_list[i].getValue();
			}
		}
		if(old_pan_value==null) {
			pw.println("Welcome");
			Cookie c=new Cookie("Pan_ID",request.getParameter("Pan_ID"));
			pw.println("first Pan_ID value:"+request.getParameter("Pan_ID"));
			response.addCookie(c);
		}else {
			pw.println("Welcome Back");
			Cookie c=new Cookie("Pan_ID",request.getParameter("Pan_ID"));
			pw.println("fetched Pan_ID value:"+old_pan_value);
			pw.println("new Pan_ID value:"+request.getParameter("Pan_ID"));
			response.addCookie(c);
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
