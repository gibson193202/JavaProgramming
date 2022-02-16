package chapter3;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;


public class B1 {
	private static int i=0;
	private int id=i++;
	
	private String name;
	private String surname;
	private Calendar age;
	private String address;
	private int phone;
	private String faculty;
	private int course;
	private int group;
	
	
	
	public B1(String name, int age, String faculty, int course, int group) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, age);
		this.name = name;
		this.age = calendar;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Calendar getAge() {
		return age;
	}
	public void setAge(Calendar age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String strFormat=String.format("ID %d\nName %s\nAge %s\nFaculty %s\nGroup %d\nCourse %d\n",id,name,String.valueOf(age.get(Calendar.YEAR)),faculty,group,course);
		return strFormat;
	}
	
	static void getListFaculty(B1[] students, String faculty) {
		for (int i = 0; i < students.length; i++) {
			if(students[i].getFaculty().equals(faculty)) {
				System.out.println(students[i]);
			}
		}
	}
	
	static void getFacultyCourceGroup(B1[] students, String faculty, int course, int group) {
		for (int i = 0; i < students.length; i++) {
			if(students[i].getFaculty().equals(faculty) & students[i].getCourse()==course & students[i].getGroup()==group) {
				System.out.println(students[i]);
			}
		}
	}
	
	static void getAge(B1[] students, int age) {
		for (int i = 0; i < students.length; i++) {
			//System.out.println(students[i].age.get(Calendar.YEAR));
			if(students[i].age.get(Calendar.YEAR)>age) {
				System.out.println(students[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		B1[] students= {
				new B1("Anna", 1990, "GEO", 1, 1),
				new B1("Anton", 1985, "BBC", 1, 1),
				new B1("Vasiliy", 1998, "BBC", 1, 1),
				new B1("Vlad", 1990, "GEO", 2, 1),
				new B1("Vasilisa", 1986, "GEO", 1, 1),
				new B1("Yakov", 2001, "BBC", 1, 1),
				
		};
		
		System.out.println("Facultu BBC: \n");
		getListFaculty(students, "BBC");
		
		System.out.println("Age > 1990: \n");
		getAge(students, 1990);
		
		
	}
	
}
