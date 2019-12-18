package q7_a;

import java.util.Scanner;

class Record {
	String names[];
	int rank[];
	Scanner in=new Scanner(System.in);
	Record(){
		System.out.print("Enter number of students:");
		int n=in.nextInt();
		names= new String[n];
		rank= new int[n];
		readValues();
	}
	void readValues() {
		for(int i=0;i<names.length;i++) {
			System.out.print("Enter name and rank:");
			names[i]=in.next();
			rank[i]=in.nextInt();
		}
	}
	void display(int i) {
			System.out.print("Name:"+names[i]+" Rank:"+rank[i]);
	}
}
class Rank extends Record{
	int index;
	Rank(){
		super();
		index=0;
	}
	void highest() {
		for(int i=1;i<names.length;i++) {
			if(rank[i]>rank[index]) {
				index=i;
			}
		}
	}
	void display() {
		for(int i=0;i<names.length;i++) {
			super.display(i);
			if(i==index) System.out.println("Topmost rank");
			else System.out.println();
			
		}
	}
}

public class Q7_a{
	public static void main(String args[]) {
		Rank r=new Rank();
		r.highest();
		r.display();
	}
}
