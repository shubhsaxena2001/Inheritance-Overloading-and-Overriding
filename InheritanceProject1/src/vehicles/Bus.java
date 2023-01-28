package vehicles;

public class Bus extends Vehicle {

    String coachType;
    int numberOfSeats;
    public Bus(String color, String model, int numberOfWheels, String coachType, int numberOfSeats) {
        super(color, model, numberOfWheels);
        this.coachType = coachType;
        this.numberOfSeats = numberOfSeats;
    }

    public void display(){
        System.out.println("Bus details are: ");
        displayVehicle();

        System.out.println("Coach type: " + coachType);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
