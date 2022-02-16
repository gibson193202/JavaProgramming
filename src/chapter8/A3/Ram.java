package chapter8.A3;

public class Ram{
	private static int i=0;
	private int id=i++;
	private String nameModel;
	private int memory;
	
	public Ram(String nameModel, int memory) {
		this.nameModel = nameModel;
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "Ram #"+id+": "+nameModel+", size: "+memory;
	}
	
	
	

}
