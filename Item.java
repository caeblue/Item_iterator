import java.util.ArrayList;
import java.util.Iterator;

public class Item extends WishList
{
    /**
     * Creatign variables to add things to the wishlist
     */
    private String title;
    private String description;
    private double price;

    /**
     * Setting all of the items to this class
     * @param title title of the wishlisted item 
     * @param description desciption of the item
     * @param price price of the item
     */
    public Item(String title, String description, double price)
    {
            super("name");
            this.title = title;
            this.description = description;
            this.price = price;
    }

    /**
     * Creating a string variable to print out the wishlist items info
     */
    public String toString()
     {
        String retString = "***** " + title + " *****" + "\n" + description + "\nPrice: $" + price + "\n\n";
        return retString;
    }

    /**
     * returning the price taken from the driver
     * 
     * @return a price for the item
     */
    public double getPrice() {

        return price;

    }

    /**
     * Call to the toString to print the wishlist out
     */
    public void print() {
        System.out.println(toString());
    }
}