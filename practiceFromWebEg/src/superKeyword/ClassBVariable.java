/**
 * 
 */
package superKeyword;

/**
 * @author Dell
 *
 */
public class ClassBVariable extends ClassAVariable {
	int a = 50;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassBVariable ref =new ClassBVariable();
		ref.display();		
	}

	void display() {

		System.out.println(a);
		System.out.println(super.a);

	}

}
