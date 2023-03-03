/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class SumOfNaturalNos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("enter the maximum natural number to calculate the sum ");
		Scanner scanner = new Scanner(System.in);
		int a;
		int sum = 0;
		a = scanner.nextInt();

		if (a > 0) {

			for (int i = 1; i <= a; ++i) {

				sum = sum + i;
			}
			System.out.println("sum of natural numbers is" + sum);
		} else {

			System.out.println("invalid entry");
		}
	}

}
