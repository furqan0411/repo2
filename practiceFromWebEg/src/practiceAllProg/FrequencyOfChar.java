/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class FrequencyOfChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String st = "hello how are you";
		char ch = 'o';
		int l = st.length();
		int freq = 0;
		for (int i = 1; i < l; i++) {

			if (ch == st.charAt(i)) {

				freq++;
			}

		}

		System.out.println("frequency of " + 'o' + " is " + freq);

	}

}
