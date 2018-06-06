package controlflow;

public class MinMax {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Hiba. Nincs elég paraméter.");
        } else {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            if(num1 < num2) {
                System.out.println("A nagyobb szám a(z) " + num2);
            } else if(num1 == num2) {
                System.out.println("Egyenlők.");
            } else {
                System.out.println("A nagyobb szám a(z) " + num1);
            }
        }
    }
}
