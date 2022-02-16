package chapter1;

public class B3 {
	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%3==0 & num[i]%9==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 3 i na 9");
				continue;
			}
			if(num[i]%3==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 3");
			}
			if(num[i]%9==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 9");
			}
		}
		
	}
}
