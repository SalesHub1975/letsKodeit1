package replit;


import java.util.ArrayList;
import java.util.*;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Item item) {
        this.regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        this.onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return this.regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return this.onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return this.regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return this.onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < regularItems.size(); i++) {
            list.add(regularItems.get(i).getName());
        }

        for (int i = 0; i < onSaleItems.size(); i++) {
            list.add(onSaleItems.get(i).getName());
        }

        return list;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        double d = 0.0;
        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                d = regularItems.get(i).getPrice();
            }
        }

        if (d == 0.0) {
            for (int i = 0; i < onSaleItems.size(); i++) {
                if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                    d = onSaleItems.get(i).getPrice();
                }
            }
        }
        return d;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        OnSaleItem item = null;

        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getName().equalsIgnoreCase(name)) {
                item = onSaleItems.get(i);
            }

        }
        return item;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.remove(i);
            }
        }

        for (int i = 0; i < onSaleItems.size(); i++) {
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                onSaleItems.remove(i);
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        int count;

        for (int i = 0; i < regularItems.size(); i++) {
            count = regularItems.get(i).getQuantity();
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                if (count != 0) {
                    count--;
                    regularItems.get(i).setQuantity(count);
                }
            }
            if(regularItems.get(i).getQuantity() == 0){
                removeItem(regularItems.get(i).getCatalogNumber());
            }
        }

        int count1;

        for (int i = 0; i < onSaleItems.size(); i++) {
            count1 = onSaleItems.get(i).getQuantity();
            if (onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
                if (count1 != 0) {
                    count1--;
                    onSaleItems.get(i).setQuantity(count1);
                }
            }
            if(onSaleItems.get(i).getQuantity() == 0){
                removeItem(onSaleItems.get(i).getCatalogNumber());
            }
        }

    }
}



