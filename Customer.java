
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends Person
{
    /**
     * Constructor for objects of class Customer
     */
    public Customer(int idCardNumber, String name, String lastName, int cellphone, String email, String address, String city)
    {
        // initialise instance variables
        super(idCardNumber, name, lastName, cellphone, email, address, city);
    }
     /**
     * 
     * @return Customer values are printed to the console
     */
     @Override
    public String toString() {
        return "Customer \n" 
                + super.toString();
    }
}
