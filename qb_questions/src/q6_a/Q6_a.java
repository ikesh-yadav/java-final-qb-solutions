package q6_a;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception{
	String toString(AgeOutOfRangeException e) {
		return "AGE OUT OF RANGE!";
	}
}
class LowCGpaException extends Exception{
	String toString(LowCGpaException e) {
		return "LOW CGPA!";
	}
}
public class Q6_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				Scanner in=new Scanner(System.in);
				System.out.print("ENTER AGE AND CGPA:");
				int age=in.nextInt();
				int cgpa=in.nextInt();
				if(age>25) throw new AgeOutOfRangeException();
				else if(cgpa<8) throw new LowCGpaException();
				else System.out.println("Submitted wait");
			}catch(LowCGpaException e) {
				System.out.println(e);
			}catch(Exception e) {
				throw e;
			}
		}catch(AgeOutOfRangeException e){
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
