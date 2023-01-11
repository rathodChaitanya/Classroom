package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashExample {
    public static void main(String args[]) {
// LinkedHashSet of String Type
        HashSet<String> lHset = new LinkedHashSet<String>();
        lHset.add("Z");
        lHset.add("PQ");
        lHset.add("N");
        lHset.add("O");
        lHset.add("KK");
        lHset.add("FGH");
        System.out.println(lHset);
        System.out.println(lHset);
        HashSet<String> clonedLHset = (LinkedHashSet<String>)lHset.clone();
        System.out.println("Cloned LinkedHashSet:"+clonedLHset);
        TreeSet<String> sortedSet = new TreeSet<String>();
        sortedSet.addAll(clonedLHset);
        System.out.println("Tree Set:"+sortedSet);
        sortedSet.add("Ritu");
        System.out.println("After adding new elem in Tree Set:"+sortedSet);
    }
}
