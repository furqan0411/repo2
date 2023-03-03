/**
 * 
 */
package superKeyword;

/**
 * @author Dell
 *
 */
public class ClassBConstructor extends ClassAConsrtuctor {
	int y;

	/**
	 * @param args
	 */
	ClassBConstructor(int a, int b) {
		super(5, 7);// constructor call to superclassA and it must be called first must be first
		y = a * b;
		System.out.println("reslt of subclass  " + y);

	}

	public static void main(String[] args) {

		ClassBConstructor ref = new ClassBConstructor(7, 8);//

	}

}
