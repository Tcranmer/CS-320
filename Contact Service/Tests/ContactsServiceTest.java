/** Author: Cranmer, Thomas
 *  Date: 21Mar26
 *  File: ContactsServiceTest.java
 *  Java Unit Test File for ContactsService.java
 */

package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;

import Contacts.ContactsService;

import org.junit.jupiter.api.Test;

class ContactsServiceTest {
	
	// Variables for testing
	ContactsService testContact = new ContactsService();
	String firstName = "Kurumi";
	String lastName = "Tokisaki";
	String phoneNum = "987654321";
	String address = "541 Zafkiel St";
	
	@AfterEach
	void clearVector() { // Utilized to have no miscellaneous results per test case
		
		ContactsService.contactList.clear();
	}

	@Test
	void testContactsServiceAddContact() { // Used to test Add Contact method
		

		// Tests for initial working of addContract
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertFalse(ContactsService.contactList.isEmpty());
		assertEquals("1", ContactsService.contactList.get(0).getID());
		assertEquals("Kurumi", ContactsService.contactList.get(0).getFirstName());
		assertEquals("Tokisaki", ContactsService.contactList.get(0).getLastName());
		assertEquals("987654321", ContactsService.contactList.get(0).getPhoneNumber());
		assertEquals("541 Zafkiel St", ContactsService.contactList.get(0).getAddress());
		
		// Tests for Unique ID setting
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertEquals(2, ContactsService.contactList.size());
		assertEquals("2", ContactsService.contactList.get(1).getID());
		assertEquals("Kurumi", ContactsService.contactList.get(1).getFirstName());
		assertEquals("Tokisaki", ContactsService.contactList.get(1).getLastName());
		assertEquals("987654321", ContactsService.contactList.get(1).getPhoneNumber());
		assertEquals("541 Zafkiel St", ContactsService.contactList.get(1).getAddress());
		
		
	}
	
	@Test
	void testContactsServiceDeleteContact() { // Used to test Delete Contact method
		boolean badEnd = false; // Flag to see if ID is found
		
		// 3 "unique" vector objects to ensure unique ID is found in search
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		testContact.deleteContacts(2);
		
		assertEquals(2, ContactsService.contactList.size());
		
		for (int i = 0; i < ContactsService.contactList.size(); i++) {
			
			if (ContactsService.contactList.get(i).getID() == "2") { // Remove did not work: Flag TRUE
				
				badEnd = true;
			}
		}

		assertFalse(badEnd);
		
	}
	
	@Test
	void testContactsServiceFirstNameChange() { // Used to check proper First Name Change
		
		// Populate Vector
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertTrue(ContactsService.contactList.get(0).getFirstName() == "Kurumi");
		
		testContact.editFirst(1, "Walnut");
		
		assertTrue(ContactsService.contactList.get(0).getFirstName() == "Walnut");
	}
	
	@Test
	void testContactsServiceLastNameChange() { // Used to check proper Last Name Change
		
		// Populate Vector
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertTrue(ContactsService.contactList.get(0).getLastName() == "Tokisaki");
		
		testContact.editLast(1, "Nightmare");
		
		assertTrue(ContactsService.contactList.get(0).getLastName() == "Nightmare");
	}
	
	@Test
	void testContactsServicePhoneNumberChange() { // Used to check proper Phone Number Change
		
		// Populate Vector
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertTrue(ContactsService.contactList.get(0).getPhoneNumber() == "987654321");
		
		testContact.editPhoneNum(1, "3");
		
		assertTrue(ContactsService.contactList.get(0).getPhoneNumber() == "3");
	}
	
	@Test
	void testContactsServiceAddressChange() { // Used to check proper Address Change
		
		// Populate Vector
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		testContact.addContacts(firstName, lastName, phoneNum, address);
		
		assertTrue(ContactsService.contactList.get(0).getAddress() == "541 Zafkiel St");
		
		testContact.editAddress(1,  "20 Years Later");
		
		assertTrue(ContactsService.contactList.get(0).getAddress() == "20 Years Later");
	}

}
// EOF ContactsServiceTest.java