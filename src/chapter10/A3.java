package chapter10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class A3 {
	public static void main(String[] args) throws IOException {
		File f=new File("src"+File.separator+"chapter9"+File.separator+"text.txt");
		Scanner sc=new Scanner(f);
		
		Stack s=new Stack();
		while(sc.hasNextLine()) {
			s.push(sc.nextLine());
		}
		
		RandomAccessFile raf=new RandomAccessFile(f,"r");
		String ss=(String)s.get(0);
		raf.seek(ss.length());
		String text;
		while((text=raf.readLine())!=null) {
			String utf8 = new String(text.getBytes("ISO-8859-1"), "UTF-8");
			System.out.println(utf8);
		}
		
		
		

	}
}
