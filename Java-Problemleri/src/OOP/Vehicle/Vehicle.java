package OOP.Vehicle;

public class Vehicle {
    double speed = 100;

    void go() {
        System.out.println("This vehicle is moving!");
    }

    void stop() {
        System.out.println("This vehicle is stopped.");
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.go();
        vehicle1.speed = 100;
        System.out.println(vehicle1.speed);

        Car car1 = new Car();
        car1.stop();

        Bicycle bicycle1 = new Bicycle();
        bicycle1.speed = 30;
        System.out.println(bicycle1.speed);

        System.out.println(car1.whellCount + " " + bicycle1.pedalCount);
    }
}
