package abstraction_demo;

public class Main {

	public static void main(String[] args) {
		MedicalProducts m1 = new MedicalProducts();
		
		m1.createProduct();
		m1.removeProduct();
		m1.updateProduct();
		m1.searchProduct("scalpal");

	}

}
