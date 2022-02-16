package chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class A3 {
	public static void main(String[] args) throws InterruptedException {
		Integer[] arr=new Integer[100000];
		for(int i=0; i<arr.length; i++) {
			arr[i]=new Random().nextInt(100);
		}
		
		Thread bm=new BubbleMethod(arr,"tony");
		Thread sh=new Shell(arr);
		Thread h=new Hoara(arr);
		Thread bt=new BinaryTree(arr);
		
		bm.start();
		bm.join();
		
		sh.start();
		sh.join();
		h.start();
		bt.start();
		
		
		//System.out.println(Arrays.toString(arr));
		


		

	
		
		
		

		
		
	}
}
