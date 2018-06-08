package lottery;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LotteryTest {

    @Test
    public void testDraw(){
        Lottery lottery = new Lottery(90, 5);
        Random rnd = new Random(5);

        Set<Integer> set = lottery.draw(rnd);
        List<Integer> asserted = Arrays.asList(15, 18, 45, 67, 83);

        assertTrue(set.containsAll(asserted));
    }

    @Test
    public void testDrawSize(){
        Lottery lottery = new Lottery(90, 5);
        Random rnd = new Random();

        Set<Integer> set = lottery.draw(rnd);

        assertThat(set.size(), equalTo(5));
    }
}
