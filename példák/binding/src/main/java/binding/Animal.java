package binding;

public class Animal {

    private String food = "Grass";

    public void dailyRoutine(){
        getUp();
        eat();
        relax();
    }

    public void getUp(){
        System.out.println("Animal get up");
    }

    public void eat(){
        System.out.println("Animal eat " + food);
    }

    public void relax() {
        System.out.println("Animal sleep");
    }
}
