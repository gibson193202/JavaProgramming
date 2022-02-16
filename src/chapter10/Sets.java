package chapter10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
	private Set<Integer> set,result;
	
	public Sets(Set set) {
		this.set=set;
	}
	
	
	public Sets intersection(Collection<Integer> collection) {
		result = new HashSet();
		for(Integer integer:set) {
			if(collection.contains(integer)) {
				result.add(integer);
			}
		}
		return new Sets(result);
	}
	
	public Sets association(Collection<Integer> collection) {
		for(Integer integer:set) {
			collection.add(integer);
		}
		return new Sets((Set)collection);
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return set.toString();
	}	

}
