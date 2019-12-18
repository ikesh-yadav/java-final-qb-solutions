package q8_a;
class common{
	int meal_ready=0;
	synchronized void produce() {
		try {
			while(meal_ready==1) {
					wait();
			}
			System.out.println("produced");
			meal_ready=1;
			Thread.sleep(1000);
			notify();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	synchronized void consume() {
		try {
			while(meal_ready==0) {
					wait();	
			}
			System.out.println("consumed");
			meal_ready=0;
			notify();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
class chef extends Thread{
	common c;
	chef(common co){
		c=co;
	}
	
	public void run() {
		try {
			while(true) {
				c.produce();
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
class waiter extends Thread{
	common c;
	waiter(common co){
		c=co;
	}
	
	public void run() {
		try {
			while(true) {
				c.consume();
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
public class Q8_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		common c=new common();
		chef ch=new chef(c);
		waiter w=new waiter(c);
		ch.start();
		w.start();
	}

}
