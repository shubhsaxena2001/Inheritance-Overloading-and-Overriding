package orderItems;

import material.*;
import java.util.*;
import stock.Inventory;


public class OrderDriver {
    public static void main(String[] args) {
        List<Inventory> l = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
        	l.add(new Laptops());
        }
        	
        for(int i = 0; i < 10; i++) {
        	l.add(new Accessory());
        }
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 1 for ordering laptop, 2 for accessory and 0 for exit:");
            
            int input = sc.nextInt();
            if (input == 0) {
            	break;
            }
            
            else if(input == 1) {
            	System.out.println("Enter quantity :");
                int qty = sc.nextInt();               
                Order ord = new Order();
            	ord.placeOrder("Laptop", qty);
            }
            
            else if(input == 2) {
            	System.out.println("Enter quantity :");
                int qty = sc.nextInt();               
                Order ord = new Order();
            	ord.placeOrder("Accessory", qty);
            }
            
            else System.out.println("Enter valid choice.");
        } while(true);
    }
}

