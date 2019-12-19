package q10_a.AdvMath;

public class PyTriplets {
	public PyTriplets(int n){
		int i=0;
		System.out.println("Pythagorean triplets:");
		for(int j=1;j<100;j++) {
			for(int k=j;k<100;k++) {
				for(int l=k;l<100;l++) {
					if ((l*l)==((k*k)+(j*j))) {
						System.out.println("("+j+","+k+","+l+")");
						i++;
						if(i>n) { return;}
					}
				}
			}
		}
	}
}
