package chapter14;

import java.util.Calendar;
import java.util.Random;

public class Shell extends Thread{
	
	private Integer[] array;
	
	public Shell(Integer[] array) {
		this.array=array;
	}
	
	

	
	public Integer[] getArray() {
		return array;
	}




	public void sort() {
		/*int j;
		for(int gap=array.length/2; gap>0; gap/=2) {
			for(int i=gap; i<array.length; i++) {
				Integer tmp=array[i];
				for(j=i; j>=gap && tmp.compareTo(array[j-gap])<0; j-=gap) {
					array[j]=array[j-gap];
				}
				array[j]=tmp;
			}
		}*/
		
		for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        array[j+1] = current;
		}
	}

	@Override
	public void run() {
		Calendar cal=Calendar.getInstance();
		sort();
		Calendar cal2=Calendar.getInstance();
		System.out.println("Сортировка методом Shell завершилась за: "+(cal2.getTimeInMillis()-cal.getTimeInMillis())+" мс");

	}
	
	
	
}
