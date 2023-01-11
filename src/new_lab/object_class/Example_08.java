package new_lab.object_class;

import java.util.Scanner;

//Print the average of three numbers entered by user by creating a class
//named 'Average' having a method to calculate and print the average.
class Average{
    double res;
    void calculate(int a,int b,int c){
         res = (a+b+c)/3;
    }
    void print (){
        System.out.println("result :- "+res);
    }
}


public class Example_08 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("************** calculate  average of three numbers **************");
        System.out.println();
        System.out.println("Enter first no :- ");
        a = scn.nextInt();
        System.out.println("Enter second no :- ");
        b = scn.nextInt();
        System.out.println("Enter third no :- ");
        c = scn.nextInt();
        Average a1 = new Average();
        a1.calculate(a,b,c);
        a1.print();
    }
}
