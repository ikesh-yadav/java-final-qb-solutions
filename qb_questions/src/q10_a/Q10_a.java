package q10_a;

import java.util.Scanner;

import q10_a.AdvMath.*;

public class Q10_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.print("Enter input for y:");
		int n=in.nextInt();
		new SCT(n);
		System.out.print("Enter no of pythagorean triplets to find:");
		n=in.nextInt();
		new PyTriplets(n);
	}

}
