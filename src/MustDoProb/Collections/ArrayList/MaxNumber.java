package MustDoProb.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>();
        s.add(45);
        s.add(78);
        s.add(14);
        s.add(6);
        int max=s.get(0);
        for(int e:s){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
