package javademos.generics;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    public static void main(String[] args) {

        // List<Item> items = new ArrayList<>();

        // items.add(new Item("Book - Animal Farm", 1, 72.99));
        // items.add(new Item("Soap - Dove", 2, 44.99));
        // items.add(new Item("Noodles - Spaghetti", 3, 23.99));
        // items.add(new Item("Softdrinks - Pepsi", 3, 33.99));
        // items.add(new Item("Flour - Atta", 1, 23.99));

        // Order order = new Order(1, "Ashish", items);
        // order.displayOrder();
        // OrderFileProcessor.serializeOrder(order);

        OrderFileProcessor.deSerializeOrder();
    }

}


final class OrderFileProcessor {

    public static void deSerializeOrder(){
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("orders_ser"))) {
            Order order = (Order) oin.readObject();
            order.displayOrder();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void serializeOrder(Order order) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("orders_ser"))) {
            oos.writeObject(order);            
        } catch (IOException e) {
            System.err.println("Serialization IO Error:" + e.getMessage());
        }
    }

    public static void processOrder(Order order) {
        try (PrintWriter out = new PrintWriter("orders")) {
            out.printf("Order Id: %d  %50s %n", order.getOrderId(), order.getCustomer());
            out.printf("%50s %n", "Items");
            for (Item item : order.getItems()) {
                out.printf("%20s %d %4.2f %4.2f %n", item.getName(), item.getQuantity(),
                        item.getPrice(), item.getTotalCost());
            }
            out.printf(
                    "============================================================================%n");
            out.printf("Net Total: %4.2f %n", order.getNetTotal());

        } catch (IOException e) {
            System.err.println("File IO Error:" + e.getMessage());
        } finally {
            System.out.println("Order processed successfully");
        }
    }

}


class Order implements Serializable {

    private int orderId;
    private String customer;
    // items
    private List<Item> items;
    private double netTotal;

    private transient LocalDate modifedDate;

    public Order(int orderId, String customer, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.netTotal = 0;
        for (Item item : items) {
            netTotal += item.getPrice();
        }
        this.modifedDate = LocalDate.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public LocalDate getModifedDate() {
        return modifedDate;
    }

    public void setModifedDate(LocalDate modifedDate) {
        this.modifedDate = modifedDate;
    }

    public void displayOrder() {
        System.out.printf("Order Id: %d  %50s %n", orderId, customer);
        System.out.printf("%50s %n", "Items");
        for (Item item : items) {
            System.out.printf("%20s %d %4.2f %4.2f %n", item.getName(), item.getQuantity(),
                    item.getPrice(), item.getTotalCost());
        }
        System.out.printf(
                "============================================================================%n");
        System.out.printf("Modified Date: %s %n", modifedDate.toString());
        System.out.printf("Net Total: %4.2f %n", netTotal);

    }


}


class Item implements Serializable {

    private String name;
    private int quantity;
    private double price;
    private double totalCost;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


}
