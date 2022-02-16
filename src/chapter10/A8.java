package chapter10;

import java.util.Arrays;
import java.util.HashSet;

public class A8 {
	public static void main(String[] args) {
		
		
		HashSet<Integer> hs=new HashSet(Arrays.asList(1,2));
		HashSet hs2=new HashSet(Arrays.asList(7,9,10,11));
		//HashSet<Integer> result=new HashSet();
		
		Sets s=new Sets(hs2);
		System.out.println(s.intersection(Arrays.asList(1,5,8,10,7,9)));
		System.out.println(s.association(hs));
		
		/*for(Integer i: hs) {
			if(hs2.contains(i)) {
				result.add(i);
			}
			hs2.add(i);
		}
		System.out.println("Множество пересекающихся значений "+result);
		System.out.println("Множество объединенных значений"+hs2);*/
	}

}
