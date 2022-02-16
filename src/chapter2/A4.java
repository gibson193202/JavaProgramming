package chapter2;

public class A4 {
	public static void main(String[] args) {
		String[] s= {"еткктеетк", "два", "три", "один", "стовосемьдесятсемь", "четыреее"};
		
		
		for (int a = 0; a < s.length; a++) {
			char[] word=s[a].toCharArray();
			
			int intRes=word.length;
			
			for (int i = 0; i < word.length; i++) {
				for (int j = i+1; j < word.length; j++) {
					if(word[i]==word[j]) {
						intRes--;
						break;
					}
					
				}
			}
			
			System.out.printf("В слове %s, длиной %d, количество разных букв равно %d \n",s[a],s[a].length(),intRes);
		}
	}
}
