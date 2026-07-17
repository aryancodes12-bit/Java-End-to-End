package Day7;

import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
       LinkedList<Integer> li=new LinkedList<>();
        LinkedList<Integer> li2=new LinkedList<>();
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
        System.out.println("before adding element at first ");
        System.out.println(li);
        System.out.println("after adding element at first ");
        li.addLast(45);
        System.out.println(li);
    }
}

