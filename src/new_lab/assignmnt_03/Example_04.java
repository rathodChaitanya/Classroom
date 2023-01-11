package new_lab.assignmnt_03;

import java.util.Scanner;

public class Example_04 {
    static  int x = 0;
    public static void input(int a,int b){
        int c =a;
        int d =b;
        x = calculate(c,d);
    }

    public static int calculate(int e ,int f){
        int res = e / f;
        return res;
    }

    public static void output(int k){
        System.out.println("result :"+k);
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       try {
           System.out.println("Enter two no for division opertion");
           int a = scn.nextInt();
           int b = scn.nextInt();
           input(a, b);
           output(x);
       }catch (ArithmeticException are){
           System.out.println("Please enter valid no");
       }
    }
}
