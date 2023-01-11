package new_lab.assignmnt_03;

import java.util.Scanner;

public class Example_03 {
    static Scanner scn = new Scanner(System.in);

    public static void sum_10(){
        int sum = 0;
        for (int i = 0; i <=10 ; i++) {
            sum+=i;
        }
        System.out.println("sum of 1 to 10 is "+sum);
    }

    public static void sum_n(){
        int sum = 0;
        //Scanner scn = new Scanner(System.in);
        System.out.println("Enter n no : ");
        int n = scn.nextInt();
        for (int i = 0; i <=n ; i++) {
            sum+=i;
        }
        System.out.println("sum of 1 to n is "+sum);
    }

    public static void sumofsquare(){
        int sum = 0;
        //Scanner scn = new Scanner(System.in);
        System.out.println("Enter n no : ");
        int n = scn.nextInt();
        for (int i = 0; i <=n ; i++) {
            sum+=(i*i);
        }
        System.out.println("sum of 1 to n is "+sum);
    }

    public static void main(String[] args) {
        System.out.println("choose no for you want operation");
        System.out.println("1. Sum of 1st 10 nos.");
        System.out.println("2. Sum of 1st ’n’ nos");
        System.out.println("3. Sum of the squares of 1st ’n’ nos");
        //Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        switch (n){
            case 1 :
                sum_10();
                break;
            case 2 :
                sum_n();
                break;
            case 3 :
                sumofsquare();
                break;
            default:
                System.out.println("invalid choice");
        }

    }
}
