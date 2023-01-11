package new_lab.object_class;

//Write a program to print the area of a rectangle by creating a class
//named 'Area' taking the values of its length and breadth as parameters of its
//constructor and having a method named 'returnArea' which returns the area
//of the rectangle. Length and breadth of rectangle are entered through
//keyboard.

import java.util.Scanner;

class Rectangle1{
    double lenght,breadth;
    public Rectangle1(double lenght,double breadth){
        this.breadth=breadth;
        this.lenght=lenght;
    }
    double Area(){
        double res = breadth * lenght;
        return  res;
    }
}

public class Example_07 {
    public static void main(String[] args) {
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("************** calculate area of rectangle **************");
        System.out.println();
        System.out.println("Enter breadth :- ");
        a = scn.nextInt();
        System.out.println("Enter lenght :- ");
        b = scn.nextInt();
        Rectangle1 r1 = new Rectangle1(a,b);
        System.out.println("result :- "+r1.Area());
    }
}

