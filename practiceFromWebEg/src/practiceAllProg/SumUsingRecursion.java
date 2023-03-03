/**
 * 
 */
package practiceAllProg;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class SumUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("enter the number for rcursive addition");
		Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	int result=SumUsingRecursion.addMethod(num);
	System.out.println(result);
	}

	public static int addMethod(int a)
	
	{
		if (a>0) {
			
			a=a+addMethod(a-1);
			return a;
		}
		else {
		
		
		return 0;
		
		}
	}
	
}

/*
 * while ( num>=1) { sum = num+sum; --num;
 * 
 * } System.out.println("result---" + sum);
 * 
 * 
 * 
 * if (a!= 0) { a = (a + addMethod(a - 1)); }
 * 
 */