package controlflow;

public class ParameterAtadas {

    public static void main(String[] args) {
        int x = 10;
        increaseNumber(x);
        System.out.println(x);
        Characters characters = new Characters('s', 5);
        System.out.println(characters);
        changeNumber(characters);
        System.out.println(characters);
        String a = new String("Alma");
        concat(a);
        System.out.println(a);
    }

    public static void increaseNumber(int a){
        a++;
    }

    public static void changeNumber(Characters chars) {
        chars.setNumber(8);
    }

    public static void concat(String str) {
        str = str + "!";
    }
}
