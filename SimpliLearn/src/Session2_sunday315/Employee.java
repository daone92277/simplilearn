package Session2_sunday315;

public class Employee {
	
	int id;
	String name;
	int age;
	long contact;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Employee(int id, String name, int age, long contact) {
		this(id, name); //constructor chaining must be on first line only 
		this.name = name;
		this.age = age;
		this.contact = contact;
	}



	public void printEmployee() {
		System.out.println("Employee name is:" + name);
		System.out.println("Employee id is: " + id);
		
	}

	
	
	
}		
