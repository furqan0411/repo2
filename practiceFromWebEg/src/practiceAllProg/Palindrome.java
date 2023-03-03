/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "fkf";
		String ps = "";

		int slength = s.length();

		for (int i = (slength - 1); i >= 0; i--) {

			ps = ps + s.charAt(i);
		}

		if (ps.equalsIgnoreCase(s)) {

			System.out.println("given string is a palindrome");
		}

		else {

			System.out.println("not a palindrome");
		}

	}
}
