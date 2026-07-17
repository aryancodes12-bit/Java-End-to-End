package Day7;

import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.add(5);
        ad.add(15);
        ad.add(51);
        ad.add(35);
        ad.getLast();
        ad.addLast(777);
        System.out.println(ad);
        System.out.println(ad.getFirst());
    }
}
