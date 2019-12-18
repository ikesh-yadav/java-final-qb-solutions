package q11_a;

import java.util.Scanner;

public class Q11_a {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=in.nextLine();
		char first=input.charAt(0);
		input=input.toUpperCase();
		int count=0;
		for(int i=1;i<input.length();i++){
			if(first==input.charAt(i)) {
				count++;
			}
			first=input.charAt(i);
		}
		System.out.println("UPPERCASE STRING:"+input);
		System.out.println("OUTPUT:"+count);
	}
}
