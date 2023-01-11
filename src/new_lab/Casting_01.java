package new_lab;
/*Write a Program to take user input a double data type,, then cast it into different data types, using the different methods.*/
import java.util.Scanner;

public class Casting_01 {


    public static double input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no");
        double a = scn.nextDouble();
        return a;
    }

    public static void cast(double x){

        System.out.println("Ater casting :- "+(int)x);
    }

    public static void main(String[] args) {
        System.out.println("main start");
        double x =input();
        System.out.println("before casting :- "+x);
        cast(x);
        System.out.println("main end");
    }
}
