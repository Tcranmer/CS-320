/** Author: Cranmer, Thomas
 *  Date: 21Mar26
 *  File: Contacts.java
 *  This is a class file that allows for the saving of contact information
 */

package Contacts;

public class Contacts {
    
    // Private Variables:
    private String ID;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;

    // Constructors:
    public Contacts(){

        this.ID = null;
        this.firstName = null;
        this.lastName = null;
        this.phoneNum = null;
        this.address = null;
    }

    /* @param String ID: Unique ID of Class
     * @param String firstName: First Name of Contact of class
     * @param String lastName: Last Name of Contact of class
     * @param String phoneNum: Phone Number of Contact of class
     * @param String address: Address of Contact of class
     * This is the parameterized constructor of the Contacts class. This also checks
     * for correct saving of variables to not exceed 10 characters and not be null
     * 
     */
    public Contacts (String ID, String firstName, String lastName, String phoneNum, String address) {

        if (ID == null || ID.length() > 10) {

            throw new IllegalArgumentException("Invalid ID");
        } else {

            this.ID = ID;
        }

        if (firstName == null || firstName.length() > 10) {

            throw new IllegalArgumentException("Invalid First Name");
        } else {

            this.firstName = firstName;
        }

        if (lastName == null || lastName.length() > 10) {

            throw new IllegalArgumentException("Invalid Last Name");
        } else {

            this.lastName = lastName;
        }

        if (phoneNum == null || phoneNum.length() > 10) {

            throw new IllegalArgumentException("Invalid Phone Number");
        } else {

            this.phoneNum = phoneNum;
        }

        if (address == null || address.length() > 30) {

            throw new IllegalArgumentException("Invalid Address");
        } else {

            this.address = address;
        }

        
    }

    // Getter Functions (public):
    public String getID() {

        return this.ID;
    }

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName(){

        return this.lastName;
    }

    public String getPhoneNumber() {

        return this.phoneNum;
    }

    public String getAddress() {

        return this.address;
    }

    // Setter Functions
    public void setID(String newID) {

        if (newID == null || newID.length() > 10) {

            throw new IllegalArgumentException("Invalid ID");
        } else {
            this.ID = newID;
        }
    }

    public void setFirstName(String newFirstName) {

        if (newFirstName == null || newFirstName.length() > 10) {

            throw new IllegalArgumentException("Invalid First Name");
        } else {
            this.firstName = newFirstName;
        }
    }

    public void setLastName(String newLastName) {

        if (newLastName == null || newLastName.length() > 10) {

            throw new IllegalArgumentException("Invalid Last Name");
        } else {
            this.lastName = newLastName;
        }
    }

    public void setPhoneNumber(String newPhoneNum) {

        if (newPhoneNum == null || newPhoneNum.length() > 10) {

            throw new IllegalArgumentException("Invalid Phone Number");
        } else {
            this.phoneNum = newPhoneNum;
        }
    }

    public void setAddress(String newAddress) {

        if (newAddress == null || newAddress.length() > 30) {

            throw new IllegalArgumentException("Invalid Address");
        } else {
            this.address = newAddress;
        }
    }


    


}
// EOF Contacts.java