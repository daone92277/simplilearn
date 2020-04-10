package composition_demo;

public class Organization {
	private int orgId;
	private String name;
	private int numOfEmp;
	private String location;
	
	
	public Organization(int orgId, String name, int numOfEmp, String location) {
		super();
		this.orgId = orgId;
		this.name = name;
		this.numOfEmp = numOfEmp;
		this.location = location;
	}


	public int getOrgId() {
		return orgId;
	}


	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumOfEmp() {
		return numOfEmp;
	}


	public void setNumOfEmp(int numOfEmp) {
		this.numOfEmp = numOfEmp;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printOrgDetails() {
		System.out.println("Print organization details");
		System.out.println("Name" + name);
		System.out.println("Number of Employees is: " + numOfEmp);
		System.out.println("Emp Location is : "+location);
		
		1
	
	}
}
