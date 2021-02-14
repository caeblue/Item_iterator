
import java.util.ArrayList;
import java.util.Iterator;

public class WishList {
    /**
     * Creating variables to use through the class
     */
    private String name;
    private Item[] items;
    private int count=0;

    /**
     * Setting the name to this class and setting the array size
     * @param name name of the item
     */
    public WishList(String name)
    {
        this.name=name;
        items=new Item[5];
        
    }

    /**
     * Adding items to the array otherwise calling to expand the array
     * @param title from the item class
     * @param description from the item class
     * @param price from the item class
     */
    public void addItem(String title, String description, double price)
    {
        Item newItem = new Item(title, description, price);
        if (count == items.length)
        {
           items = growArray(items);
        }
        else
        {
            items[count]= newItem;
            count++;
        }
    }

    /**
     * Creating a new instance of the wishlist iterator to run through the items
     * @return the new iterator for the items
     */
    public WishListIterator createIterator()
    {
        return new WishListIterator(items);
    }

    /**
     * running through the array to collect and add all the costs
     * @return the total cost
     */
    public double getTotalCost()
    {
        double total=0;
        for(int i=0; i<count; i++)
        {
        total += items[i].getPrice();
        }
        return total;
    }

    /**
     * Creating a temp array with a large size then using the java util to clone the 
     * old array into it for expansion
     * @param items the older array that needs to be expanded
     * @return a larger array
     */
   private Item[] growArray(Item[] items)
    {
        Item[] tempArray = new Item[items.length*2];
        System.arraycopy(items, 0, tempArray, 0, items.length);
        items=tempArray;
        return items;
    }
    
}
