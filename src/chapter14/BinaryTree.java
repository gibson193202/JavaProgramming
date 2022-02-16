package chapter14;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class BinaryTree extends Thread{

	private Integer[] array;
	
	public BinaryTree(Integer[] array) {
		this.array=array;
	}
	
	public void sort() {
		int n=array.length;
		
		for(int i=n/2-1;i>=0; i--) {
			heapify(array, n, i);
		}
		for(int i=n-1; i>=0; i--) {
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			
			heapify(array,i,0);
		}
	}
	
	public void heapify(Integer[] array, int n, int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]>array[largest]) {
			largest=left;
		}
		
		if(right<n && array[right]>array[largest]) {
			largest=right;
		}
		
		if(largest!=i) {
			int swap=array[i];
			array[i]=array[largest];
			array[largest]=swap;
			
			heapify(array,n,largest);
		}
	}
	
	public void currentTimeMillis() {
		long start=System.currentTimeMillis();
		sort();
		System.out.println("Сортировка методом BinaryTree завершилась за: "+(System.currentTimeMillis()-start)+" мс");
	}
	
	@Override
	public void run() {
		currentTimeMillis();
	}
	
	

}
