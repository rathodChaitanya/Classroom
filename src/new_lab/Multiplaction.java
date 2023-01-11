package new_lab;

import java.util.Scanner;

public class Multiplaction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first no :");
        double a = scn.nextInt();
        System.out.println("Enter second no :");
        double b = scn.nextInt();
        System.out.println("Enter Third no :");
        double c = scn.nextInt();
        System.out.println("Multiplication of a :"+ a +" , b :"+ b +" and  c :"+c+" is "+(a*b*c));
    }
}
