package practiceAllProg;

import java.util.Scanner;

public class DisplayPrimeNos {

	public static void main(String[] args) {

		System.out.println("enter the nummber");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int temp = 0;

		for (int i = 1; i <= b; i++) {

			for (int j = 2; j <= (i - 1); i++) {

			if (i%j==0) {
				
				temp=temp+1;
				
			}
			
			}
			
			if(temp==0) {
				
				System.out.println(i);
			}
			else
			{
				temp=0;
			}
		}
	}

}
