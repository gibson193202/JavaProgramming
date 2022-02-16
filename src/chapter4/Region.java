package chapter4;

public class Region {
	private String name;
	private int area;
	private String adminCenter;
	
	
	public Region(String name, int area, String adminCenter) {
		super();
		this.name = name;
		this.area = area;
		this.adminCenter = adminCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getAdminCenter() {
		return adminCenter;
	}

	public void setAdminCenter(String adminCenter) {
		this.adminCenter = adminCenter;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31*(name.length()+area+adminCenter.length());
	}
	
	

	
	
	

}
