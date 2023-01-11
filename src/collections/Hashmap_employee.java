package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_employee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Database");
        System.out.println("How many employee data enter");
        int r =0;
        int data = scn.nextInt();
        HashMap<Integer , String> emp = new HashMap<>();
        for (int i = 0; i <data ; i++) {
            if(data == -1){
                break;
            }
            else {
                System.out.println("Enter id");
                Integer id = scn.nextInt();
                System.out.println("Enter Name");
                String name = scn.next();
                emp.put(id,name);
                r = emp.size();

            }


        }
        if(r != 0 ){
            System.out.println("list of id" +emp.keySet());
            System.out.println("fech id");
            int i = scn.nextInt();
            System.out.println(emp.get(i));
        }else{
            System.out.println("data is not prsent");
        }
    }
}
