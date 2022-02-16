package chapter9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RWfile {
	public static StringBuffer readFile(String path) {
		
		try {
			FileReader fr=new FileReader(new File(path));
			StringBuffer sb=new StringBuffer();
			
			int i;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			
			return sb;
		} catch (IOException e) {
			// TODO: handle exception
		}
			return null;
		
		
	}
}
