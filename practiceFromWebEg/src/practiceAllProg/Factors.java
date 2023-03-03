/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=16;
		System.out.println("factotrs of  "+a+"  are as follows");
		for (int i=1;i<=a;i++) {
			
			if (a%i==0) {
				
				System.out.print("  "+i);
			}
			
		}

	}

}
