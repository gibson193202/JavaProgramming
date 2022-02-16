package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterOperation {
	public static void vowelLAtter(StringBuffer sb) {
		Pattern p=Pattern.compile("\\b[йуеыаоэию]\\S+\\b");
		Matcher m=p.matcher(sb);
		
		System.out.println("Найденное совпадение в буфере");
		while(m.find()) {
			System.out.print(m.group()+"\n");
		}
	}

}
