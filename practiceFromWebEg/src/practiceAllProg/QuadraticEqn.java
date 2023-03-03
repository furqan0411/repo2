/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class QuadraticEqn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double a = 3d, b = 4d, c = 5.2d, r1, r2, temp1, temp2;

		temp1 = -(b + ((b * b) - (4 * a * c)) / (2 * a));
		r1 = Math.sqrt(temp1);

		temp2 = (b - ((b * b) - (4 * a * c)) / (2 * a));
		r2 = Math.sqrt(temp2);

		System.out.println("root r1 is  " + r1);
		System.out.println("root r2 is  " + r2);

	}

}
