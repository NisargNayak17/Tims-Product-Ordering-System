/**
 * This class illustrates the products of tims having name, cost and price.
 * It also implements the Commodity interface having two methods.
 *
 * @author Nisarg Nayak
 */
public class TimsProduct implements Commodity{

    /** name of the product **/
    private String name;

    /** Cost of the product **/
    private double cost;

    /** Price of the product **/
    private double price;

    /**
     * Creating TimsProduct having name,cost and price
     * @param name the name of the product
     * @param cost the cost of the product
     * @param price the price of the product
     */
    TimsProduct(String name,double cost,double price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Get the name of the product
     * @return the name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Overridden method of the Commodity interface
     * Get the production cost
     * @return the cost
     */
    @Override
    public double getProductionCost(){
        return this.cost;
    }

    /**
     * Overridden method of the Commodity interface
     * Get the retail price
     * @return the price
     */
    @Override
    public double getRetailPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return "TimsProduct"+"{ name = "+getName()+", cost = "+cost+", price = "+price+"}";
    }
}
