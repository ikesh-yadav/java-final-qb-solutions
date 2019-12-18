package q9_b;

import java.sql.*;
import java.util.Scanner;

public class Q9_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
			Statement stmt=con.createStatement();
			Scanner in=new Scanner(System.in);
			System.out.print("Enter account number:");
			int ac_no=in.nextInt();
			con.setAutoCommit(false);
			Savepoint sp=con.setSavepoint();
			String sql="Select * from Bank where ac_no="+ac_no;
			ResultSet r=stmt.executeQuery(sql);
			r.next();
			int bal=r.getInt(2);
			int ch=1;
			while(true) {
				System.out.print("Operation 1<withdraw> 2<deposit> 3<view balance> 4<exit>:");
				ch=in.nextInt();
				switch(ch) {
					case 1:{
							System.out.print("Enter amount to withdraw:");
							int wd=in.nextInt();
							if(bal-wd>=0) {
								sql="Update Bank set balance="+(bal-wd)+" where ac_no="+ac_no;
								stmt.executeUpdate(sql);
								bal-=wd;
								System.out.println("Amount withdrawn:"+wd);
								System.out.println("Availablebalance:"+bal);
								con.commit();
								sp=con.setSavepoint();
							}else {
								con.rollback(sp);
								System.out.println("Insufficient Balance:"+bal);
							}
							}break;
					case 2:{
							System.out.print("Enter amount to Deposit:");
							int d=in.nextInt();
							sql="Update Bank set balance="+(bal+d)+" where ac_no="+ac_no;
							stmt.executeUpdate(sql);
							bal=bal+d;
							System.out.println("Availablebalance:"+bal);
							con.commit();
							sp=con.setSavepoint();
							}break;
					case 3:{
						System.out.println("Availablebalance:"+bal);
						}break;
					case 4:{
						System.exit(0);
					}break;
					default:{System.out.println("Incorrect option");}
				}
			}
		}catch(Exception e) {e.printStackTrace();}

	}

}
