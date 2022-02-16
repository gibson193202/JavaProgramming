package chapter10.A2;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class A2 {
	private Stack<Character> stack;
	private Scanner scan;
	private int number;
	
	public void writeNumber(){
		scan=new Scanner(System.in);
		
			try {
				number=scan.nextInt();
			} catch (Exception e) {
				System.out.println("Введите число");
			}
			
			stack=new Stack<>();
			for(char ch:Integer.toString(number).toCharArray()) {
				stack.push(ch);
			}
			scan.close();
	}
	public void readNumber() {
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		A2 a2=new A2();
		a2.writeNumber();
		a2.readNumber();
	}
}
