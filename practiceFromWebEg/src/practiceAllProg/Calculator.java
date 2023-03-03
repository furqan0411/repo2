/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float a = 23;
		float b = 10;
		int code = 1;
		float y;

		switch (code) {
		case 1:
			y = a + b;
			System.out.println("sum is " + y);
			break;

		case 2:
			y = a - b;
			System.out.println("difference is " + y);
			break;

		case 3:
			y = a * b;
			System.out.println("product is  " + y);
			break;

		case 4:
			y = a / b;
			System.out.println("quotient is  " + y);
			break;

		default:
			System.out.println("invalid");
			break;

		}

	}

}
