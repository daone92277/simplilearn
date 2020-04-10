package object_override_demo;

public class Main {

	public static void main(String[] args) {
		Player p = new Player(100, "David");
		
		p.setName("Greene");
		
		System.out.println(p);
		
		//System.out.println(p.toString());
		Player p1 = new Player(100, "David");
		System.out.println(p1);
		
		if(p1.equals(p)) {
			System.out.println("Both are same");
		}else {
			System.out.println("they are different");
		}
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}

}
