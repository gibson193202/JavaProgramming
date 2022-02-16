package chapter2;

import java.io.IOException;
import java.util.Scanner;

public class A1 {

	
	public static void main(String[] args) throws IOException {
		int n=0;
		System.out.println("Skolko slov");
		Scanner sc=new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			n=sc.nextInt();
		}else {
			System.out.println("Vvedeno ne chislo");
			return;
			
		}
		
		String[] words=new String[n];
		
		for(int i=0; i<n; i++) {
			words[i]=sc.next();
		}
		
		String max="";
		String min="";
		for (int i = 0; i < words.length; i++) {
			max=words[i];
			min=words[i];
			
			for (int j = 0; j < words.length; j++) {
				if(max.length()<words[j].length()) {
					max=words[j];
				}
				if(min.length()>words[j].length()) {
					min=words[j];
				}
			}
		}

		
		
		
		
		

	}

}
