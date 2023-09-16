/**
 *  This class tests our model of tim hortons products.It creates the object
 *  of type TimsOrder and displays the entire order.It also displays the amount
 *  due at last.
 *
 * @author Nisarg Nayak
 */
public class TestClass {
    public static void main(String[] args) {

        // Create an object of TimsOrder
        TimsOrder t = TimsOrder.create();

        // Print the order
        System.out.println(t);

        // print the total amount which is due
        System.out.println("Total price: "+t.getAmountDue());
    }
}