package collections;
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> fruitNames = new HashSet<String>();
        ArrayList<String> fruitsToCheck = new ArrayList<>();
        fruitsToCheck.add("apple");
        fruitsToCheck.add("Mango");
        fruitsToCheck.add("Banana");
        HashSet<String> fruitClone = null;
        fruitNames.add("apple");
        fruitNames.add("Mango");
        fruitNames.add("Grapes");
        fruitNames.add("Orange");
        fruitNames.add("Fig");
        fruitNames.add("apple");
        fruitNames.add("Mango");
        fruitNames.add("Grapes");
        fruitNames.add("Orange");
        fruitNames.add("Fig");
        fruitNames.add(null);
        System.out.println("Original HashSet:"+fruitNames);
        //fruitNames.addAll(fruitsToCheck);
        //System.out.println("After Add All:"+fruitNames);
        System.out.println("checking is HashSet contains apple");
        System.out.println(fruitNames.contains("apple"));
        System.out.println("checking is HashSet contains apple, Mango");
        System.out.println(fruitNames.containsAll(fruitsToCheck));
        System.out.println("IsEmpty output:"+fruitNames.isEmpty());
        System.out.println("List before removal:"+fruitNames);
        System.out.println("Remove apple");
        fruitNames.remove("apple");
        //fruitNames.remove(0);
        System.out.println("List after removal: "+fruitNames);
        System.out.println("Removing multiple elements: "+fruitsToCheck);
        fruitNames.removeAll(fruitsToCheck);
        System.out.println("After removal: "+fruitNames);
        fruitNames.remove(0);
        System.out.println("No change After removal in case of HashSEt: "+fruitNames);
        /*
        fruitClone = (HashSet<String>)fruitNames.clone();
        System.out.println("Fruit Clone:"+fruitClone);
        fruitNames.clear();
        System.out.println("After Clear Operation:"+fruitNames);
        */
    }
}
