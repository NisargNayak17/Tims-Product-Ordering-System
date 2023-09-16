import java.util.Scanner;
/**
 * This class illustrates the tims product named Coffee.It also implements the Consumable
 * interface having two methods and extends the timsproduct class.
 *
 * @author Nisarg Nayak
 */

public class Coffee extends TimsProduct implements Consumable{

    /** the name of Coffee **/
    private String coffeeName;

    /** the size of Coffee **/
    private String size;

    /** the calories of Coffee **/
    private int calorieCount;

    /**
     * private constructor of coffee having the name,cost,price,calorie count, coffee name and size
     * @param name the name of the coffee
     * @param cost the cost of the coffee
     * @param price the price of the coffee
     * @param calorieCount the calorie of the coffee
     * @param coffeeName the name of the coffee
     * @param size the size of the coffee
     */
    private Coffee(String name,double cost,double price,int calorieCount,String coffeeName,String size){
        super(name,cost,price);
        this.coffeeName = coffeeName;
        this.size = size;
        this.calorieCount = calorieCount;
    }

    /**
     * Make a coffee by getting the name,size,cost,price and the calories
     * of the coffee from the user.
     *
     * @return coffee
     */
    public static Coffee create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which type of coffee you want: \n 1).French Vanilla   2).Hot Chocolate");
        String coffeeName = sc.nextLine();

        switch (coffeeName) {
            case "1":
                coffeeName = "French Vanilla";
                break;
            case "2":
                coffeeName = "Hot chocolate";
                break;
            default:
                coffeeName = "Invalid type"; // Handle invalid input
                break;
        }

        System.out.println("Enter the size of the coffee: \n1).Small    2).Medium   3).Large");
        String size = sc.nextLine();

        switch (size) {
            case "1":
                size = "Small";
                break;
            case "2":
                size = "Medium";
                break;
            case "3":
                size = "Large";
                break;
            default:
                size = "Invalid Size"; // Handle invalid input
                break;
        }

        System.out.print("Enter the rounded calories count of your Coffee: ");
        int calorie = sc.nextInt();

        System.out.print("Enter the cost of your Coffee: ");
        double cost = sc.nextDouble();

        System.out.print("Enter the price of your Coffee: ");
        double price = sc.nextDouble();

        return new Coffee("Tim's Coffee",cost,price,calorie,coffeeName,size);
    }

    /**
     * Get the coffee name
     * @return coffee name
     */
    public String getCoffeeName() {
        return coffeeName;
    }

    /**
     * Overridden method from the consumable class
     * Get the calories count
     * @return the calories
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Overridden method from the consumable method
     * Get the consumption method
     * @return the method of consumption
     */
    @Override
    public String getConsumptionMethod() {
        return "Drink it";
    }

    /**
     * Overridden toString method of the timsproduct class
     * @return the string representation of the order for Coffee
     */
    @Override
    public String toString(){
        return super.toString()+"\nType...."+getCoffeeName()+", size: "+size+", calorie count: "+getCalorieCount()+"\n";
    }
}
