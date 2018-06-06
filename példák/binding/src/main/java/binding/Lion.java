package binding;

public class Lion extends Animal {

    private String food = "Bunny";

    public void dailyRoutine(){
        getUp();
        hunt();
        eat();
        relax();
    }

    public void hunt(){
        System.out.println("Hunt for gazelle");
    }

    public void relax() {
        System.out.println("Lion sleeps.");
    }
}
