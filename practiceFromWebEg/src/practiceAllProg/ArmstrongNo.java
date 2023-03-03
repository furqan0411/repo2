/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ArmstrongNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		int reminder = 0;
		int arm = 0;

		int temp = a;

		while (temp > 0) {
			reminder = temp % 10;
			arm = (reminder * reminder * reminder) + arm;
			temp = temp / 10;
		}
		if (arm == a) {

			System.out.println("Armstrong number");
		} else {

			System.out.println("not a Armstrong number");
		}
	}

}
