package composition_demo;

public class Main {

	public static void main(String[] args) {
		Team team = new Team(1000, "Yankees", "Bill Bellechek");
		
		Organization org = new Organization(1, "broadridge", 10_000, "New York");
		
		Employee emp1 = new Employee(1, "David", "test", "test", org);
		
		Player player1 = new Player(1, "Derek", 77, team);
//		player1.printPlayer();
//		
//		emp1.printEmployee();
		
		printAnyObject(team);
		printAnyObject(org);
		printAnyObject(emp1);
		printAnyObject(player1);
	}
	
	public static void printAnyObject(Object o) {
		if(o instanceof Player) {
			Player player1()
		}
	}
}





