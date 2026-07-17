package Day7;

import java.util.HashSet;

public class cwh_95_hashset {
    public static void main(String[] args) {
        HashSet<Integer> h= new HashSet<>(16,0.75f);
        h.add(4);
        h.add(7);
        h.add(8);
        h.add(1);
        System.out.println(h);
        h.clear();
        System.out.println(h);
    }
}
