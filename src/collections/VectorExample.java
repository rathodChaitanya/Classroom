package collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String args[]) {
//Create a vector
        Vector<String> vec = new Vector<String>(3);
//Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        System.out.println("Capacity:"+vec.capacity());//3
        vec.add("Dog");
        System.out.println("Capacity:"+vec.capacity());//3
        vec.add("Elephant");
        System.out.println("Capacity:"+vec.capacity());//6
        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        System.out.println("Capacity:"+vec.capacity());//12
        vec.addElement("Bird");
        System.out.println("Capacity: "+vec.capacity());//12
        System.out.println("Size: "+vec.size());// 8 elements
        System.out.println(vec);
        vec.trimToSize();//12-4(empty) = 8
        System.out.println("Capacity after trim:"+vec.capacity());
        List<String> myList= vec.subList(0,4);
        System.out.println("Sublist:"+myList);
    }
}
