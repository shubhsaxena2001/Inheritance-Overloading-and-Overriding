package vehicles;

public class Vehicle {
    String color;
    String model;
    String regNo;
    int noOfWheels;
    int price;

    public Vehicle(String color, String model, int noOfWheels) {
        this.color = color;
        this.model = model;
        this.noOfWheels = noOfWheels;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public void displayVehicle(){
        System.out.println(
                "Model name: " + model
                + "\nNo. of wheels: " + noOfWheels
                + "\nRegistration number: " + regNo
                + "\nColor of the vehicle: " + color
                + "\nPrice: " + price
        );
        
        System.out.println("Model name: " + model);
        System.out.println("No. of wheels: " + noOfWheels);
        System.out.println("Registration number: " + regNo);
        System.out.println("Color of the vehicle: " + color);
        System.out.println("Price: " + price);
    }
}
