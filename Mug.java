import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * This class illustrates the tims product named Mug having the color.It also extends
 * the TimsProduct.
 *
 * @author Nisarg Nayak
 */
public class Mug extends TimsProduct{

    /** the color of the Mug **/
    private Color color;

    /**
     * Create a private constructor having the name,price,cost and color
     * @param name the name of Mug
     * @param cost the cost of Mug
     * @param price the price of Mug
     * @param color the color of Mug
     */
    private Mug(String name,double cost,double price,Color color){
        super(name,cost,price);
        this.color = color;
    }

    /**
     * Provide a Mug by getting the color,cost and the price of the color
     * @return the Mug
     */
    public static TimsProduct create(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of your Mug: ");
        String mugName = sc.nextLine();
        System.out.print("Enter the color of your Mug: ");
        Color color = Color.valueOf(sc.next());
        System.out.print("Enter the cost of your Mug: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the price of your Mug: ");
        double price = sc.nextDouble();

        return new Mug(mugName,cost,price,color);
    }

    /**
     * get the color
     * @return color
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * Overridden toString method of the timsproduct class
     * @return the string representation of the order for Mug
     */
    @Override
    public String toString() {
        return super.toString()+"\nType.... Mug{ Color = "+color+"}\n";
    }
}
