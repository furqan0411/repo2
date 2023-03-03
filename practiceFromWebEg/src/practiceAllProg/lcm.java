/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class lcm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 20;
		int i, gcd = 1;
		for (i = 1; i <= n1 && i <= n2; i++) {

			if (n1 % i == 0 && n2 % i == 0) {

				gcd = i;
			}

		}
		
		int lcm=n1*n2/gcd;

		System.out.println("the lcm is  " + lcm);

	}

}
