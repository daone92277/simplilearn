package overload_demo;

public class Calculator {
	
	
	public void add(int a, int b) {
		System.out.println("void add, int called... result is " + a + b);
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public void add(float a, int b) {
		System.out.println("void float called.. result is " + a+b);
		
	}
}


