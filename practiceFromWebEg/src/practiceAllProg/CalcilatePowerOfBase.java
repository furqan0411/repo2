/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class CalcilatePowerOfBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int base = 2;
		int power = 4;
		int result = 1;
		for (int i = 1; i <= power; i++) {

			result = result * base;
		}
		System.out.println(result);
	}

}
