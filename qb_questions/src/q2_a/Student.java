package q2_a;

public class Student {
	int USN;
	String Dept_Names;
	char grade[]=new char[3];
	Double SGPA;
	
	public Student(int uSN, String dept_Names, char grade1,char grade2,char grade3, Double sGPA) {
		USN = uSN;
		Dept_Names = dept_Names;
		this.grade[0] = grade1;
		this.grade[1] = grade2;
		this.grade[2] = grade3;
		SGPA = sGPA;
	}
	public void display() {
		System.out.println("USN:"+USN+" DEPT NAME:"+Dept_Names+" Grade1:"+grade[0]+" Grade2:"+grade[1]+" Grade3:"+grade[2]+" SGPA:"+SGPA);
	}
}
