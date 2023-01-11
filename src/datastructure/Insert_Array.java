package datastructure;

import java.util.Scanner;

public class Insert_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scn.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter value upto "+size);
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element which you want enter");
        int ele = scn.nextInt();
        arr[size]=ele;
        System.out.println("Ater inserting element");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println(arr[size]+"hey i am there");
    }
}
