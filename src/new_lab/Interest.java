package new_lab;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        double p = scn.nextInt();
        System.out.println("Enter time in yeaars :");
        double n = scn.nextInt();
        System.out.println("Enter Rate of Interest :");
        double r = scn.nextInt();
        double a = (p*n*r)/100;
        System.out.println("Amount :"+a);
    }
}
