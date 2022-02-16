package chapter10.A2;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> ll=new LinkedList<>();
	
	public void push(T arg) {
		ll.addFirst(arg); 
	}
	
	public T pop() {
		return ll.removeFirst();
	}
	
	public T peek() {
		return ll.getFirst();
	}
	
	public boolean empty() {
		return ll.isEmpty();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ll.toString();
	}
	
	
}
