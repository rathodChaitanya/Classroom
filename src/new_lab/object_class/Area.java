package new_lab.object_class;
//1. Write a program to print the area of a rectangle by creating a class
//named 'Area' having two methods. First method named as 'setDim' takes
//length and breadth of rectangle as parameters and the second method
//named as 'getArea' returns the area of the rectangle. Length and breadth of
//rectangle are entered through keyboard.

import java.util.Scanner;

public class Area {

    static void setDim(int a,int b){
        int length = a;
        int breadth = b;
        getArea(length,breadth);
    }

    static int getArea(int length, int breadth){
        int result = length + breadth;
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter lenght : ");
        int a = scn.nextInt();
        System.out.println("Enter height");
        int b = scn.nextInt();
        setDim(a,b);
    }
}
