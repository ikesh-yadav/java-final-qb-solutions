package q2_a;

public class Faculty {
	int Staff_ID;
	String Staff_Name;
	String Designation;
	String Subjecthandled;

	public Faculty(int staff_ID, String staff_Name, String designation, String subjecthandled) {
		super();
		Staff_ID = staff_ID;
		Staff_Name = staff_Name;
		Designation = designation;
		Subjecthandled = subjecthandled;
	}




	public void display() {
		System.out.println("Staff ID:"+Staff_ID+" Staff NAME:"+Staff_Name+" Designation:"+Designation+" Subject Handled:"+Subjecthandled);
	}
}
