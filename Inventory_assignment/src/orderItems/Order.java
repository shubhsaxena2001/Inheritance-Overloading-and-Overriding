package orderItems;

import material.Accessory;
import material.Laptop;
import material.Laptops;

public class Order {
    String status;

    public Order() {
        this.status = "Ordering";
    }

    void placeOrder(String item, int orderQuantity) {
        if (item.equals("Laptop")) {
            int newQuantity = Laptops.quantity - orderQuantity;
            if(newQuantity < 0) System.out.println("Cannot place order");
            else if (newQuantity < Laptops.lowOrderLevelQuantity) System.out.println("RequestForMaterial (RFM) issued.");
            else {
                System.out.println("Invoice generated.");
                Laptops.quantity = newQuantity;
            }
        }
        else if (item.equals("Accessory")) {
            int newQuantity = Accessory.quantity - orderQuantity;
            if(newQuantity < 0) System.out.println("Cannot place order.");
            else if (newQuantity < Accessory.lowOrderLevelQuantity) System.out.println("RequestForMaterial (RFM) issued.");
            else {
                System.out.println("Invoice generated.");
                Accessory.quantity = newQuantity;
            }
        }
    }
}
