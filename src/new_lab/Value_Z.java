package new_lab;

import java.util.Scanner;

public class Value_Z {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x no :");
        int x = scn.nextInt();
        System.out.println("Enter y no :");
        int y = scn.nextInt();
        int b =x+y;
        System.out.println("Sum of x :"+ x +" and y :"+ y +" is "+b);
        System.out.println("Enter a no :");
        int a = scn.nextInt();
        int z = a*b;
        System.out.println("Value of Z " + z);
    }
}
