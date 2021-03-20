package inheritance_demo2;

public class Employee extends Person {
	private String organization;
	private String designation;
	
	public Employee(int id, String name, String organization, String designation) {
		super(id, name);
		this.organization = organization;
		this.designation = designation;
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



	public void printEmployee() {
		
		System.out.println("Printing Employee Details");
		super.printPerson();
		System.out.println("Org name = " + organization);
		System.out.println("Desgination " + designation );
		
	}
	
	
}
