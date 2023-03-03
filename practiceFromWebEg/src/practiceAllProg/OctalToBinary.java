/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class OctalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "6543";
		int temp = Integer.parseInt(a, 8);
		String result = Integer.toBinaryString(temp);
		System.out.println(result);

	}

}
