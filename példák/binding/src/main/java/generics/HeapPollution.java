package generics;

import java.util.ArrayList;
import java.util.List;

public class HeapPollution {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List l2 = l;
        List<Integer> l3 = l2; // Unchecked assignment
        l3.add(1);
        System.out.println(l.get(0));
    }
}
