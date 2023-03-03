/**
 * 
 */
package superKeyword;

/**
 * @author Dell
 *
 */
public class ClassBMethod extends ClassAMethod {
	int a = 10, b = 7, y;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassBMethod ref = new ClassBMethod();
		ref.display();
	}

	void display() {
		super.display();
		y = a * b;
		System.out.println("class b result---" + y);

	}
}
