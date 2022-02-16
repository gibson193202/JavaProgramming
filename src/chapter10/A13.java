package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class A13 {
	public static void main(String[] args) {
		Byte[] b= {-1,2,5,3,-1,9,8,-2,2,28,36};
		LinkedList<Byte> ls=new LinkedList<Byte>(Arrays.asList(b));
		
		for (int i = 0; i < b.length; i++) {
			if(ls.get(i)<0) {
				ls.addLast(ls.get(i));
				ls.remove(i);
							
			}
		}
		
		System.out.println(ls);
	}
}
