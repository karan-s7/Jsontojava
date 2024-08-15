package jsontojava;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File jsonFile = new File("C:\\Users\\Admin\\Documents\\GitHub\\JsontoJava\\src\\main\\resources\\Data.json");


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert JSON file to Java object
            OrderWrapper orderWrapper = objectMapper.readValue(jsonFile, OrderWrapper.class);

            // Access the orders
            List<Order> orders = orderWrapper.getOrders();

            // Display Order Details
            for (Order order : orders) {
                OrderDetails orderDetails = order.getOrder();

                System.out.println("Customer Name: " + orderDetails.getCustomer().getName());
                System.out.println("Customer Email: " + orderDetails.getCustomer().getEmail());
                System.out.println("Customer Phone: " + orderDetails.getCustomer().getPhone());
                System.out.println("Shipping Address: " + orderDetails.getShippingAddress().getStreet() + ", " + orderDetails.getShippingAddress().getCity() + ", " + orderDetails.getShippingAddress().getZipCode() + ", " + orderDetails.getShippingAddress().getCountry());
                System.out.println("Order Details:");
                for (InventoryItem item : orderDetails.getInventory()) {
                    System.out.println("Item: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Total Price: " + item.getTotalPrice());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
