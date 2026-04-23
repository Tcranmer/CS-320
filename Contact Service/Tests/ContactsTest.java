/** Author: Cranmer, Thomas
 *  Date: 21Mar26
 *  File: ContactsTest.java
 *  Java Unit Test File for Contacts.java
 */

package Tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contacts.Contacts;

class ContactsTest {
	
	Contacts defaultContact = new Contacts();

	@Test
	void testContactsParameterizedConstructor() { // To test the constructor's operability
		
		Contacts newContact = new Contacts("0", "Tim", "Allen", "5555555555", "123 Banana Way");
		assertTrue(newContact.getID().equals("0"));
		assertTrue(newContact.getFirstName().equals("Tim"));
		assertTrue(newContact.getLastName().equals("Allen"));
		assertTrue(newContact.getPhoneNumber().equals("5555555555"));
		assertTrue(newContact.getAddress().equals("123 Banana Way"));
		
	}
	
	@Test
	void testContactsContactIDTooLong() { // To check boundaries of Contact ID
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			new Contacts("12345678901", "Tim", "Allen", "123", "123 Banana Way");
		});
	}
	
	@Test
	void testContactsContactFirstNameTooLong() { // To check boundaries of First Name
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			new Contacts("1", "BiggusDikkus", "Jr", "123", "Roman Empire Way");
		});
	}
	
	@Test
	void testContactsContactLastNameTooLong() { // To check boundaries of Last name
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			new Contacts("2", "Sonic", "TheHedgehog", "456", "111 Green Hill Way");
		});
	}
	
	@Test
	void testContactsContactPhoneNumberTooLong() { // To check boundaries of Phone Number
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			new Contacts("3", "John", "Sheppard", "015873334455", "SSV Normandy");
		});
	}
	
	@Test
	void testContactsContactAddressTooLong() { // To check boundaries of the Address
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				
			new Contacts("4", "Warrior", "Light", "1842", "555 Garuda Way, Gridania, Hydaelyn, Source Planet");
		});
	}
	
	@Test
	void testContactsContactIDNull() { // To check if ID is NULL
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			defaultContact.setID(null);
		});
	}
	
	@Test
	void testContactsContactFirstNameNull() { // To check if the First Name is NULL
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			defaultContact.setFirstName(null);
		});
	}
	
	@Test
	void testContactsContactLastNameNull() { // To check if the Last Name is NULL
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			defaultContact.setLastName(null);
		});
	}
	
	@Test
	void testContactsContactPhoneNumberNull() { // To check if the Phone Number is NULL
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			defaultContact.setPhoneNumber(null);
		});
	}
	
	@Test
	void testContactsContactAddressNull() { // To check if the Address is NULL
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			defaultContact.setAddress(null);
		});
	}

}
// EOF ContactsTest.java