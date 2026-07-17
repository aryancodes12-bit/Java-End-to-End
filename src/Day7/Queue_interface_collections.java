package Day7;
import java.util.*;
public class Queue_interface_collections {
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>();
       q.add(1);
        q.add(2);
        q.add(5);
        q.add(6);
        System.out.println(q);
        boolean num=q.remove(5);
        System.out.println("element "+num+ "is removed");
        System.out.println(q);
        int head =q.peek();
        System.out.println(head);
        System.out.println("queue size become "+q.size());

    }
}
