import java.util.Iterator;

public class WishListIterator implements Iterator
{
    /**
     * Creating the item for the wishlist and a position counter
     */
    private Item[] items;
    private int position = 0;

    /**
     * Setting the items from the other class the the items in this class
     * @param items items used for deciding the position and length 
     */
    public WishListIterator(Item[] items)
    {
        this.items=items;
    }

    /**
     * Using items variable to see if there is a variable next in line
     */
    public boolean hasNext()
    {
        if(position >= items.length || items[position] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * creating an item in the current position then moving the position up one
     */
    public Item next()
    {
        Item item = items[position];
        position= position + 1;
        return item;
    }


    
}
