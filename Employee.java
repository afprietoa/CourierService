
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private int antiquity;
    private String bloodType;
    private String employeeType;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(int idCardNumber, String name, String lastName, int cellphone, String email, String address, String city)
    {
        // initialise instance variables
        super(idCardNumber, name, lastName, cellphone, email, address, city);
        this.antiquity = antiquity;
        this.bloodType = bloodType;
        this.employeeType = employeeType;
    }

     /**
     * 
     * @return Employee values are printed to the console
     */
     @Override
    public String toString() {
        return "Employee \n" 
                + super.toString() + "\n" 
                + "Antiquity =" + antiquity + "\n"
                + "Blood Type =" + bloodType + "\n"
                + "Employee Type =" + employeeType;
    }
}
