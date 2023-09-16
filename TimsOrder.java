import java.util.Scanner;
/**
 * This class illustrates the orders of tims stored in array of type TimsProduct.
 * It also gets the amount which is due at last and returns the string representation
 * of the order.
 *
 * @author Nisarg Nayak
 */
public class TimsOrder {

    /** the size of the order **/
    private int size;

    /** the name of the customer **/
    private String name;

    /** the order of tims products **/
    private static TimsProduct[] order;

    /**
     * Make a private constructor of TimsOrder having customer name and size
     * @param name the name of the customer
     * @param size the size of the order
     */
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Make a whole order by getting the customer name,the number products he\she wants
     * @return the Order
     */
    public static TimsOrder create() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the customer's name: ");
        String cName = sc.nextLine();

        System.out.print("Enter the number of products He/She wants: ");
        int size = sc.nextInt();

        order = new TimsProduct[size];

        for (int i = 0; i < order.length; i++) {

            System.out.println("Select the "+(i+1)+" product He/She wants: 1).Mug  2).Donut  3).Tshirt   4).Coffee");
            String userPreference = sc.next().toLowerCase();

            if (userPreference.equals("1")) {
                order[i] = Mug.create();
            } else if (userPreference.equals("2")) {
                order[i] = Donut.create();
            } else if (userPreference.equals("3")) {
                order[i] = Tshirt.create();
            } else if (userPreference.equals("4")) {
                order[i] = Coffee.create();
            }
        }
        return new TimsOrder(cName, size);
    }

    /**
     * get the amount due
     * @return the sum of total amount due
     */
    public double getAmountDue() {
        double sum = 0;
        for (int i = 0; i < order.length; i++) {
            sum = sum + order[i].getRetailPrice();
        }
        return sum;
    }
    /**
     * Overridden toString method of the timsproduct class
     * @return the string representation of the entire order
     */
    @Override
    public String toString() {

        String finalise="";

        for (int i = 0; i < order.length; i++) {

                 finalise += order[i].toString();
                 System.out.println("\n");
        }
        return "Order for: " + name + "\n" + finalise;
    }
}
