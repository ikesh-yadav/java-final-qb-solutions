/*
1.a. Write a Java program to implement the Stack operations. Create an interface called as
 DataStructure. Write a Stack class which will implement the DataStructure interface.
 */
package q1_a;
public class Q1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack(10);
		System.out.println(s.isEmpty());
		for(int i=1;i<=10;i++) s.push(i);
		System.out.println(s.isFull());
		System.out.println(s.pop());
		System.out.println(s.isFull());
	}

}
