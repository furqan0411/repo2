/**
 * 
 */
package practiceAllProg;

/**
 * @author Dell
 *
 */
public class AvgOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double temp=0;
		double ar[]= {23,45,65,87,67,98,90,76};
		for (double value:ar) {
			
			temp=value+temp;
		}
		
		int y=ar.length;
		double average=temp/y;
		System.out.println("average of the array is  "+average);
		
		

	}

}
