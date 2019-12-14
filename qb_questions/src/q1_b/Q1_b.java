/*
 1 b. Write a JAVA-JDBC program to create the table named Department with the attributes
Dept_ID, Name, Year_Established, Head_Name, No_of_Employees. (i) Find the number employees in a CSE department. (ii) List Name, Dept_ID of all the departments which are established in the year 2010.
 */
package q1_b;
import java.sql.*;
import java.util.Scanner;

public class Q1_b {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			stmt=con.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS Department(Dept_ID int Primary key,Name varchar(30),Year_Established int,Head_Name varchar(30),No_of_Employees int);");
			System.out.print("DO you want to insert data? 1<yes> 0<no> :");
			if(in.nextInt()==1) {
				stmt.executeUpdate("INSERT INTO Department VALUES(1,'CSE',2010,'a',15);");
				stmt.executeUpdate("INSERT INTO Department VALUES(2,'ISE',2011,'b',20);");
				stmt.executeUpdate("INSERT INTO Department VALUES(3,'ME',2010,'c',30);");
			}
			rs=stmt.executeQuery("SELECT No_of_Employees from Department where name='CSE'");
			while(rs.next()) {
				System.out.print("NUMBER OF EMPLOYEES IN CSE DEPARTMENT:");
				System.out.println(rs.getInt(1));
			}
			rs.close();
			rs=stmt.executeQuery("SELECT Name,Dept_ID from Department where Year_Established=2010");
			while(rs.next()) {
				System.out.print("NAME:");
				System.out.print(rs.getString(1));
				System.out.print(" DEPT ID:");
				System.out.println(rs.getInt(2));
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(con != null) con.close();
					if(stmt != null) stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 		}

	}

}
