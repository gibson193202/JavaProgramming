package chapter3;

import java.awt.Color;
import java.util.Calendar;

public class B2 {
	private static Car[] car;
	
	public static void getModel(String s) {
		System.out.printf("\t\t\tList of model %s\n",s);
		for (int i = 0; i < car.length; i++) {
			if(car[i].getBrand().equals(s)) {
				System.out.println(car[i]);
			}
		}
	}
	
	public static void yearOperation(int year) {
		Calendar calendar=Calendar.getInstance();
		
		System.out.printf("Machines have been in operation for more than %d years\n", year);
		for (int i = 0; i < car.length; i++) {
			if(car[i].getYear()<(calendar.get(Calendar.YEAR)-year)) {
				System.out.println(car[i]);
			}
		}
	}
	
	public static void yearOperation(int year, int price) {
		Calendar calendar=Calendar.getInstance();
		
		System.out.printf("Machines have been in operation for more than %d years\n", year);
		for (int i = 0; i < car.length; i++) {
			if(car[i].getYear()<(calendar.get(Calendar.YEAR)-year) & car[i].getPrice()<price) {
				System.out.println(car[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		car= new Car[]{
				new Car("Mercedes", "s", 1990, Color.WHITE, 2000, 0),
				new Car("Mercedes", "g", 2008, Color.black, 4000, 0),
				new Car("Mercedes", "a", 1980, Color.WHITE, 1500, 0),
				new Car("Mercedes", "s", 2006, Color.YELLOW, 2700, 0),
				new Car("Citroen", "c4", 2018, Color.RED, 980, 0),
				new Car("Citroen", "c2", 2016, Color.WHITE, 770, 0)
		};
		
		//getModel("Mercedes");
		//yearOperation(5);
		
		yearOperation(5,2000);
		
		
	}
	
	
	
	
}
