package chapter2;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] words=new String[n];
		
		for(int i=0; i<n; i++) {
			words[i]=sc.next();
		}
		
		for (int i = 0;  i < n; i++) {///rfr //zovut
			for (int j = 0; j < n; j++) {
				if(words[i].length()<words[j].length()) {
					String tmp=words[i];
					words[i]=words[j];
					words[j]=tmp;
				}
			}
		
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]+" "+words[i].length());
		}
		
		
	}

}
