package new_lab.object_class;
import java.lang.Math;

//Write a program to print the area and perimeter of a triangle having
//sides of 3, 4 and 5 units by creating a class named 'Triangle' with
//constructor having the three sides as its parameters.

class Triangle1{
    double a,b,c;

    public Triangle1(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter(){
        return (a+b+c)/2.0;
    }
}

class Example_05{
    public static void main(String[] args){
        Triangle1 t = new Triangle1(2,5,6);
        System.out.println(t.getArea());
        System.out.println(t.getPerimeter());
    }
}