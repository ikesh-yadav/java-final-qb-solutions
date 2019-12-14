package q3_b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q3_b_servlet
 */
@WebServlet("/Q3_b_servlet")
public class Q3_b_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q3_b_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String initials(String name) {
    	String nameList[]=name.split(" ");
    	String initials="";
    	for(int i=0;i<nameList.length;i++) {
    		initials=initials+nameList[i].charAt(0);
    	}
		return "INITIAL:"+initials.toUpperCase();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text");
		pw.print(initials(name));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
