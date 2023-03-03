/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class Tables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("which table you would like to print");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int i=1;i<=10;i++) {
			
			int y=a*i;
			
			System.out.println(a+"*"+i+"="+y);
			
		}
		
		
		

	}

}
