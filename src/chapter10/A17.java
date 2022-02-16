package chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A17 {
	
	public static void readFile(File file, List strings) {
				try {
					Scanner sc=new Scanner(file);
					while(sc.hasNext()) {
						strings.add(sc.next().replaceAll("[^a-zA-Z]", ""));
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	public static void fillMap(List<String> list, HashMap<String,Integer> hm) {
		for (int i = 0; i < list.size(); i++) {
			if(hm.containsKey(list.get(i))) {
				hm.put(list.get(i), hm.get(list.get(i))+1);
			}else {
				hm.put(list.get(i), 1);
			}
		}
	}
	
	public static void main(String[] args) {
		File file=new File("src"+File.separator+"chapter10"+File.separator+"song.txt");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		List<String> list=new ArrayList<String>();
		
		readFile(file,list);
		fillMap(list, hm);
		
		
		System.out.println(hm);
		

		
		
	}
	
	
}
