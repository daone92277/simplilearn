package encapsulation_demo;

public class Main {

	public static void main(String[] args) {
		Player p = new Player(111, "David");
		
		p.printPlayer();
		
		Player p1 = new Player(109, "Greene");
//		p1.id = 199;
//		p1.name = "Greene";
		
		p1.printPlayer();
		
		p1.setName("David Darryl Greene");
		
		p1.printPlayer();
		
		System.out.println(p1.getName());
		
		
		p.setName("this is pretty cool ");
		p.printPlayer();

	}

}
