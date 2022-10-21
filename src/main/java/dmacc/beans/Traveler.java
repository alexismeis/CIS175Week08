package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Embeddable
public class Traveler {
	private String firstName;
	private String lastName;
	
	public Traveler() {
		super();
	}
	
	public Traveler(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Traveler [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
