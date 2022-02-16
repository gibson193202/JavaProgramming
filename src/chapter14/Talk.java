package chapter14;

import java.util.Calendar;
import java.util.Date;

public class Talk extends Thread{

	@Override
	public void run() {
		try {
			System.out.println(new Date());
			sleep(9000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		Talk t=new Talk();
		Talk tt=new Talk();
		t.setPriority(MAX_PRIORITY);
		tt.setPriority(MIN_PRIORITY);
		t.start();
		tt.start();
		
	}
}
