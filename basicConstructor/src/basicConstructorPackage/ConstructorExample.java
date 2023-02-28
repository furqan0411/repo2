/**
 * 
 */
package basicConstructorPackage;

/**
 * @author Dell
 *
 */
public class ConstructorExample {

	private String firstName;
	private String LastName;
	/*
	 * private String surName; private int age; private char gender; private long
	 * contact;
	 */

	public ConstructorExample() { // method with no arguments
	}

	public ConstructorExample(String firstName, String LastName) { // method with all arguments
		this.firstName = firstName;
		this.LastName = LastName;
		/*
		 * this.surName=surName; this.age=age; this.gender=gender; this.contact=contact;
		 */
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	LastName = lastName;
}
}

/**
 * @return the surName
 */
/*
 * public String getSurName() { return surName; }
 * 
 *//**
	 * @param surName the surName to set
	 */
/*
 * public void setSurName(String surName) { this.surName = surName; }
 * 
 *//**
	 * @return the age
	 */
/*
 * public int getAge() { return age; }
 * 
 *//**
	 * @param age the age to set
	 */
/*
 * public void setAge(int age) { this.age = age; }
 * 
 *//**
	 * @return the gender
	 */
/*
 * public char getGender() { return gender; }
 * 
 *//**
	 * @param gender the gender to set
	 */
/*
 * public void setGender(char gender) { this.gender = gender; }
 * 
 *//**
	 * @return the contact
	 */
/*
 * public long getContact() { return contact; }
 * 
 *//**
	 * @param contact the contact to set
	 */
/*
 * public void setContact(long contact) { this.contact = contact; }
 * 
 * 
 * 
 * }
 */