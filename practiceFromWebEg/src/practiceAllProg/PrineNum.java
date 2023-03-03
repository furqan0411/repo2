/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class PrineNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("enter the nummber");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int temp = 0;

		for (int i = 2; i <= (a - 1); i++) {

			if (a % i == 0) {

				temp = temp + 1;

			}
		}
		if (temp > 0) {

			System.out.println("not a prime number");
		} else {

			System.out.println("prime number");
		}
	}

}
