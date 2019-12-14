package q5_a;

public class T2 extends Thread{
	Q q;
	T2(Q q){
		this.q=q;
	}
	public void run() {
		try {
			for(int i=101;i<=200;i++) {
				if(q.displayPrime(i)) {
					System.out.println("thread2:"+i);
					sleep(500);
				}
			} 
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
