package chapter8.A3;

import chapter8.A3.Drive.Model;

public class Computer implements PartInformation{
	private static int i=1;
	private int id=i++;
	private HardDisk hd;
	private Drive drive;
	private Ram ram;
	private Boolean turnBoolean;
	
	public Computer(HardDisk hd, Drive drive, Ram ram) {
		super();
		this.hd = hd;
		this.drive = drive;
		this.ram = ram;
	}

	public void turnOn() {
		turnBoolean=true;
	}
	
	public void turnOff() {
		turnBoolean=false;
	}
	
	public void getTurn(){
		try {
			if(!turnBoolean) throw new Exception();
			System.out.println("Computer #"+id+" is turned: "+turnBoolean);
		} catch (Exception e) {
			System.err.print("Компьютер еще не запущен");
		}
		
		
	}
	
	public int getMemoryHd() {
		try {
			int i=hd.getMemory()/0;
		} catch (Exception e) {
			System.err.print("Неверно вычислена память hd"+e);
		}
		return i;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Сборка №"+id+"\n"+hd+"\n"+drive+"\n"+ram+"\n";
	}

	@Override
	public void checkForViruses(){		
		try {
			if(!turnBoolean) {
				throw new Exception();
			}
			hd.checkForViruses();
			drive.checkForViruses();
		} catch (Exception e) {
			System.err.print("Проверка не возможна, компьютер не включен");
		}
	}

	public static void main(String[] args){
		HardDisk hd=HardDisk.getHardDisk(123);
		Drive drive=new Drive("BLURAY");
		Ram ram=new Ram("ASER", 123);
		
		Computer c=new Computer(hd,drive,ram);
		System.out.println(c);
		c.turnOff();
		c.checkForViruses();

		//Computer c2=new Computer(hd, new Drive("msi"), new Ram("msi", 1024));
		//System.out.println(c2);
		
		
		
		
		
		
		
		

	}

	

}
