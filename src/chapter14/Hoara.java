package chapter14;

public class Hoara extends Thread{
	private Integer[] array;
	
	public Hoara(Integer[] array) {
		this.array=array;
	}
	
	public Integer[] getArray() {
		return array;
	}
	
	public void sort() {
		
		
		int i=0;
		int lastIndex=array.length-1;
		
		quickSort(array, i, lastIndex);
		/*while(i<array.length) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[lastIndex]) {
					int tmp=array[j];
					array[j]=array[lastIndex];
					array[lastIndex]=tmp;
				}
			}
			lastIndex--;
			i++;
		}*/
	}
	
	 public static void quickSort(Integer[] array, int low, int high) {
         if (array.length == 0)
             return; //завершить выполнение, если длина массива равна 0
         if (low >= high)
             return;//завершить выполнение если уже нечего делить
         // выбрать опорный элемент
         int middle = low + (high - low) / 2;
         int opora = array[middle];
 
         // разделить на подмассивы, который больше и меньше опорного элемента
         int i = low, j = high;
         while (i <= j) {
             while (array[i] < opora) {
                 i++;
             }
 
             while (array[j] > opora) {
                 j--;
             }
 
             if (i <= j) {//меняем местами
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
                 i++;
                 j--;
             }
         }
 
         // вызов рекурсии для сортировки левой и правой части
         if (low < j)
             quickSort(array, low, j);
 
         if (high > i)
             quickSort(array, i, high);
     }
	
	public void currentTimeMillis() {
		long start=System.currentTimeMillis();
		sort();
		System.out.println("Сортировка методом Хоара завершилась за: "+(System.currentTimeMillis()-start)+" мс");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		currentTimeMillis();
	}
	
	

	

}
