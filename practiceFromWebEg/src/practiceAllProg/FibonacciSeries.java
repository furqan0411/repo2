/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;//first 5 fibonacci series
		int n1 = 0;
		int n2 = 1;

		for (int i = 0; i < n; i++) {

			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			

		}
	}

}
