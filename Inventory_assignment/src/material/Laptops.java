package material;

import stock.Inventory;

public class Laptops extends Inventory {
    public static int quantity;
    public static int lowOrderLevelQuantity;

    static {
        Laptops.quantity = 0;
        Laptops.lowOrderLevelQuantity = 3;
    }

    public String model;
    public int id;

    public Laptops() {
        model = "Dell";
        id = Laptops.quantity++;
    }
}
