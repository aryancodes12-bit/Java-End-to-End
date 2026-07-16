package Day7;

import java.util.ArrayList;

public class cwh_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        li2.add(15);
        li2.add(25);
        li2.add(65);
        li.add(5);
        li.add(7);
        li.add(2);
        li.add(6);
        li.add(9);
       li.addAll(li2);
        System.out.println(li.contains(9));
        System.out.println(li.isEmpty());
        System.out.println(li.indexOf(5));
//        for(int i=0;i<li.size(); i++){
//            System.out.print(li.get(i));
//            System.out.print(",");
//        }
        System.out.println(li);
    }
}
