package MustDoProb.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(45);
        s.add(78);
        s.add(14);
        s.add(6);
        for (int i = s.size()-1;i>=0; i--) {
            System.out.println(s.get(i));
        }
    }
}
