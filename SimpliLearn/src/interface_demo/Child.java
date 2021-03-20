package interface_demo;

public interface Child extends Parent {
	public void child();
	public void parent();
	
	
	@Override
	default void Parent1() {
		System.out.println("this is the parent method override from child ");
		
	}
	
}
