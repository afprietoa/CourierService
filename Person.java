
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    protected int idCardNumber;
    protected String name;
    protected String lastName;
    protected int cellphone;
    protected String email;
    protected String address;
    protected String city;

    /**
     * Constructor for objects of class Person
     */
    public Person(int idCardNumber, String name, String lastName, int cellphone, String email, String address, String city)
    {
        // initialise instance variables
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.address = address;
        this.city = city;
    }
     /**
     * 
     * @return Person values are printed to the console
     */
     @Override
    public String toString() {
        return  "ID Card Number =" + idCardNumber + "\n" 
                + "Name =" + name + "\n"
                + "Last Name =" + lastName + "\n"
                + "Cellphone =" + cellphone + "\n"
                + "Email =" + email + "\n"
                + "Address =" + address + "\n"
                + "City =" + city;
    }
}
