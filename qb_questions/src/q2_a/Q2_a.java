/*
 2.
a. Write a Java program to maintain the student details like USN, Dept_Names,
 3 Subject grades and SGPAin student package and keep the staff details such as Staff_ID,
  Staff_Name, Designation and subjectshandled in a staff package. In main class use these
   two packages details for Staff and Student classes to display the student and staff
    information as requested by the user.
 */
package q2_a;

public class Q2_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s= new Student[3];
		Faculty[] f=new Faculty[3];
		s[0]=new Student(2,"stud",'A','B','C',9.0);
		s[1]=new Student(1,"stud1",'C','B','C',9.0);
		s[2]=new Student(3,"stud2",'A','B','A',8.0);
		f[0]=new Faculty(1,"fac1","junior","maths");
		f[1]=new Faculty(2,"fac2","Asociate","Computers");
		f[2]=new Faculty(3,"fac3","HOD","Science");
		for(int i=0;i<3;i++) {
			s[i].display();
		}
		for(int i=0;i<3;i++) {
			f[i].display();
		}
	}

}
