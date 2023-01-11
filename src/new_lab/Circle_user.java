package new_lab;

import java.util.Scanner;

public class Circle_user {
        private static final double radius = 7.5;

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Enter redius :");
            int radius = scn.nextInt();
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }

}
