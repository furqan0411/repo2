/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class NoOfDigitsInInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		int n = 45;
		
		while(n!=0) {
			
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
