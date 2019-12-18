package q9_a;

import java.util.Scanner;

class Library{
	Scanner in=new Scanner(System.in);
	int Acc_Num;
	String Title;
	void input() {
		System.out.print("Enter acc number ,Title and author name");
		Acc_Num=in.nextInt();
		Title=in.next();
		Title+=" "+in.next();
	}
	void compute() {
		System.out.print("Enter number of days late:");
		int days=in.nextInt();
		System.out.println("Late cahrges:"+days*2);
	}
	void display() {
		System.out.println("Acc_num:"+Acc_Num+" Title and author name:"+Title);
	}
}
public class Q9_a {
	public static void main(String args[]) {
		Library l=new Library();
		l.input();
		l.compute();
		l.display();
	}
}
