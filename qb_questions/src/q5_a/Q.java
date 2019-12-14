package q5_a;

public class Q {
	synchronized boolean displayPrime(int i) {
		//System.out.println("CALLE prime function");
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				//System.out.println("Returning because "+i+j);
				return false;
			}
		}
		return true;
	}
}
