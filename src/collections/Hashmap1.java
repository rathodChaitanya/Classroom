package collections;

import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        // for insert value for "put"
        hm.put("England" , "London");
        hm.put("Germany" , "Berlin");

        System.out.println(hm);

        //Access an item
        System.out.println("using key ");
        System.out.println(hm.get("Germany"));
        System.out.println("remove operation");
        hm.remove("Germany");
        System.out.println(hm.size());
        hm.put("Germany" , "Berlin");
        for (String i :hm.keySet()) {
            System.out.println(i +" "+hm.get(i)+" "+hm.size());
        }

    }
}
