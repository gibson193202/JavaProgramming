package chapter8.A3;

public final class HardDisk implements PartInformation{
	private final String ID="#1 HARD DISK";
	private int memory;
	private static HardDisk disk=null;
	private Boolean turnBoolean;
	
	private HardDisk(int memory) {
		this.memory=memory;
	}
	
	public static HardDisk getHardDisk(int size){
		if(disk==null) {
			disk=new HardDisk(size);
		}else {
			throw new NullPointerException("hd уже создан");
		}
		return disk;
	}
	
	public int getMemory() throws ArithmeticException{
		return memory;
	}
	
	@Override
	public String toString() {
		return ID+", size: "+memory;
	}
	
	@Override
	public void checkForViruses() {
		System.out.println("Checked comleated for "+ID);		
	}
}
