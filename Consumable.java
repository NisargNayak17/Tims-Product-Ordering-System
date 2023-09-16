/**
 * This interface illustrates the two consumable method that must be defined in
 * the child class that implements Consumable.
 *
 * @author Nisarg Nayak
 */
public interface Consumable {

    /**
     * Get the Calories of the consumable product
     * @return the calories
     */
    int getCalorieCount();

    /**
     * Get the Consumption method of the product
     * @return the consumption method
     */
    String getConsumptionMethod();

}
