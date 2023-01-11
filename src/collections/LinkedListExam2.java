package collections;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class LinkedListExam2 {
    public static void main(String args[]) {
        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();
        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add(2, "F");
        linkedList.addFirst("H");
        linkedList.addLast("Z");
        System.out.println(linkedList);
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println("Elem "+iterator.next());
        }
    }
}
