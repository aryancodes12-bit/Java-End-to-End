package MustDoProb.Collections.ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> s=new java.util.ArrayList<>();
s.add("Aryan");
        s.add("Aryan");
        s.add("Eklavya");
        s.add("Shivam");
        s.add("Ayan");
   s.set(2,"Aarohi");
   s.removeLast();
        System.out.println(s);
    }
}
