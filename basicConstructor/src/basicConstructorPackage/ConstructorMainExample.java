package basicConstructorPackage;

public class ConstructorMainExample {

	public static void main(String[] args) {

		/* ConstructorExample constructorExample=new ConstructorExample(); */

		ConstructorExample constructorExample = new ConstructorExample("fazila", "sayed");

		constructorExample.setFirstName("fazila");
		constructorExample.setLastName("sayed");

		ConstructorMainExample constructorMainExample = new ConstructorMainExample();
		constructorMainExample.displayDetails(constructorExample);
	}

	private void displayDetails(ConstructorExample constructorExample) {

		System.out.println("first name" + constructorExample.getFirstName());
		System.out.println("last name" + constructorExample.getLastName());
		/*
		 * System.out.println("surname"+constructorExample.getSurName());
		 * System.out.println("age"+constructorExample.getAge());
		 * System.out.println("contact no."+constructorExample.getContact());
		 * System.out.println("first name"+constructorExample.getFirstName());
		 */

	}

}