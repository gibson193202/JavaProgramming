package chapter1;

public class B6 {
	public static void main(String[] args) {
		int[] num=new int[args.length];
		for(int i=0; i<args.length; i++) {
			num[i]=Integer.valueOf(args[i]);
		}		

		for (int i = 0; i < num.length; i++) {
			if(99<num[i] & num[i]<1000) { 
			
				int tmp=num[i]/100;
				int tmp1=(num[i]-(tmp*100))/10;
				int tmp2=(num[i]-(tmp*100)-(tmp1*10));
				
				if(tmp!=tmp1 && tmp!=tmp2 && tmp1!=tmp2) {
					System.out.printf("chislo %d ne imeet odinakovih cifr\n",num[i]);
				}
			}
		}
	}
}
