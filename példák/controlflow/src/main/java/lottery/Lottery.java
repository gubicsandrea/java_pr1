package lottery;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

    private int maxNumber;
    private int count;

    public Lottery(int maxNumber, int count) {
        if(maxNumber < 1){
            throw new IllegalArgumentException("Max number cannot be less than 1");
        }
        if(count >= maxNumber){
            throw new IllegalArgumentException("Count cannot be greater than or equal to maxNumber");
        }
        this.maxNumber = maxNumber;
        this.count = count;
    }

    public Set<Integer> draw(Random random) {
        Set<Integer> numbers = new TreeSet<>();
        Random rnd = random;
        while(numbers.size() < count) {
            numbers.add(rnd.nextInt(maxNumber) + 1);
        }
        return numbers;
    }

    public Set<Integer> draw() {
        Set<Integer> numbers = new TreeSet<>();
        Random rnd = new Random();
        while(numbers.size() < count){
            numbers.add(rnd.nextInt(maxNumber) + 1);
        }
        return numbers;
    }
}
