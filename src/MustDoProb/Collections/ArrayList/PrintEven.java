package MustDoProb.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PrintEven {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>();
        for (int i=0;i<=20;i++){
            s.add(i);
        }
        for(int num:s){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
