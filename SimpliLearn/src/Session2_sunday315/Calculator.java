package Session2_sunday315;

public class Calculator {
	
	int x = 4;
	int y = 6;
	
	public Calculator(String n){
		System.out.println("n  = " + n);
	}
	
	public Calculator(int a, int b) {
		x = a;
		y = b;
		
	}
	
	public int add() {
		return x+y;
	}
}
