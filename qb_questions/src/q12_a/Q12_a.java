package q12_a;
class t extends Thread{
	t(){
		start();
	}
	public void run() {
		System.out.println(getName());
		//yield();
	}
}
public class Q12_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			t t1=new t();
			t t2=new t();
			t t3=new t();
			t t4=new t();
			t t5=new t();
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			Thread main=Thread.currentThread();
			main.setName("NewNameForMain");
			System.out.println(main.getName());
			t1.sleep(1000);
			t2.sleep(1000);
			System.out.println(t1.isAlive());
			System.out.println(t2.isAlive());
			System.out.println(t3.isAlive());
			System.out.println(t4.isAlive());
			System.out.println(t5.isAlive());
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			System.out.println("main ended");
		}catch(Exception e) {e.printStackTrace();}
	}

}
