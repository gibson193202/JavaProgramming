package chapter10;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A14 {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		File file=new File("src"+File.separator+"chapter9"+File.separator+"poem.txt");
		
		try {
			BufferedReader bis=new BufferedReader(new FileReader(file));
			String line;
			while((line=bis.readLine())!=null) {
				list.add(line);
			}
			list.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					if(o1.length()>o2.length()) {
						return 1;
					}
					return -1;
				}
				
			});
			
			
			for(String s:list) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
