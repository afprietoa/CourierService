
/**
 * Write a description of class Package here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Package
{
    // instance variables - replace the example below with your own
    private int code;
    private String size;
    private double weight;
    private double declaredValue;

    /**
     * Constructor for objects of class Package
     */
    public Package(int code, String size, double weight, double declaredValue)
    {
        // initialise instance variables
        this.code = code;
        this.size = size;
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

     /**
     * 
     * @return Package values are printed to the console
     */
     @Override
    public String toString() {
        return "Package \n" 
                + "Code =" + code + "\n" 
                + "Size =" + size + "\n"
                + "Weight =" + weight+ "\n"
                + "Declared Value =" + declaredValue;
    }
}
