/**
 * This interface illustrates the two commodity  method that must be defined in
 * the child class that implements Commodity.
 *
 * @author Nisarg Nayak
 */
public interface Commodity {

    /**
     * Get the production cost of product
     * @return the production cost
     */
    double getProductionCost();

    /**
     * Get the retail price of the product
     * @return the retail price
     */
    double getRetailPrice();

}
