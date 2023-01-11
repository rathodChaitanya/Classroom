package Lab;
import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        //initilation of array
        for (int i = 0 ; i< arr.length ; i++){
            System.out.println("Enter no : ");
            int r = scn.nextInt();
            arr[i]=r;
        }


        //Display array

//        for (int i = 0 ; i< arr.length ; i++){
//            System.out.println("Display : "+arr[i]);
//        }

        for (int t:arr) {
            System.out.println(t);
        }

    }
}
