package q14_b;

import java.sql.*;
import java.util.Scanner;

public class Q14_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/testDB","root","");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			Scanner in=new Scanner(System.in);
			ResultSet r;
			System.out.print("do you want to display details of students less than 9 cgpa:");
			int ch=in.nextInt();
			if(ch==1) {
				r=stmt.executeQuery("select * from student where cgpa<9");
				while(r.next()) {
					System.out.println("Name:"+r.getString(1)+" CGPA:"+r.getDouble(2));
				}
			}
			System.out.print("do you want to cahnge john's cgpa");
			ch=in.nextInt();
			if(ch==1) {
				r=stmt.executeQuery("select * from student where name='john'");
				while(r.next()) {
					r.updateDouble(2, 9.4);
					r.updateRow();
					System.out.println("Updated john's Cgpa");
				}
			}
			System.out.println("Details of all students");
			r=stmt.executeQuery("select * from student");
			while(r.next()) {
				System.out.println("Name:"+r.getString(1)+" CGPA:"+r.getDouble(2));
			}
		}catch(Exception e) {e.printStackTrace();}
	}

}
