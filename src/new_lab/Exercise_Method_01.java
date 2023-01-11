package new_lab;

import java.util.Scanner;

public class Exercise_Method_01 {

    public static void sum(int a,int b){
        int no = a + b;
        System.out.println("the sum of a : "+ a +" and b : "+b+ " is "+no);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First No :");
        int n1 = scn.nextInt();
        System.out.println("Enter Second No :");
        int n2 = scn.nextInt();
        sum(n1,n2);
    }
}
