/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class CheckOddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a % 2 == 0) {

			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");
		}

	}

}
