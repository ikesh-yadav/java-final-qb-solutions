package q13_a;
abstract class Reservation{
	int c1,c2,c3;
	Reservation(int n){
		c1=c2=c3=n;
	}
	boolean reserves(int seats,int typeOfSeats) {
		if(seats<=getAvailableSeats(typeOfSeats)) {
			return true;
		}else {
			return false;
		}
	}
	int getAvailableSeats(int i){
		switch(i) {
			case 1:{return c1;}
			case 2:{return c2;}
			case 3:{return c3;}
		}
		return 0;
	}
}
class ReserveTrain extends Reservation{
	ReserveTrain(int n){
		super(n);
	}
}
class ReserveBus extends Reservation{
	ReserveBus(int n){
		super(n);
	}
}
public class Q13_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReserveTrain rt=new ReserveTrain(10);
		ReserveBus rb=new ReserveBus(10);
		System.out.println(rb.getAvailableSeats(1));
		System.out.println(rt.reserves(1, 1));
		System.out.println(rb.reserves(11, 1));
	}

}
