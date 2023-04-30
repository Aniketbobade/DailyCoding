package codes.OOPs;
 class Vehicle {
    private int numWheels;
    private String color;

    public Vehicle(int numWheels, String color) {
        this.numWheels = numWheels;
        this.color = color;
    }

    public void start() {
        System.out.println("Starting vehicle...");
    }

    public void stop() {
        System.out.println("Stopping vehicle...");
    }
}

 class Car extends Vehicle {
    private String make;
    private String model;

    public Car(int numWheels, String color, String make, String model) {
        super(numWheels, color);
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving car...");
    }
}

public class InhertanceInOOPs {
    public static void main(String[] args) {

            Car car = new Car(4, "Red", "Honda", "Civic");
            car.start();
            car.drive();
            car.stop();

    }
}
