package chapter4;

public class Country {
	private String name;
	private String capital;
	private Region[] region;
	private int area;
	
	
	
	
	public Country(String name, String capital, Region[] region) {
		this.name=name;
		this.capital=capital;
		this.region = region;
		fillArea();
	}
	
	public Region[] getRegion() {
		return region;
	}
	public void setRegion(Region[] region) {
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	
	
	@Override
	public int hashCode() {
		int result=0;
		for (int i = 0; i < region.length; i++) {
			result+=region[i].hashCode();
		}
		return 31*(name.length()+capital.length()+result);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass() == obj.getClass()) {
			Country temp=(Country)obj;
			if(this.area==temp.area) {
				for (int i = 0; i < region.length; i++) {
					if(region[i].getArea()!=temp.region[i].getArea()) {
						return false;
					}else if (!region[i].getName().equals(temp.region[i].getName())) {
						return false;
					}else if (!region[i].getAdminCenter().equals(temp.region[i].getAdminCenter())) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
		
	}
	
	public void regionCounts() {
		System.out.printf("In the country %s - %d of regions\n",capital,region.length);
	}
	
	public void printAdminCenters() {
		for (int i = 0; i < region.length; i++) {
			System.out.println(region[i].getAdminCenter());
		}
	}
	
	
	
	private void fillArea() {
		for (int i = 0; i < region.length; i++) {
			area+=region[i].getArea();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
