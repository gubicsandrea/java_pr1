package classes;

public abstract class Vehicle {
    private int positionX;
    private int positionY;
    private int speed;

    public Vehicle() {
    }

    protected Vehicle(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(int deltaX, int deltaY){
        positionX += deltaX;
        positionY += deltaY;
    }

    public void accelerate(){
        speed++;
    }

    public void accelerate(int deltaSpeed){
        speed += deltaSpeed;
    }
}
