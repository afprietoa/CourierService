
/**
 * Write a description of class Shipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shipment
{
    // instance variables - replace the example below with your own
    private int guideNumber;
    private Customer customer;
    private String originCity;
    private String destinyCity;
    private String destinyAddress;
    private String destinataryName;
    private int destinataryContact;
    private int deliveryHour;
    private String shipmentState;
    private double shippingCosts;
    private Package packages;

    /**
     * Constructor for objects of class Shipment
     */
    public Shipment(int guideNumber, Customer customer, String originCity,String 
    destinyCity,String destinyAddress,String destinataryName, Package packages)
    {
        // initialise instance variables
        this.guideNumber = guideNumber;
        this.customer = customer;
        this.originCity = originCity;
        this.destinyCity = destinyCity;
        this.destinyAddress = destinyAddress;
        this.destinataryName = destinataryName;
        this.destinataryContact = destinataryContact;
        this.deliveryHour = deliveryHour;
        this.shipmentState = shipmentState;
        this.shippingCosts = shippingCosts;
        this.packages = packages;

    }

     /**
     * 
     * @return Shipment values are printed to the console
     */
     @Override
    public String toString() {
        return "Shipment \n" 
                + "Guide Number =" + guideNumber + "\n" 
                + "Customer =" + customer + "\n"
                + "Origin City =" + originCity + "\n"
                + "Destiny City =" + destinyCity + "\n"
                + "Destiny Address =" + destinyAddress + "\n"
                + "Destinatary Name =" + destinataryName + "\n"
                + "Destinatary Contact =" + destinataryContact + "\n"
                + "Delivery Hour =" + deliveryHour + "\n"
                + "Shipment State =" + shipmentState + "\n"
                + "Shipping Costs =" + shippingCosts + "\n"
                + "Package =" + packages;
    }
}
