package new_lab;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first no :");
        int a = scn.nextInt();
        System.out.println("Enter second no :");
        int b = scn.nextInt();
        System.out.println("Sum of a :"+ a +" and b :"+ b +" is "+(a+b));
    }
}
