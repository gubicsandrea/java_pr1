package classes;

public class Car extends Vehicle{
    private String registrationNumber;
    private double fuelLevel;
    private double maxFuelLevel;

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car(int positionX, int positionY, int speed, String registrationNumber) {
        super(positionX, positionY, speed);
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void fill(){
        fuelLevel = maxFuelLevel;
    }

    public void fill(double fuel){
        if(fuelLevel + fuel >= maxFuelLevel) {
            fuelLevel = maxFuelLevel;
        } else {
            fuelLevel += fuel;
        }
    }
}
