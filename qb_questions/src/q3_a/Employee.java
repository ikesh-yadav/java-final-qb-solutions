package q3_a;

public class Employee {
	String Name;
	int age;
	public Employee(String n,int a) throws NameNotCorrectException, AgeLimitException {
		try{
			Integer.parseInt(n);
			throw new NameNotCorrectException();
		}catch(NumberFormatException e) {
			Name=n;
		}
		if(a>50) throw new AgeLimitException();
		age=a;
	}
	public void print() {
		System.out.println("DETAILS NAME:"+Name+" AGE:"+age);
	}
}
