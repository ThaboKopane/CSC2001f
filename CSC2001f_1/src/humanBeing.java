/**
*<h1>Person object to store name, address and phone number of a person </h1>
* This a humanBeing, this class implements a comparable interface because when using a list or when listing
* the files, they need to be in alphabeitcal order. The humanBeing classes uses name, phoneNumber and address to put store
* a person's details.
* @author Thabo Kopane
* @version 1.1
*/
public class humanBeing implements Comparable<humanBeing> {
  private String name;
  private String phoneNumber;
  private String address;

/**
* This is the constructor that initializes the name, phone number and address
* @param name The name of the person.
* @param phoneNumber this initiates the cellphone or telephone number of the person class
* @param address this initiates the address - where the person lives.
*/
  public humanBeing(String name, String phoneNumber, String address){
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }
  /**
  * This is method that initiates or sets the name of thee person to either a new or change an already existing name.
  * @param newName sets or changes the name of the object.
  */
  public void setName(String newName){
    name = newName;
  }
  /**
  * This returns the name of the person class
  * @return String name, returns thee string version of  the name.
  */
  public String getName(){
    return name;
  }
  /**
  * this void method sets the cellphon or telephone number of the humanBeing.
  * @param newPhoneNumber sets or changes the number.
  */
  public void setNumber(String newPhoneNumber){
    phoneNumber = newPhoneNumber;
  }
  /**
  * This void method sets the address.
  * @param newAddress A string parameter.
  */
  public void setAddress(String newAddress){
    address = newAddress;
  }
  /**
  * A compareTo method which, overridden from the Comparable interface,
  * This compares the name of the person class.
  * after making the comparison, returns an int which helps in ordering.
  * @param motho this a humanBeing object, it will be compared to another and an int is returned.
  *  @return int returns an Integer between -1 and 1 for comparing two objects.
  */
  public int compareTo(humanBeing motho){
    return name.compareTo(motho.getName());
  }
  /**
  * A to string method that is overriden from java original class
  * @return String, returns a string that is the has the String name, phoneNumber and address.
  */
  public String toString() {
    return (name+" |"+phoneNumber+" |"+address);
  }
}
