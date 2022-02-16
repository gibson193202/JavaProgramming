package chapter10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class A4 {
	static List<File> list;
	
	public static void main(String[] args) {
		
		list=new ArrayList();
		File file=new File("src");
		
		getFile(file);
		
		for(File fl:list) {
			System.out.println(fl);
		}
		
	}
	
	public static void getFile(File f) {
		if(f.isFile()) {
			list.add(f);
		}
		if(f.isDirectory()) {
			for(File a:f.listFiles()) {
				getFile(a);
			}
		}
	}
	
	
	
	
	
}
