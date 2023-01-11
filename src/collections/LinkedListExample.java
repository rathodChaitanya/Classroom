package collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {
        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();
        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add(2,"F");
        linkedList.addFirst("H");
        linkedList.addLast("Z");
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println("List after removing Element at index 0: "+linkedList);
        linkedList.remove("Z");
        System.out.println("After removing Z"+linkedList);
        linkedList.add("L");
        linkedList.add("C");
        linkedList.add("C");
        linkedList.add("G");
        System.out.println("After adding more elements: "+linkedList);
        System.out.println("Last index of C:"+linkedList.lastIndexOf("C"));
        System.out.println("LinkedList:"+linkedList);
        LinkedList<String> clonedList = (LinkedList<String>) linkedList.clone();
        System.out.println("Cloned List:"+clonedList);
        System.out.println("Head of the list:"+linkedList.element());
        linkedList.offer("R");
        System.out.println("Added element at the Tail:"+linkedList);
        linkedList.offerFirst("E");
        linkedList.offerLast("Z");
        System.out.println("After modifying the Head and Tail of the list:");
        System.out.println(linkedList);
        System.out.println("Pop output:"+linkedList.pop());
        System.out.println("List after pop: "+linkedList);
        linkedList.push("L");
        System.out.println("List after push(L)"+linkedList);
        linkedList.add("L");
        System.out.println("List after add(L)"+linkedList);
        linkedList.removeLastOccurrence("C");
        System.out.println("Removed last occurrence of C: "+linkedList);
        linkedList.removeLast();
        System.out.println("After remove Last: "+linkedList);
        Object[] myArray = linkedList.toArray();
        for(Object elem: myArray)
            System.out.print(elem+" ");

    }
}
