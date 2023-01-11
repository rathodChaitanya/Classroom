package new_lab.methods;

import java.util.Scanner;

public class Display {

    public static void print(int arr[]){
        for (int ele : arr) {
            System.out.println(ele+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter No upto 10 : ");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        print(arr);
    }
}
