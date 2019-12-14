package q5_a;
public class Q5_a {
	public static void main(String[] args) {
		try {
			Q q=new Q();
			T1 t1=new T1(q);
			T2 t2=new T2(q);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		}catch(Exception e) {e.printStackTrace();}
	}
}
