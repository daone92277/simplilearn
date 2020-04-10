package inheritance_demo2;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(100, "David");
		
		p1.printPerson();
		
		System.out.println(p1.getName());
		p1.setName("Toneya");
		
		p1.printPerson();
		System.out.println("+++++++++++++++++++++++++++++++");
		Player player1 = new Player(100,"David", "Yankees", 10_000);
		
		player1.printPlayer();
		
		System.out.println();
		
		Employee e1 = new Employee(100, "David", "Broadridge", "Designation");
		
		e1.printEmployee();
	}

}
