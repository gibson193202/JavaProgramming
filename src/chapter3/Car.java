package chapter3;

import java.awt.Color;
import java.util.Calendar;

public class Car {
	private static int i=0;
	
	private int id=i++;
	private String brand;
	private String model;
	private Calendar year;
	private Color color;
	private int price;
	private int regNumber;
	
	public Car(String brand, String model, int year, Color color, int price, int regNumber) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, 1, 1);
		this.brand = brand;
		this.model = model;
		this.year = calendar;
		this.color = color;
		this.price = price;
		this.regNumber = regNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Brand %s\nModel %s\nYear %s\nPrice %d\n", brand,model,getYear(),price);
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year.get(Calendar.YEAR);
	}

	public void setYear(int yaer) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(yaer, 1, 1);
		this.year=calendar;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	
	
	
	
	
	
	
}
