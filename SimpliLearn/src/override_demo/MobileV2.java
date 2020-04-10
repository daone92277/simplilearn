package override_demo;

public class MobileV2 extends MobileV1 {
	
	
	
	
	public MobileV2() {
		
	}
	
	public void videoCalling() {
		System.out.println("Video Calling from V2");
	}
	
	public void socialApps() {
		System.out.println("Socail networking from V2");
	}
	
	public void Gaming() {
		System.out.println("Gaming from v2");
	}
	
	public void displayMenu() {
		super.displayMenu();
		System.out.println("menu in v2 is upgraded to GRID view");
	}
}
