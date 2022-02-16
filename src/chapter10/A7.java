package chapter10;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class A7{

	
	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList(Arrays.asList(1,2,3));
		LinkedList<Integer> list2=new LinkedList(Arrays.asList(4,5,6));
		
		for(int i=0; i<(list1.size()); i++) {
			list2.addLast(list1.pop());
			list1.addLast(list2.pop());
		}

		

		

		
		System.out.println(list1);
		System.out.println(list2);
		
		
		
		
		
	}


}
