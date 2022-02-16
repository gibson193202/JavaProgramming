package chapter2;

import java.util.Scanner;

public class A3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=sc.nextInt();
		String[] s=new String[count];
		
		int middle=0;
		for(int i=0; i<count; i++) {
			s[i]=sc.next();
			middle+=s[i].length();
		}
		middle=middle/s.length;
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<middle) {
				System.out.printf("Slovo %s menshe sredney dlini, ravnaya %d", s[i], s[i].length());
			}
			if(s[i].length()>middle) {
				System.out.printf("Slovo %s bolshe sredney dlini, ravnaya %d\n", s[i], s[i].length());
			}
		}
		
		
		
	}
}
