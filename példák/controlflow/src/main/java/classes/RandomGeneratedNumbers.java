package classes;

import java.util.Arrays;
import java.util.Random;

public class RandomGeneratedNumbers {

    private static final int[] randomNumbers;

    static {
        Random rnd = new Random();
        int elemszam = rnd.nextInt(20) + 5;
        randomNumbers = new int[elemszam];
        for (int i = 0; i < elemszam; i++){
            randomNumbers[i] = rnd.nextInt(10);
        }
    }

    public static void printNumbers(){
        System.out.println(Arrays.toString(randomNumbers));
    }

    public static void main(String[] args) {
        printNumbers();
    }
}
