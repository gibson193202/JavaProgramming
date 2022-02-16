package chapter7;

import java.util.Iterator;

public class A2 {
	public static int getInt(char a) {
		String str="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
		return str.indexOf(a)+1;

		
	}
	
	public static void main(String[] args) {
		String buf="Мама мыла раму";
		char[] word=buf.toLowerCase().toCharArray();
		int[] wordPosition=new int[word.length];
		
		for (int i = 0; i < word.length; i++) {			
			wordPosition[i]=getInt(word[i]);	
		}	
		
		for(char ch:word) {
			if(ch==' ') {
				continue;
			}
			System.out.printf("  %s",ch);
		}
		System.out.println();
		for (int i : wordPosition) {
			if(i>10) {
				System.out.printf(" %d",i);
			}else if(i==0){
				continue;
			}else {
				System.out.printf("  %d",i);
			}
			
		}

	}
	
	

}
