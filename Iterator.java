public interface Iterator {
    /**
     * Forcing the codes that implement this interface to run these items
     * @return a t/f on the next position and an item in the curreny position
     */
    public boolean hasNext();
    public Item next();
    
}
