package fifthHomework;

public interface Inventory {
    public int ITEMS = 5;
    public boolean put(int inventoryPlace,Item item);

    public boolean useItem(int inventoryPlace);
}
