package chapter1;

public class B2 {
	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}
		
		int max=0;
		int min=0;
		for (int i = 0; i < num.length; i++) {
			max=num[i];
			min=num[i];
			for (int j = 0; j < num.length; j++) {
				if(max<num[j]) {
					max=num[j];
				}
				if(min>num[j]) {
					min=num[j];
				}
			}
		}
		System.out.println("Max number is "+max);
		System.out.println("Min number is "+min);
	}

}
