package vehicles;

public class Truck extends Vehicle{

    int capacity;
    String permitType;


    public Truck(String color, String model, int numberOfWheels, int capacity, String permitType) {
        super(color, model, numberOfWheels);
        this.capacity = capacity;
        this.permitType = permitType;
        
    }

    public void display(){
        System.out.println("Truck details are: ");
        displayVehicle();
        
        System.out.println("Capacity of the truck: " + capacity);
        System.out.println("Permit area: " + permitType);
    }
}
