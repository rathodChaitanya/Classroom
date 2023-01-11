package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String args[]){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("By element-head:"+queue.element());
        System.out.println("By Peek - head:"+queue.peek());
        System.out.println("queue:"+queue);
        queue.offer("Jai");
        System.out.println("queue:"+queue);
        queue.offer("Vijay");
        System.out.println("queue:"+queue);
        queue.add("Ritu");
        System.out.println(queue);

        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        queue.remove();
        System.out.println(queue.peek());
        String temp = queue.peek();
        //queue.removeIf(temp.equals("Jai"));
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }


    }
}
