package chapter1;

public class B4 {

	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%5==0 & num[i]%7==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 5 i na 7");
				continue;
			}
			if(num[i]%5==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 5");
			}
			if(num[i]%7==0) {
				System.out.println("Chislo "+num[i]+" delitsia na 7");
			}
		}

	}

}
