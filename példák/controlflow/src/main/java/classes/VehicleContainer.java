package classes;

public class VehicleContainer {

    public static void main(String[] args) {
        Car car = new Car(20, 30, 0, "ABC-123");
        car.accelerate(10);
        Vehicle vehicle = new Car(10, 30, 1, "CDF-345");
        vehicle = new Bicycle(10, 20, 30);
        if(vehicle instanceof Car){
            ((Car) vehicle).fill(20);
        }

    }
}
