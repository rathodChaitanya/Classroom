package new_lab;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter height :");
        int h = scn.nextInt();
        System.out.println("Enter base :");
        int b = scn.nextInt();
        double area = (b*h) / 2 ;
        System.out.println("the area of a triangle "+area);
    }
}
