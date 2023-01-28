package vehicles;

public class Road {
    public static void main(String[] args){
    	
        Car c = new Car("Silver", "Swift", 4, "Hatch Back", "Diesel engine", 4);
        c.setPrice(650000);
        c.setRegNo("MP045314");
        c.display();
        System.out.println();

        Bus b = new Bus("Yellow", "TATA Motors", 6, "School Bus", 19);
        b.setPrice(3600000);
        b.setRegNo("MP046314");
        b.display();
        System.out.println();

        Truck t = new Truck("Black", "Toyota", 8, 2, "State permit");
        t.setPrice(1800000);
        t.setRegNo("MP049898");
        t.display();
    }
}
