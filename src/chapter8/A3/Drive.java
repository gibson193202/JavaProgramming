package chapter8.A3;


public class Drive implements PartInformation{
	private String name;
	enum Model{DWD,CD_ROM,BLURAY}
	private Boolean turnBoolean;
	
	public Drive(String e){
		Model model=Model.valueOf(e.toUpperCase());
		this.name=model.name();
	}

	@Override
	public String toString() {
		return "Drive: "+name;
	}
	
	@Override
	public void checkForViruses() {
		System.out.println("Checked comleeated for "+name);
		
	}
	
	
}
