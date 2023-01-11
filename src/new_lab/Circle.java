package new_lab;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter redius :");
        int r = scn.nextInt();
        final double i = 3.14;
        double j = i*(r*r);
        System.out.println(" the area of a circle "+ j);
    }
}
