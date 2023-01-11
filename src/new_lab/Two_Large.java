package new_lab;

import java.util.Scanner;

public class Two_Large {
    public static void main(String[] args)
    {
        int a, b, n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();

        n = (a>b) ? a : b;
        System.out.println("\nLargest = " +b);
    }
}
