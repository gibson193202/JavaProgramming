package chapter1;

public class B5 {

	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}

	}

}
