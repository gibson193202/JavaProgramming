package chapter14;

public class BubbleMethod extends Thread{
	private Integer[] array;
	
	public BubbleMethod(Integer[] array, String str) {
		super(str);
		this.array=array;
	}
	
	public Integer[] getArray() {
		return array;
	}
	
	public void sort() {
		for(int i=0; i<array.length; i++) {
			int min=array[i];
			
			for(int j=0; j<array.length; j++) {
				if(min<array[j]) {
					int tmp=array[i];
					array[i]=array[j];
					array[j]=tmp;
					
				}
			}
		}
	}
	
	public void currentTimeMillis() {
		long start=System.currentTimeMillis();
		sort();
		System.out.println("Сортировка методом BubbleMethod завершилась за: "+(System.currentTimeMillis()-start)+" мс");
	}
	
	@Override
	public void run() {
		
		currentTimeMillis();
	}
}
