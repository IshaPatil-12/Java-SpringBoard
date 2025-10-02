package Exercise;

import java.util.List;
import java.util.ArrayList;

class Order {
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivery;

    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }

    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    @Override
    public String toString() {
        return "Order Id: " + getOrderId() +
               ", Item names: " + getItemNames() +
               ", Cash on delivery: " + isCashOnDelivery();
    }
}

class Tester {

    // Collect all items from all orders (with duplicates preserved)
    public static List<String> getItems(List<Order> orders) {
        List<String> result = new ArrayList<String>();

        for (Order order : orders) {                   // Loop through each order
            for (String item : order.getItemNames()) { // Add all items directly
                result.add(item);                      // Keep duplicates
            }
        }
        return result;                                  // Return all items
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>();

        // Sample Input 1
        List<String> items1 = new ArrayList<String>();
        items1.add("FriedRice");
        items1.add("Pasta");
        items1.add("Tortilla");
        orders.add(new Order(101, items1, true));

        List<String> items2 = new ArrayList<String>();
        items2.add("Pizza");
        items2.add("Pasta");
        orders.add(new Order(102, items2, true));

        List<String> items3 = new ArrayList<String>();
        items3.add("Burger");
        items3.add("Sandwich");
        items3.add("Pizza");
        orders.add(new Order(103, items3, true));

        List<String> items = getItems(orders);
        System.out.println(items); // Prints output in a single line

        // --------------------------
        // Sample Input 2
        orders.clear();

        List<String> items4 = new ArrayList<String>();
        items4.add("Burger");
        items4.add("Pizza");
        orders.add(new Order(911, items4, true));

        List<String> items5 = new ArrayList<String>();
        items5.add("Cream cheese");
        items5.add("Bread");
        orders.add(new Order(912, items5, true));

        items = getItems(orders);
        System.out.println(items); // Prints output in a single line
    }
}


		

    
	

