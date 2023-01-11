package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        int[] myIntArray = new int[5];//array of 5 integers
        myIntArray[0]=1;
        myIntArray[1]=2;
        myIntArray = new int[10];
        myIntArray[0]=1;
        myIntArray[1]=2;
        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<String> studentNames2 = new ArrayList<String>();
        ArrayList<Integer> studentAges = new ArrayList<Integer>();
        studentAges.add(13);
        studentAges.add(23);
        studentAges.add(3);
        studentNames2.add("Ritu");
        //ArrayList<int>studentAge =
        studentNames.add("Ritu");
        studentNames.add("Ritu");
        //studentNames2 = studentNames;
        studentNames.add("Ajay");
        studentNames.add(0,"Supervisor");
        studentNames.addAll(2,studentNames2);
        //System.out.println(studentNames.get(0));
        //System.out.println("ArrayList Elements:");
        /*for(int i=0; i<studentNames.size(); i++){
            System.out.print(studentNames.get(i)+" ");
        }*/
        //System.out.println();
        System.out.println("Before Sort:"+studentNames);
        //System.out.println(myIntArray);
        //studentNames.remove(1);
        //studentNames.remove("Supervisor");
        //studentNames.removeAll(studentNames2);
        //System.out.println(studentNames);
        //System.out.println(studentNames.indexOf("Ajay"));
        Collections.sort(studentNames);
        System.out.println("After Sort:"+studentNames);
        Collections.swap(studentNames,0,3);
        System.out.println("After Swap:"+studentNames);
        Collections.shuffle(studentNames);
        System.out.println("Shuffle O/p:"+studentNames);
        System.out.println();
        System.out.println();
        System.out.println("Original Int Array List:"+studentAges);
        Collections.sort(studentAges);
        System.out.println("After Sort:"+studentAges);
        System.out.println("Student ages:");
        for(Integer elem: studentAges){
            System.out.print(elem+" ");
        }
        String[] newStudentNames = {"Ritu", "Rohit", "Soban", "Harshada"};
        for (String elem: newStudentNames){
            studentNames.add(elem);
        }


    }
}
