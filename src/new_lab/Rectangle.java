package new_lab;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length :");
        int l = scn.nextInt();
        System.out.println("Enter base :");
        int b = scn.nextInt();
        double area = l*b ;
        System.out.println("the area of a rectangle "+area);
    }
}
