package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CRUDoperation {
	public static void delete(String str, StringBuffer sb) {
		
		int matchesScore = sb.indexOf(str);
		int matchLength = str.length();
		while (matchesScore >= 0) {
			int position=matchesScore;
		    sb.delete(position, position+matchLength);
		    matchesScore = sb.indexOf(str, matchesScore + matchLength);
		}
	}
	
	public static void update(String str, String update, StringBuffer sb) {
		
		int matchesScore = sb.indexOf(str);
		int matchLength = str.length();
		while (matchesScore >= 0) {
			int position=matchesScore;
		    sb.replace(position, position+matchLength, update);
		    matchesScore = sb.indexOf(str, matchesScore + matchLength);
		}
	}
}
