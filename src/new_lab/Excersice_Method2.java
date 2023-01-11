package new_lab;

import java.util.Scanner;


public class Excersice_Method2 {
    private final static double PI = 3.14;
    public static void area(int n) {
        double area = PI * n * n;
        System.out.println("Area of Circle : "+area);
        square(area);
    }

    public static void square(double x){
        double side = x + x + x + x;
        System.out.println("sum of side :"+side);
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of radius :");
        int r = scn.nextInt();
        area(r);
    }




}
