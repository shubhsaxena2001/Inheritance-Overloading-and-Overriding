package vehicles;

public class Car extends Vehicle {

    String bodyType;
    String engineType;
    int airbagCount;

    public Car(String color, String model, int numberOfWheels, String bodyType, String engineType, int numberOfAirbags) {
        super(color, model, numberOfWheels);
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.airbagCount = numberOfAirbags;
    }

    public void display(){
        System.out.println("Car details are: ");
        displayVehicle();
        
        System.out.println("body type: " + bodyType);
        System.out.println("engine type: " + engineType);
        System.out.println("number of airbags: " + airbagCount);
    }
}
