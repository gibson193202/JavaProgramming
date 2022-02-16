package chapter10;

import java.io.*;
import java.util.*;

public class A1 {
	private File file;
	private FileReader filereader;
	private FileWriter filewriter;
	private BufferedReader reader;
	private List list;
	
	
	public void read(File file) {
		try {
			filereader=new FileReader(file);
			reader=new BufferedReader(filereader);
			list=new ArrayList();
			
			String line;
			while((line=reader.readLine())!=null) {
				list.add(line);
				//System.out.println(line);
			}
			reader.close();
			filereader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(File file) {
		try {
		filewriter=new FileWriter(file);
		
		Collections.reverse(list);
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			filewriter.write(it.next()+"\n");
		}
		
		filewriter.close();
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		A1 a=new A1();
		File f=new File("src"+File.separator+"chapter9"+File.separator+"poem.txt");
		
		a.read(f);
		a.write(f);
		
		
	}
}
