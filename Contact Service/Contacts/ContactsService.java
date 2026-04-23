/** Author: Cranmer, Thomas
 *  Date: 21Mar26
 *  File: ContactsService.java
 *  This file utilizes the Contacts class to save contacts in a list for a user
 *  Contact information can be saved, deleted and edited through this program
 */

package Contacts;

import java.util.*;

public class ContactsService {
    
    // Variables
    public int contactID = 1; // Unique ID keeper

    public Contacts currContacts = new Contacts();

    public static Vector<Contacts> contactList = new Vector<Contacts>(); 

    public ContactsService() { // Typical initialization of constructor (for my sanity)
    }

    /*
     * @param firstName: First Name of Contact
     * @param lastName: Last Name of Contact
     * @param phoneNum: Phone Number of Contact
     * @param address: Address of Contact
     * This method allows for the adding of contacts to the vector list of contactList
     * */
    public void addContacts(String firstName, String lastName, String phoneNum, String address){

        String convertID; // Needed for integer counting ID identifier to be converted to String

        convertID = Integer.toString(contactID);

        // Saves all data to object
        currContacts.setID(convertID);
        currContacts.setFirstName(firstName);
        currContacts.setLastName(lastName);
        currContacts.setPhoneNumber(phoneNum);
        currContacts.setAddress(address);

        contactList.add(currContacts); // Built in Vector command to add Object to vector

        System.out.print("Contact saved. ID: "); // User readability
        System.out.println(contactList.get(contactID - 1).getID()); // If not working, this will fault out

        currContacts = new Contacts(); // resets Object (Thank you garbage collector)

        ++contactID; // Next ID

        
    }

    /*
     * @param ID: Unique ID to find contact to delete
     * This method utilizes a Unique ID to find and remove a specific
     * contact from the vector
     * */
    public void deleteContacts(int ID){

        String convertID = Integer.toString(ID);

        for (int i = 0; i < contactList.size(); i++) {
        	

            if (convertID.equals(contactList.get(i).getID())){

                contactList.remove(i);
                System.out.println("Contact Deleted");
                i = contactList.size();
            }
            
        }
    }

    /*
     * @param ID: Unique ID to find contact to delete
     * @param firstName: New First Name for contact
     * This method utilizies a unique ID to find and change
     * a first name of a specific contact in the vector
     * */
    public void editFirst(int ID, String firstName) {

        String convertID = Integer.toString(ID);

        for (int i = 0; i < contactList.size(); i++) {

            if (convertID.equals(contactList.get(i).getID())){

                contactList.elementAt(i).setFirstName(firstName);
                System.out.println("First Name Edited Successfully");
            }
            
        }
    }

    /*
     * @param ID: Unique ID to find contact to delete
     * @param LastName: New Last Name for contact
     * This method utilizies a unique ID to find and change
     * a last name of a specific contact in the vector
     * */
    public void editLast(int ID, String lastName){

        String convertID = Integer.toString(ID);

        for (int i = 0; i < contactList.size(); i++) {

            if (convertID.equals(contactList.get(i).getID())){

                contactList.elementAt(i).setLastName(lastName);
                System.out.println("Last Name Edited Successfully");
            }
            
        }
    }
    
    
    /*
     * @param ID: Unique ID to find contact to delete
     * @param phoneNum: New Phone Number for contact
     * This method utilizies a unique ID to find and change
     * the phone number of a specific contact in the vector
     * */
    public void editPhoneNum(int ID, String phoneNum){

        String convertID = Integer.toString(ID);

        for (int i = 0; i < contactList.size(); i++) {

            if (convertID.equals(contactList.get(i).getID())){

                contactList.elementAt(i).setPhoneNumber(phoneNum);
                System.out.println("Phone Number Edited Successfully");
            }
            
        }
    }

    
    /*
     * @param ID: Unique ID to find contact to delete
     * @param address: New Address for contact
     * This method utilizies a unique ID to find and change
     * the address of a specific contact in the vector
     * */
    public void editAddress(int ID, String address){

        String convertID = Integer.toString(ID);

        for (int i = 0; i < contactList.size(); i++) {

            if (convertID.equals(contactList.get(i).getID())){

                contactList.elementAt(i).setAddress(address);
                System.out.println("Address Edited Successfully");
            }
            
        }
    }

}
// EOF ContactsService.java
