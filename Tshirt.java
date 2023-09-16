import javafx.scene.paint.Color;
import java.util.Scanner;
/**
 * This class illustrates the timsproduct named Tshirt having color and different
 * sizes.It also extends the TimsProduct class.
 *
 * @author Nisarg Nayak
 */

public class Tshirt extends TimsProduct{

    /** the color of the Tshirt **/
    private Color color;

    /** the size of the Tshirt **/
    private String size;

    /**
     * Make a private constructor having name,cost,price,color and the size of the Tshirt
     * @param name the name of the Tshirt
     * @param cost the cost of the Tshirt
     * @param price the price of the Tshirt
     * @param color the color of the Tshirt
     * @param size the size of the Tshirt
     */
    private Tshirt(String name,double cost,double price,Color color,String size){
        super(name,cost,price);
        this.color = color;
        this.size = size;
    }

    /**
     * Make a Tshirt by getting the color,size,cost and price of the Tshirt
     * @return the Tshirt
     */
    public static Tshirt create(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your Tshirt: ");
        String tshirtName = sc.nextLine();

        System.out.print("Which color you want? ");
        Color color = Color.valueOf(sc.next());

        System.out.println("What is your size of Tshirt? \n1). XL 2).XXL  3).S");
        String size = sc.next();
        switch (size) {
            case "1":
                size = "XL";
                break;
            case "2":
                size = "XXL";
                break;
            case "3":
                size = "S";
                break;
            default:
                size = "Invalid Size"; // Handle invalid input
                break;
        }

        System.out.print("Enter the cost of your Tshirt: ");
        double cost = sc.nextDouble();

        System.out.print("Enter the price of your Tshirt: ");
        double price = sc.nextDouble();

        return new Tshirt(tshirtName,cost,price,color,size);
    }

    /**
     * Get the color of the Tshirt
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Get the size of the Tshirt
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Overridden toString method of the timsproduct class
     * @return the string representation of the order for Tshirt
     */
    @Override
    public String toString(){
        return super.toString()+"\nType... T-shirt {Size: "+getSize()+", Color: "+getColor()+"}\n";
    }
}
