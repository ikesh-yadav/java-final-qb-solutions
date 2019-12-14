package q3_a;

import java.util.Scanner;

public class Q3_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		Scanner in=new Scanner(System.in);
		while(c==1) {
			System.out .print("ENTER NAME AND AGE:");
			String name=in.next();
			int age=in.nextInt();
			try {
				Employee e=new Employee(name,age);
				e.print();
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.print("More employees: 1<yes> 0<no>");
			c=in.nextInt();
		}
	}

}
