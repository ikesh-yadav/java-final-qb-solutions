package q5_a;

public class T1 extends Thread{
	Q q;
	T1(Q q){
		this.q=q;
	}
	public void run() {
		try {
			for(int i=1;i<=100;i++) {
				if(q.displayPrime(i)) {
					System.out.println("thread1:"+i);
					sleep(500);	
				}
			}
		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
}
