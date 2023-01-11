package new_lab.array;

import java.util.Scanner;

//1. Write a Program to store any ten numbers from the user and display them.
public class Display {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int []arr = new int[10];
        System.out.println("Enter No upto 10 : ");



        for (int i = 0; i < arr.length; i++) {
            arr[i] =  scn.nextInt();
        }

        for (int ele : arr) {
            System.out.println(ele+" ");
        }
    }
}
