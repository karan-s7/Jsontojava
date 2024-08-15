package jsontojava;

import java.util.List;

public class OrderDetails {
    private Customer customer;//it is used get the customer details
    private ShippingAddress shippingAddress;
    private List<InventoryItem> inventory;//list<> means to create  array

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }
}

