package Practice;

import java.util.Scanner;
public class TryClass4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {

            int c =a/b;
            System.out.println("Div is " +c);
        }
        catch(Exception e) {
            System.out.println("input is Wrong");
        }
        finally {
            System.out.println("it is running");
        }
    }
}