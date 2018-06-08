package lottery;

import java.util.Random;

public class LotteryMain {

    public static void main(String[] args) {
        Lottery lottery = new Lottery(90, 5);
        System.out.println(lottery.draw());
    }
}
