package q1_a;

public class Stack implements DataStructure {
	int array[];
	int stackTop=-1;
	Stack(int n){
		array=new int[n];
	}
	@Override
	public void push(int a) {
		// TODO Auto-generated method stub
		if(isFull()) System.out.println("STACK FULL");
		else array[++stackTop]=a;
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {System.out.print("STACK EMPTY"); return -1;}
		return array[stackTop--];
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(stackTop==-1) return true;
		return false;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(stackTop==array.length-1) return true;
		return false;
	}
	
}
