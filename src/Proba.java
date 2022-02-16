import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sun.org.apache.xalan.internal.xsltc.dom.ExtendedSAX;

class A implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("A thread");
	}
}

class B implements Runnable{
	List list=new ArrayList<Integer>();
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add(new Random().nextInt(100));
		}
		System.out.println("B thread");
	}
}

class C implements Callable<Long>{
	
	@Override
	public Long call(){
		// TODO Auto-generated method stub
		return new Random().nextLong();
	}
}

public class Proba{
	
	public static void main(String[] args) {
		long[] l= {5L, 3L, 3L, 1L,3L,2L,1L,3L};
		
		HashMap<Long, Long> hm=new HashMap<>();
		LinkedHashMap<Long,Long> lhm=new LinkedHashMap<>();
		ArrayList<Long> al=new ArrayList();
		
		for (int i = 0; i < l.length; i++) {
			if(hm.containsKey(l[i])) {
				hm.put(l[i], hm.get(l[i])+1);
			}else {
				hm.put(l[i], 1L);//1-1, 2-1,
			}
		}
		
		for(Map.Entry m:hm.entrySet()) {
			al.add((Long) m.getValue());
		}
		
		Collections.sort(al);
		for(long num:al) {
			for(Entry e:hm.entrySet()) {
				if(e.getValue().equals(num)) {
					lhm.put((Long) e.getKey(), num);
				}
			}
		}
		
		//hm=lhm;
	
		List<Future<Long>> list=new ArrayList<Future<Long>>();
		ExecutorService exec=Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 50; i++) {
			list.add(exec.submit(new C()));
		}
		
		for (Future<Long> lon : list) {
			try {
				System.out.println(lon.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		exec.shutdown();
		
		
		
		
		
	}

	


	
	
}
