package chapter10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Scanner;

public class A16 {
	public static void readFile(HashSet set) {
		File file=new File("src"+File.separator+"chapter10"+File.separator+"song.txt");
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNext()) {
				set.add(sc.next().replaceAll("[^a-zA-Z]", "").toLowerCase());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		readFile(hs);
		System.out.println(hs);
	}
	
	
}
