package new_lab;

import java.util.Scanner;

/*Write a Program to show any computation or calculation using the concept of wrapper class, here u have to use separate methods for input and calculation*/
public class WrapperClass_01 {
    Integer a,b;
    void input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two no :-");
        a = scn.nextInt();
        b = scn.nextInt();
    }

    Integer calculation(){
        Integer r = a * b;
        return r;
    }


    public static void main(String[] args) {
        WrapperClass_01 w = new WrapperClass_01();
        w.input();
        Integer e =w.calculation();
        System.out.println("answer :- "+e);
    }
}
