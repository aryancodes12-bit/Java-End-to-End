package Day7;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class TreeSet_collections {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
h.add(4);
        h.add(1);
        h.add(66);
        h.add(9);
        TreeSet<Integer> t= new TreeSet<>(h); //sorts the list
        System.out.println(t);
 int []arr={4,8,9,6,5};
Set<Integer> s=new HashSet<>();
for (int i=0;i< 5;i++){
   s.add(arr[i]);
}
        TreeSet<Integer> sortedSet = new TreeSet<>(s);
        System.out.println(sortedSet);
    }
}
