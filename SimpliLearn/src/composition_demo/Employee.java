package composition_demo;

public class Employee extends Person {
	private String organization;
	private String designation;
	private Organization org1;
	
	
	
	
	
	public Employee(int id, String name, String organization, String designation, Organization org1) {
		super(id, name);
		this.organization = organization;
		this.designation = designation;
		this.org1 = org1;
	}



	public String getOrganization() {
		return organization;
	}



	public void setOrganization(String organization) {
		this.organization = organization;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public Organization getOrg1() {
		return org1;
	}



	public void setOrg1(Organization org1) {
		this.org1 = org1;
	}
	
public void printEmployee() {
		
		System.out.println("Printing Employee Details");
		super.printPerson();
		System.out.println("Org name = " + organization);
		System.out.println("Desgination " + designation );
		
	}
	
}
