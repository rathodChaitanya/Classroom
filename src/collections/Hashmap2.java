package collections;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap<String , Integer> age = new HashMap<>();
        age.put("John",32);
        age.put("Steve",30);
        age.put("Angie",33);

        System.out.println(age.isEmpty());
        System.out.println(age.keySet());
        System.out.println(age.clone());
        System.out.println(age.replace("John",32,40));
        System.out.println(age.putIfAbsent("Steve",30));
        System.out.println(age.values());
       // System.out.println(age.toString());

        for (String s :age.keySet()) {
            System.out.println("NAME "+s +" AGE "+age.get(s));
        }
    }
}
