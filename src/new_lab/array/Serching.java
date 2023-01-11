package new_lab.array;

import java.util.Scanner;

//Write a Program to find or search a particular element from an array
public class Serching {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,5,6,7,8};
        int n = 1;
        boolean b =false;

        for (int i=0; i < arr.length; i++) {

            if(n == arr[i]) {
                System.out.println(n + " NO is present ");
                b = true;
                break;
            }

        }
        if(b==false) {
            System.out.println("No is not present in this array");
        }

    }
}
