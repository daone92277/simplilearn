package abstraction_demo;

public class MedicalProducts extends pms {

	@Override
	public void createProduct() {
		System.out.println("Creating Medical Product in MySql Db");
		
	}

	@Override
	public void updateProduct() {
		System.out.println("updating Medical Product in MySql Db");
		
	}

	@Override
	public void removeProduct() {
		System.out.println("Removing Medical Product in MySql Db");
		
	}

	@Override
	public void searchProduct(String name) {
		System.out.println("Searching Medical Product '" + name+  "' in MySql Db");
		
	}
	
}
