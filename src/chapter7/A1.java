package chapter7;

public class A1 {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("живу ккааа как богатый человек но без рубля в кармане");
		String[] arrayText=sb.toString().split(" ");
		
		for (int i = 0; i < arrayText.length; i++) {
			int res=0;
			char[] ch=arrayText[i].toCharArray();
				for (int j = 0; j < ch.length; j++) {
					if(ch[j]=='к') {
						res++;
					}
					
				}
			if((arrayText[i].length()/2)>=res) {
				arrayText[i]=arrayText[i].replace('к', 'j');
			}
		}
		
		//sb=new StringBuffer();
		sb.setLength(0);
		for(String s:arrayText) {
			sb.append(s+" ");
		}
		System.out.println(sb);
	}

}
