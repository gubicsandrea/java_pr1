package controlflow;

public class Characters {

    private char c;
    private int number;
    private static int count = 0;

    public Characters(char c, int number) {
        if(validateNumberParameter(number)) {
            this.c = c;
            this.number = number;
            count++;
        } else {
            throw new IllegalArgumentException("Rossz a paraméter, csak pozitív szám lehet");
        }
    }

    public String print(){
        String str = "";
        for (int i = 0; i < number; i++) {
            str += c;
        }
        return str;
    }

    private boolean validateNumberParameter(int n){
        return n > 0;
    }

    public char getC() {
        return c;
    }

    public int getNumber() {
        return number;
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "c=" + c +
                ", number=" + number +
                '}';
    }
}
