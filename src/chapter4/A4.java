package chapter4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A4 {
	
	public static void main(String[] args) {
		Region[] regions= {
				new Region("Brest region", 21, "Brest"),
				new Region("Gomel region", 40, "Gomel"),
				new Region("Grodno region", 10, "Grodno"),
				new Region("Mogilev regoion", 10,"Mogilev"),
				new Region("Mins region", 7,"Minsk")
				
		};
		
		Region[] regions2= {
				new Region("Brest region", 21, "Brest"),
				new Region("Gomel region", 40, "Gomel"),
				new Region("Grodno region", 10, "Grodno"),
				new Region("Mogilev regoion", 10,"Mogilev"),
				new Region("Mins region", 7,"Minsk")
		};
		
		Country c=new Country("Belarus","Minsk", regions);
		Country c2=new Country("Belarus", "Minsk", regions2);
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c.equals(c2));
		
		HashMap ts=new HashMap();
		ts.put(c.hashCode(), c.getName());
		ts.put(c2.hashCode(), c.getName());
		System.out.println(ts);
		
		
		
		

	}
}
