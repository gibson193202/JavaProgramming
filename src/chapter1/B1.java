package chapter1;

public class B1 {
	
	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}
		
		for(int i=1; i<num.length; i++) {
			if(num[i]==0) continue;
			if(num[i]%2==0) {
				System.out.println("Chislo "+num[i]+" chetnoe");
			}
			
		}
		for(int i=0; i<num.length; i++) {
			if(num[i]==0) continue;
			if(num[i]%3==0 || num[i]%1==1) {
				System.out.println("Chislo "+num[i]+" nechetnoe");
			}
			
		}
	}

}
