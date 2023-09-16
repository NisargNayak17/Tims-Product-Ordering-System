import java.util.Scanner;
/**
 * This class illustrates the timsproduct named Donut having description
 * and calorie count.It also extends the TimsProduct class and implements
 * the Consumable interface.
 *
 * @author Nisarg Nayak
 */

public class Donut extends TimsProduct implements Consumable{

    /** the description of the Donut **/
    private String description;

    /** the calories of the Donut **/
    private int calorieCount;

    /**
     * Create a private constructor of the Donut having name,price,cost,description and calorie
     * @param name the name of the Donut
     * @param price the price of the Donut
     * @param cost the cost of the Donut
     * @param description the description of the Donut
     * @param calorie the calories of the Donut
     */
    private Donut(String name,double price,double cost,String description,int calorie){
        super(name,price,cost);
        this.description=description;
        this.calorieCount = calorie;
    }

    /**
     * Make a Donut by getting the cost,price,description and calories of the Donut from the user
     * @return the Donut
     */
    public static TimsProduct create(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your Donut: ");
        String donutName = sc.nextLine();

        System.out.print("Enter the cost of your Donut: ");
        double cost = sc.nextDouble();

        System.out.print("Enter the price of your Donut: ");
        double price = sc.nextDouble();

        System.out.print("Enter the rounded calories count of your Donut: ");
        int calorie = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the description of your Donut: ");
        String description = sc.nextLine();

        return new Donut(donutName,cost,price,description,calorie);
    }

    /**
     * Get the Description
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Overridden method from the consumable interface
     * Get the calories count
     * @return the calories
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Overridden method from the consumable interface
     * Get the consumption method
     * @return the method of consumption
     */
    @Override
    public String getConsumptionMethod(){
        return "Eat it";
    }

    /**
     * Overridden toString method of the timsproduct class
     * @return the string representation of the order for Donut
     */
    @Override
    public String toString() {
        return super.toString()+"\nType... Donut{ description = "+getDescription()+", calorieCount= "+getCalorieCount()+"}\n";
    }
}
